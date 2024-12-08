package kr.co.neighbor21.weirdoanimalbe.domain.admin.record;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "유저 정보 삭제 요청")
public record UserDeleteRequest(
        @Schema(description = "유저 아이디", example = "user1")
        String userId
) {
}
