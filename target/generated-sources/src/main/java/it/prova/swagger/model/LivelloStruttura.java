package it.prova.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LivelloStruttura
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-08T17:07:50.518+02:00")

public class LivelloStruttura   {
  @JsonProperty("nomeLivelloStruttura")
  private String nomeLivelloStruttura = null;

  @JsonProperty("tipologiaLivelloStruttura")
  private String tipologiaLivelloStruttura = null;

  public LivelloStruttura nomeLivelloStruttura(String nomeLivelloStruttura) {
    this.nomeLivelloStruttura = nomeLivelloStruttura;
    return this;
  }

  /**
   * Get nomeLivelloStruttura
   * @return nomeLivelloStruttura
  **/
  @ApiModelProperty(value = "")


  public String getNomeLivelloStruttura() {
    return nomeLivelloStruttura;
  }

  public void setNomeLivelloStruttura(String nomeLivelloStruttura) {
    this.nomeLivelloStruttura = nomeLivelloStruttura;
  }

  public LivelloStruttura tipologiaLivelloStruttura(String tipologiaLivelloStruttura) {
    this.tipologiaLivelloStruttura = tipologiaLivelloStruttura;
    return this;
  }

  /**
   * Get tipologiaLivelloStruttura
   * @return tipologiaLivelloStruttura
  **/
  @ApiModelProperty(value = "")


  public String getTipologiaLivelloStruttura() {
    return tipologiaLivelloStruttura;
  }

  public void setTipologiaLivelloStruttura(String tipologiaLivelloStruttura) {
    this.tipologiaLivelloStruttura = tipologiaLivelloStruttura;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LivelloStruttura livelloStruttura = (LivelloStruttura) o;
    return Objects.equals(this.nomeLivelloStruttura, livelloStruttura.nomeLivelloStruttura) &&
        Objects.equals(this.tipologiaLivelloStruttura, livelloStruttura.tipologiaLivelloStruttura);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomeLivelloStruttura, tipologiaLivelloStruttura);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LivelloStruttura {\n");
    
    sb.append("    nomeLivelloStruttura: ").append(toIndentedString(nomeLivelloStruttura)).append("\n");
    sb.append("    tipologiaLivelloStruttura: ").append(toIndentedString(tipologiaLivelloStruttura)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

