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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-28T15:24:37.976189-03:00[America/Sao_Paulo]")
public class TransacaoItemResponse   {
  @JsonProperty("valor")
  private BigDecimal valor;

  @JsonProperty("conta")
  private String conta;

  @JsonProperty("novoSaldo")
  private BigDecimal novoSaldo;

  public TransacaoItemResponse valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Valor da transação.
   * @return valor
  */
  @ApiModelProperty(value = "Valor da transação.")

  @Valid

  public BigDecimal getValor() {
    return valor;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  public TransacaoItemResponse conta(String conta) {
    this.conta = conta;
    return this;
  }

  /**
   * Conta onde foi realizada a operação.
   * @return conta
  */
  @ApiModelProperty(value = "Conta onde foi realizada a operação.")


  public String getConta() {
    return conta;
  }

  public void setConta(String conta) {
    this.conta = conta;
  }

  public TransacaoItemResponse novoSaldo(BigDecimal novoSaldo) {
    this.novoSaldo = novoSaldo;
    return this;
  }

  /**
   * Novo saldo após a operação.
   * @return novoSaldo
  */
  @ApiModelProperty(value = "Novo saldo após a operação.")

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
    TransacaoItemResponse transacaoItemResponse = (TransacaoItemResponse) o;
    return Objects.equals(this.valor, transacaoItemResponse.valor) &&
        Objects.equals(this.conta, transacaoItemResponse.conta) &&
        Objects.equals(this.novoSaldo, transacaoItemResponse.novoSaldo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valor, conta, novoSaldo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoItemResponse {\n");
    
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    conta: ").append(toIndentedString(conta)).append("\n");
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

