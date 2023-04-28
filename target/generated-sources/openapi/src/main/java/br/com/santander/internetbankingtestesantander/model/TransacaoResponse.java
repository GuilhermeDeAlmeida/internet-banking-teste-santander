package br.com.santander.internetbankingtestesantander.model;

import java.util.Objects;
import br.com.santander.internetbankingtestesantander.model.TransacaoItemResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Class to represents Transacao
 */
@ApiModel(description = "Class to represents Transacao")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-28T18:06:24.592822-03:00[America/Sao_Paulo]")
public class TransacaoResponse   {
  @JsonProperty("tipoMovimentacao")
  private String tipoMovimentacao;

  @JsonProperty("dataMovimentacao")
  private String dataMovimentacao;

  @JsonProperty("listaTransacoes")
  @Valid
  private List<TransacaoItemResponse> listaTransacoes = null;

  public TransacaoResponse tipoMovimentacao(String tipoMovimentacao) {
    this.tipoMovimentacao = tipoMovimentacao;
    return this;
  }

  /**
   * Nome do Cliente que será cadastrado no sistema.
   * @return tipoMovimentacao
  */
  @ApiModelProperty(value = "Nome do Cliente que será cadastrado no sistema.")


  public String getTipoMovimentacao() {
    return tipoMovimentacao;
  }

  public void setTipoMovimentacao(String tipoMovimentacao) {
    this.tipoMovimentacao = tipoMovimentacao;
  }

  public TransacaoResponse dataMovimentacao(String dataMovimentacao) {
    this.dataMovimentacao = dataMovimentacao;
    return this;
  }

  /**
   * Descreve caso o Cliente esteja incluso no plano exclusive.
   * @return dataMovimentacao
  */
  @ApiModelProperty(value = "Descreve caso o Cliente esteja incluso no plano exclusive.")


  public String getDataMovimentacao() {
    return dataMovimentacao;
  }

  public void setDataMovimentacao(String dataMovimentacao) {
    this.dataMovimentacao = dataMovimentacao;
  }

  public TransacaoResponse listaTransacoes(List<TransacaoItemResponse> listaTransacoes) {
    this.listaTransacoes = listaTransacoes;
    return this;
  }

  public TransacaoResponse addListaTransacoesItem(TransacaoItemResponse listaTransacoesItem) {
    if (this.listaTransacoes == null) {
      this.listaTransacoes = new ArrayList<>();
    }
    this.listaTransacoes.add(listaTransacoesItem);
    return this;
  }

  /**
   * Get listaTransacoes
   * @return listaTransacoes
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<TransacaoItemResponse> getListaTransacoes() {
    return listaTransacoes;
  }

  public void setListaTransacoes(List<TransacaoItemResponse> listaTransacoes) {
    this.listaTransacoes = listaTransacoes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransacaoResponse transacaoResponse = (TransacaoResponse) o;
    return Objects.equals(this.tipoMovimentacao, transacaoResponse.tipoMovimentacao) &&
        Objects.equals(this.dataMovimentacao, transacaoResponse.dataMovimentacao) &&
        Objects.equals(this.listaTransacoes, transacaoResponse.listaTransacoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoMovimentacao, dataMovimentacao, listaTransacoes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoResponse {\n");
    
    sb.append("    tipoMovimentacao: ").append(toIndentedString(tipoMovimentacao)).append("\n");
    sb.append("    dataMovimentacao: ").append(toIndentedString(dataMovimentacao)).append("\n");
    sb.append("    listaTransacoes: ").append(toIndentedString(listaTransacoes)).append("\n");
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

