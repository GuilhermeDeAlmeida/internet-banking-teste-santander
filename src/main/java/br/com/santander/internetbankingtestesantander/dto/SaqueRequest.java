package br.com.santander.internetbankingtestesantander.dto;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

public record SaqueRequest(
        @NotBlank
        BigDecimal valor,
        @NotBlank
        String numeroConta) {
}
