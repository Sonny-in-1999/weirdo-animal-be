package kr.co.neighbor21.weirdoanimalbe.domain.admin.record;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Schema(description = "유저 목록 조회 요청")
public record UserListSearchRequest(
        @Schema(description = "페이지 번호", example = "0")
        @NotNull
        @Min(0)
        Integer pageNo,

        @Schema(description = "페이지 크기", example = "10")
        @NotNull
        @Min(1)
        Integer pageSize
) {
}
