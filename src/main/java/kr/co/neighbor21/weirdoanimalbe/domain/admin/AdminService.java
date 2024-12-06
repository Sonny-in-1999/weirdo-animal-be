package kr.co.neighbor21.weirdoanimalbe.domain.admin;

import kr.co.neighbor21.weirdoanimalbe.domain.common.record.GridResponse;
import kr.co.neighbor21.weirdoanimalbe.domain.common.record.ItemResponse;
import kr.co.neighbor21.weirdoanimalbe.domain.admin.record.UserDeleteRequest;
import kr.co.neighbor21.weirdoanimalbe.domain.admin.record.UserDetailSearchRequest;
import kr.co.neighbor21.weirdoanimalbe.domain.admin.record.UserDetailSearchResponse;
import kr.co.neighbor21.weirdoanimalbe.domain.admin.record.UserListSearchRequest;
import kr.co.neighbor21.weirdoanimalbe.domain.admin.record.UserListSearchResponse;
import kr.co.neighbor21.weirdoanimalbe.domain.user.UserMapper;
import kr.co.neighbor21.weirdoanimalbe.domain.user.UserRepository;
import kr.co.neighbor21.weirdoanimalbe.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AdminService {

    private final UserRepository userRepository;
    private final UserMapper userMapper = UserMapper.INSTANCE;


    /* 유저 프로필 용 개별 조회 필요 */
    public void getUserProfile() {
        // String userId = CommonUtils.getUserId();
        // userRepository.findById(userId).orElseThrow(() -> new NotFoundException("해당 유저를 찾을 수 없습니다."))
    }


    /* 유저 개별 조회*/
    public ItemResponse<UserDetailSearchResponse> getSearchUserDetail(UserDetailSearchRequest request) throws NotFoundException {
        User user = userRepository.findById(request.userId())
                .orElseThrow(() -> new NotFoundException());
        UserDetailSearchResponse response = userMapper.toDetailResponse(user);

        return ItemResponse.<UserDetailSearchResponse>builder()
                .status("OK")
                .message("데이터를 조회 하는데 성공하였습니다.")
                .data(response)
                .build();
    }

    /* 유저 목록 조회(페이지네이션 필요, 회원가입 내림차순 정렬) */
    public GridResponse<UserListSearchResponse> getSearchUserList(UserListSearchRequest request) {
        Pageable pageable = PageRequest.of(request.pageNo(), request.pageSize());
        Page<User> userList = userRepository.findAllByOrderByCreateDateDesc(pageable);

        List<UserListSearchResponse> responseList = userMapper.toListResponse(userList.toList());

        return GridResponse.<UserListSearchResponse>builder()
                .status("OK")
                .message("유저 목록 조회에 성공했습니다.")
                .totalSize(userList.getTotalElements())
                .totalPageSize(userList.getTotalPages())
                .size(userList.getNumberOfElements())
                .items(responseList)
                .build();
    }

    /* 유저 삭제 */
    public ItemResponse<String> deleteUser(UserDeleteRequest request) {
        userRepository.deleteById(request.userId());

        return ItemResponse.<String>builder()
                .status("OK")
                .message("유저 정보를 삭제하는데 성공했습니다.")
                .data("")
                .build();
    }
}
