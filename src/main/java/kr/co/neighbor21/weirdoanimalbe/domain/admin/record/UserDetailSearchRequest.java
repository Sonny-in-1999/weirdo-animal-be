package kr.co.neighbor21.weirdoanimalbe.domain.admin.record;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "유저 개별 정보 조회 요청")
public record UserDetailSearchRequest(
        @Schema(description = "유저 아이디", example = "user1")
        String userId
) {
}

