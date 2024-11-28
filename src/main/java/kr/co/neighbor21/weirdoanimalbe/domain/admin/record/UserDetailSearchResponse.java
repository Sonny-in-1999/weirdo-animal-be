package kr.co.neighbor21.weirdoanimalbe.domain.admin.record;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDate;

@Schema(description = "유저 개별 정보 조회 응답")
public record UserDetailSearchResponse(
        @Schema(name = "유저 아이디", example = "user1")
        String userId,

        @Schema(name = "이메일", example = "example@neighbor21.co.kr")
        String email,

        @Schema(name = "닉네임", example = "nickname1")
        String nickName,

        @Schema(name = "자기소개", example = "잘부탁드립니다.")
        String bio,

        @Schema(name = "생일", example = "2001-01-01")
        LocalDate birthday,

        @Schema(name = "회원가입일", example = "2024-11-22")
        LocalDate createDate,

        @Schema(name = "프로필 사진", example = "프사가 들어가용")
        byte[] profileImg
) {
}
