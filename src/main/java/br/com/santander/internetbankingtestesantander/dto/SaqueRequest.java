package br.com.santander.internetbankingtestesantander.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

public record SaqueRequest(
        @NotNull(message = "O valor deve ser preenchido")
        @Positive(message = "O valor do saque deve ser maior que zero")
        BigDecimal valor,
        @NotBlank(message = "O número da conta deve ser preenchido")
        String numeroConta) {
}
