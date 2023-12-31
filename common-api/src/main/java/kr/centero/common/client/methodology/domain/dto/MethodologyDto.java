package kr.centero.common.client.methodology.domain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

@Data
public class MethodologyDto {
    @NotBlank
    private String name;

    @Email
    private String email;

    @NotBlank
    private String address;

    @NotNull
    @Range(min = 1000, max = 10000)
    private Integer cost;
}

