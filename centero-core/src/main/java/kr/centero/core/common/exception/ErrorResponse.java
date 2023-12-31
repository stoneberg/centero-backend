package kr.centero.core.common.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
    @Builder.Default
    private Boolean success = false;
    private Integer status;
    private String code;
    private String message;
    private String path;
    private String timestamp;
}
