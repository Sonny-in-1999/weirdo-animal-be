package kr.co.neighbor21.weirdoanimalbe.domain.user;

import kr.co.neighbor21.weirdoanimalbe.domain.admin.record.UserDetailSearchResponse;
import kr.co.neighbor21.weirdoanimalbe.domain.admin.record.UserListSearchResponse;
import kr.co.neighbor21.weirdoanimalbe.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    /* 유저 상세 정보 응답 객체 매퍼 */
    UserDetailSearchResponse toDetailResponse(User entity);


    /* 유저 목록 응답 객체 매퍼 */
    List<UserListSearchResponse> toListResponse(List<User> entityList);
}
