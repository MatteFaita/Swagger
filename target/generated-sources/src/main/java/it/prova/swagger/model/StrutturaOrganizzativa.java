package it.prova.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.prova.swagger.model.SearchstrutturaorganizzativaIivelliStruttura;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StrutturaOrganizzativa
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-08T17:07:50.518+02:00")

public class StrutturaOrganizzativa   {
  @JsonProperty("idConvenzione")
  private String idConvenzione = null;

  @JsonProperty("iivelliStruttura")
  @Valid
  private List<SearchstrutturaorganizzativaIivelliStruttura> iivelliStruttura = null;

  public StrutturaOrganizzativa idConvenzione(String idConvenzione) {
    this.idConvenzione = idConvenzione;
    return this;
  }

  /**
   * Get idConvenzione
   * @return idConvenzione
  **/
  @ApiModelProperty(value = "")


  public String getIdConvenzione() {
    return idConvenzione;
  }

  public void setIdConvenzione(String idConvenzione) {
    this.idConvenzione = idConvenzione;
  }

  public StrutturaOrganizzativa iivelliStruttura(List<SearchstrutturaorganizzativaIivelliStruttura> iivelliStruttura) {
    this.iivelliStruttura = iivelliStruttura;
    return this;
  }

  public StrutturaOrganizzativa addIivelliStrutturaItem(SearchstrutturaorganizzativaIivelliStruttura iivelliStrutturaItem) {
    if (this.iivelliStruttura == null) {
      this.iivelliStruttura = new ArrayList<SearchstrutturaorganizzativaIivelliStruttura>();
    }
    this.iivelliStruttura.add(iivelliStrutturaItem);
    return this;
  }

  /**
   * Get iivelliStruttura
   * @return iivelliStruttura
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<SearchstrutturaorganizzativaIivelliStruttura> getIivelliStruttura() {
    return iivelliStruttura;
  }

  public void setIivelliStruttura(List<SearchstrutturaorganizzativaIivelliStruttura> iivelliStruttura) {
    this.iivelliStruttura = iivelliStruttura;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StrutturaOrganizzativa strutturaOrganizzativa = (StrutturaOrganizzativa) o;
    return Objects.equals(this.idConvenzione, strutturaOrganizzativa.idConvenzione) &&
        Objects.equals(this.iivelliStruttura, strutturaOrganizzativa.iivelliStruttura);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConvenzione, iivelliStruttura);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StrutturaOrganizzativa {\n");
    
    sb.append("    idConvenzione: ").append(toIndentedString(idConvenzione)).append("\n");
    sb.append("    iivelliStruttura: ").append(toIndentedString(iivelliStruttura)).append("\n");
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

