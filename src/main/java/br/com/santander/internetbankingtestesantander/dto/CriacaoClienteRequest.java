package br.com.santander.internetbankingtestesantander.dto;


import javax.validation.constraints.*;
import java.math.BigDecimal;


public record CriacaoClienteRequest(
        @NotBlank(message = "O nome deve ser preenchido")
        String nome,
        @NotNull(message = "Precisamos que seja informado se o cliente pertence ao plano exlusive")
        Boolean planoExclusive,
        @NotNull(message = "Precisamos que seja informado o saldo do cliente")
        @PositiveOrZero(message = "Valores negativos não são aceitos")
        BigDecimal saldo,
        @NotBlank(message = "Precisamos que seja informado o número da conta do cliente")
        String numeroConta,
        @NotBlank(message = "Precisamos que seja informada data de nascimento do cliente")
        String dataNascimento) {
}
