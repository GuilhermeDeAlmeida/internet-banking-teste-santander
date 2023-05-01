package br.com.santander.internetbankingtestesantander.dto;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

public record DepositoRequest(
        @NotBlank
        BigDecimal valor,
        @NotBlank
        String numeroConta) {
}
