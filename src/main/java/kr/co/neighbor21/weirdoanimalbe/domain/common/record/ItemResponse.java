package kr.co.neighbor21.weirdoanimalbe.domain.common.record;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema(description = "공통 객체 응답")
public record ItemResponse<T>(
        @Schema(description = "응답 상태", example = "OK")
        String status,

        @Schema(description = "응답 상태 메시지", example = "데이터를 조회/추가/수정/삭제 하는데 성공하였습니다.")
        String message,

        @Schema(name = "요청 데이터", example = "요청한 데이터는 여기에 담겨있습니다.")
        @JsonInclude(JsonInclude.Include.NON_NULL)
        T data
) {
}
