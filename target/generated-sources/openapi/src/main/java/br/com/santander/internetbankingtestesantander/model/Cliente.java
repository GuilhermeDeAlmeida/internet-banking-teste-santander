package br.com.santander.internetbankingtestesantander.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Classe para representar um Cliente.
 */
@ApiModel(description = "Classe para representar um Cliente.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-28T18:06:24.592822-03:00[America/Sao_Paulo]")
public class Cliente   {
  @JsonProperty("nome")
  private String nome;

  @JsonProperty("planoExclusive")
  private Boolean planoExclusive;

  @JsonProperty("saldo")
  private BigDecimal saldo;

  @JsonProperty("numeroConta")
  private String numeroConta;

  @JsonProperty("dataNascimento")
  private String dataNascimento;

  public Cliente nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Nome do Cliente que será cadastrado no sistema.
   * @return nome
  */
  @ApiModelProperty(value = "Nome do Cliente que será cadastrado no sistema.")


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Cliente planoExclusive(Boolean planoExclusive) {
    this.planoExclusive = planoExclusive;
    return this;
  }

  /**
   * Descreve caso o Cliente esteja incluso no plano exclusive.
   * @return planoExclusive
  */
  @ApiModelProperty(value = "Descreve caso o Cliente esteja incluso no plano exclusive.")


  public Boolean getPlanoExclusive() {
    return planoExclusive;
  }

  public void setPlanoExclusive(Boolean planoExclusive) {
    this.planoExclusive = planoExclusive;
  }

  public Cliente saldo(BigDecimal saldo) {
    this.saldo = saldo;
    return this;
  }

  /**
   * Valor do saldo da conta do Cliente no sistema.
   * @return saldo
  */
  @ApiModelProperty(value = "Valor do saldo da conta do Cliente no sistema.")

  @Valid

  public BigDecimal getSaldo() {
    return saldo;
  }

  public void setSaldo(BigDecimal saldo) {
    this.saldo = saldo;
  }

  public Cliente numeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
    return this;
  }

  /**
   * Número da conta do Cliente.
   * @return numeroConta
  */
  @ApiModelProperty(value = "Número da conta do Cliente.")


  public String getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  public Cliente dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }

  /**
   * Data de nascimento do Cliente.
   * @return dataNascimento
  */
  @ApiModelProperty(value = "Data de nascimento do Cliente.")


  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cliente cliente = (Cliente) o;
    return Objects.equals(this.nome, cliente.nome) &&
        Objects.equals(this.planoExclusive, cliente.planoExclusive) &&
        Objects.equals(this.saldo, cliente.saldo) &&
        Objects.equals(this.numeroConta, cliente.numeroConta) &&
        Objects.equals(this.dataNascimento, cliente.dataNascimento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, planoExclusive, saldo, numeroConta, dataNascimento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cliente {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    planoExclusive: ").append(toIndentedString(planoExclusive)).append("\n");
    sb.append("    saldo: ").append(toIndentedString(saldo)).append("\n");
    sb.append("    numeroConta: ").append(toIndentedString(numeroConta)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

