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
 * Convenzione1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-08T17:07:51.961+02:00")

public class Convenzione1   {
  @JsonProperty("NDG")
  private String NDG = null;

  @JsonProperty("ABI")
  private String ABI = null;

  @JsonProperty("codiceFics")
  private String codiceFics = null;

  @JsonProperty("tipoAccesso")
  private String tipoAccesso = null;

  public Convenzione1 NDG(String NDG) {
    this.NDG = NDG;
    return this;
  }

  /**
   * Get NDG
   * @return NDG
  **/
  @ApiModelProperty(value = "")


  public String getNDG() {
    return NDG;
  }

  public void setNDG(String NDG) {
    this.NDG = NDG;
  }

  public Convenzione1 ABI(String ABI) {
    this.ABI = ABI;
    return this;
  }

  /**
   * Get ABI
   * @return ABI
  **/
  @ApiModelProperty(value = "")


  public String getABI() {
    return ABI;
  }

  public void setABI(String ABI) {
    this.ABI = ABI;
  }

  public Convenzione1 codiceFics(String codiceFics) {
    this.codiceFics = codiceFics;
    return this;
  }

  /**
   * Get codiceFics
   * @return codiceFics
  **/
  @ApiModelProperty(value = "")


  public String getCodiceFics() {
    return codiceFics;
  }

  public void setCodiceFics(String codiceFics) {
    this.codiceFics = codiceFics;
  }

  public Convenzione1 tipoAccesso(String tipoAccesso) {
    this.tipoAccesso = tipoAccesso;
    return this;
  }

  /**
   * Get tipoAccesso
   * @return tipoAccesso
  **/
  @ApiModelProperty(value = "")


  public String getTipoAccesso() {
    return tipoAccesso;
  }

  public void setTipoAccesso(String tipoAccesso) {
    this.tipoAccesso = tipoAccesso;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Convenzione1 convenzione1 = (Convenzione1) o;
    return Objects.equals(this.NDG, convenzione1.NDG) &&
        Objects.equals(this.ABI, convenzione1.ABI) &&
        Objects.equals(this.codiceFics, convenzione1.codiceFics) &&
        Objects.equals(this.tipoAccesso, convenzione1.tipoAccesso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NDG, ABI, codiceFics, tipoAccesso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Convenzione1 {\n");
    
    sb.append("    NDG: ").append(toIndentedString(NDG)).append("\n");
    sb.append("    ABI: ").append(toIndentedString(ABI)).append("\n");
    sb.append("    codiceFics: ").append(toIndentedString(codiceFics)).append("\n");
    sb.append("    tipoAccesso: ").append(toIndentedString(tipoAccesso)).append("\n");
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

