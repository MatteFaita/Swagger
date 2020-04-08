package it.prova.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Convenzione
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-08T17:00:14.854+02:00")

public class Convenzione   {
  @JsonProperty("NDG")
  private String NDG = null;

  @JsonProperty("codiceFIcs")
  private String codiceFIcs = null;

  @JsonProperty("ABI")
  private String ABI = null;

  @JsonProperty("tipoAccesso")
  private String tipoAccesso = null;

  @JsonProperty("documentiCaricati")
  @Valid
  private List<byte[]> documentiCaricati = null;

  public Convenzione NDG(String NDG) {
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

  public Convenzione codiceFIcs(String codiceFIcs) {
    this.codiceFIcs = codiceFIcs;
    return this;
  }

  /**
   * Get codiceFIcs
   * @return codiceFIcs
  **/
  @ApiModelProperty(value = "")


  public String getCodiceFIcs() {
    return codiceFIcs;
  }

  public void setCodiceFIcs(String codiceFIcs) {
    this.codiceFIcs = codiceFIcs;
  }

  public Convenzione ABI(String ABI) {
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

  public Convenzione tipoAccesso(String tipoAccesso) {
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

  public Convenzione documentiCaricati(List<byte[]> documentiCaricati) {
    this.documentiCaricati = documentiCaricati;
    return this;
  }

  public Convenzione addDocumentiCaricatiItem(byte[] documentiCaricatiItem) {
    if (this.documentiCaricati == null) {
      this.documentiCaricati = new ArrayList<byte[]>();
    }
    this.documentiCaricati.add(documentiCaricatiItem);
    return this;
  }

  /**
   * documenti necessari per la creazione del convenzionamento
   * @return documentiCaricati
  **/
  @ApiModelProperty(value = "documenti necessari per la creazione del convenzionamento")


  public List<byte[]> getDocumentiCaricati() {
    return documentiCaricati;
  }

  public void setDocumentiCaricati(List<byte[]> documentiCaricati) {
    this.documentiCaricati = documentiCaricati;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Convenzione convenzione = (Convenzione) o;
    return Objects.equals(this.NDG, convenzione.NDG) &&
        Objects.equals(this.codiceFIcs, convenzione.codiceFIcs) &&
        Objects.equals(this.ABI, convenzione.ABI) &&
        Objects.equals(this.tipoAccesso, convenzione.tipoAccesso) &&
        Objects.equals(this.documentiCaricati, convenzione.documentiCaricati);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NDG, codiceFIcs, ABI, tipoAccesso, documentiCaricati);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Convenzione {\n");
    
    sb.append("    NDG: ").append(toIndentedString(NDG)).append("\n");
    sb.append("    codiceFIcs: ").append(toIndentedString(codiceFIcs)).append("\n");
    sb.append("    ABI: ").append(toIndentedString(ABI)).append("\n");
    sb.append("    tipoAccesso: ").append(toIndentedString(tipoAccesso)).append("\n");
    sb.append("    documentiCaricati: ").append(toIndentedString(documentiCaricati)).append("\n");
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

