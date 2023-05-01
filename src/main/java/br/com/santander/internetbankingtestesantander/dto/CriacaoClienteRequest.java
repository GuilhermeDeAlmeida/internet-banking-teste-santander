package br.com.santander.internetbankingtestesantander.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

public record CriacaoClienteRequest(
        @NotBlank
        String nome,
        @NotBlank
        Boolean planoExclusive,
        @NotBlank
        BigDecimal saldo,
        @NotBlank
        String numeroConta,
        @NotBlank
        String dataNascimento) {
}
