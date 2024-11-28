package kr.co.neighbor21.weirdoanimalbe.domain.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    /* 유저 프로필 용 개별 조회 필요 */
    public void getUserProfile() {
        // String userId = CommonUtils.getUserId();
        // userRepository.findById(userId).orElseThrow(() -> new NotFoundException("해당 유저를 찾을 수 없습니다."))
    }
}
