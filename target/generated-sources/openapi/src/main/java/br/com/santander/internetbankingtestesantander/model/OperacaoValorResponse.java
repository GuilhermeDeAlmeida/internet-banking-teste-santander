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
 * Class to represents Transacao
 */
@ApiModel(description = "Class to represents Transacao")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-28T18:06:24.592822-03:00[America/Sao_Paulo]")
public class OperacaoValorResponse   {
  @JsonProperty("contaCliente")
  private String contaCliente;

  @JsonProperty("novoSaldo")
  private BigDecimal novoSaldo;

  public OperacaoValorResponse contaCliente(String contaCliente) {
    this.contaCliente = contaCliente;
    return this;
  }

  /**
   * Conta em que foi realizada a operação.
   * @return contaCliente
  */
  @ApiModelProperty(value = "Conta em que foi realizada a operação.")


  public String getContaCliente() {
    return contaCliente;
  }

  public void setContaCliente(String contaCliente) {
    this.contaCliente = contaCliente;
  }

  public OperacaoValorResponse novoSaldo(BigDecimal novoSaldo) {
    this.novoSaldo = novoSaldo;
    return this;
  }

  /**
   * Novo saldo da conta do cliente após realização da operação.
   * @return novoSaldo
  */
  @ApiModelProperty(value = "Novo saldo da conta do cliente após realização da operação.")

  @Valid

  public BigDecimal getNovoSaldo() {
    return novoSaldo;
  }

  public void setNovoSaldo(BigDecimal novoSaldo) {
    this.novoSaldo = novoSaldo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperacaoValorResponse operacaoValorResponse = (OperacaoValorResponse) o;
    return Objects.equals(this.contaCliente, operacaoValorResponse.contaCliente) &&
        Objects.equals(this.novoSaldo, operacaoValorResponse.novoSaldo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contaCliente, novoSaldo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperacaoValorResponse {\n");
    
    sb.append("    contaCliente: ").append(toIndentedString(contaCliente)).append("\n");
    sb.append("    novoSaldo: ").append(toIndentedString(novoSaldo)).append("\n");
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

