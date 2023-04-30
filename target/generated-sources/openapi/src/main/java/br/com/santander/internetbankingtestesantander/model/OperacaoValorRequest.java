package br.com.santander.internetbankingtestesantander.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-29T22:46:19.991721-03:00[America/Sao_Paulo]")
public class OperacaoValorRequest   {
  @JsonProperty("contaCliente")
  private String contaCliente;

  @JsonProperty("valorOperacao")
  private BigDecimal valorOperacao;

  /**
   * Gets or Sets tipoOperacao
   */
  public enum TipoOperacaoEnum {
    DEPOSITO("DEPOSITO"),
    
    SAQUE("SAQUE");

    private String value;

    TipoOperacaoEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TipoOperacaoEnum fromValue(String value) {
      for (TipoOperacaoEnum b : TipoOperacaoEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("tipoOperacao")
  private TipoOperacaoEnum tipoOperacao;

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

  public OperacaoValorRequest tipoOperacao(TipoOperacaoEnum tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
    return this;
  }

  /**
   * Get tipoOperacao
   * @return tipoOperacao
  */
  @ApiModelProperty(value = "")


  public TipoOperacaoEnum getTipoOperacao() {
    return tipoOperacao;
  }

  public void setTipoOperacao(TipoOperacaoEnum tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
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
        Objects.equals(this.valorOperacao, operacaoValorRequest.valorOperacao) &&
        Objects.equals(this.tipoOperacao, operacaoValorRequest.tipoOperacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contaCliente, valorOperacao, tipoOperacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperacaoValorRequest {\n");
    
    sb.append("    contaCliente: ").append(toIndentedString(contaCliente)).append("\n");
    sb.append("    valorOperacao: ").append(toIndentedString(valorOperacao)).append("\n");
    sb.append("    tipoOperacao: ").append(toIndentedString(tipoOperacao)).append("\n");
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

