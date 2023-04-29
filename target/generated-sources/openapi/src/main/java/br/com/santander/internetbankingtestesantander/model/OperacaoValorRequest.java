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
 * Classe para representação da solicitação de uma operação com uma conta de um Cliente.
 */
@ApiModel(description = "Classe para representação da solicitação de uma operação com uma conta de um Cliente.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-28T22:01:12.498620-03:00[America/Sao_Paulo]")
public class OperacaoValorRequest   {
  @JsonProperty("contaCliente")
  private String contaCliente;

  @JsonProperty("valorOperacao")
  private BigDecimal valorOperacao;

  public OperacaoValorRequest contaCliente(String contaCliente) {
    this.contaCliente = contaCliente;
    return this;
  }

  /**
   * Conta do Cliente onde será realizada a operação.
   * @return contaCliente
  */
  @ApiModelProperty(value = "Conta do Cliente onde será realizada a operação.")


  public String getContaCliente() {
    return contaCliente;
  }

  public void setContaCliente(String contaCliente) {
    this.contaCliente = contaCliente;
  }

  public OperacaoValorRequest valorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
    return this;
  }

  /**
   * Valor que será utilizado na operação.
   * @return valorOperacao
  */
  @ApiModelProperty(value = "Valor que será utilizado na operação.")

  @Valid

  public BigDecimal getValorOperacao() {
    return valorOperacao;
  }

  public void setValorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperacaoValorRequest operacaoValorRequest = (OperacaoValorRequest) o;
    return Objects.equals(this.contaCliente, operacaoValorRequest.contaCliente) &&
        Objects.equals(this.valorOperacao, operacaoValorRequest.valorOperacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contaCliente, valorOperacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperacaoValorRequest {\n");
    
    sb.append("    contaCliente: ").append(toIndentedString(contaCliente)).append("\n");
    sb.append("    valorOperacao: ").append(toIndentedString(valorOperacao)).append("\n");
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

