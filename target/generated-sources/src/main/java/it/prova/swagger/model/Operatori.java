package it.prova.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Operatori
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-08T17:00:15.252+02:00")

public class Operatori   {
  @JsonProperty("codiceFiscale")
  private String codiceFiscale = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("cognome")
  private String cognome = null;

  @JsonProperty("luogoNascita")
  private String luogoNascita = null;

  @JsonProperty("dataNascita")
  private LocalDate dataNascita = null;

  @JsonProperty("telefono")
  private String telefono = null;

  public Operatori codiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
    return this;
  }

  /**
   * Get codiceFiscale
   * @return codiceFiscale
  **/
  @ApiModelProperty(value = "")


  public String getCodiceFiscale() {
    return codiceFiscale;
  }

  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  public Operatori email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Operatori nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Get nome
   * @return nome
  **/
  @ApiModelProperty(value = "")


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Operatori cognome(String cognome) {
    this.cognome = cognome;
    return this;
  }

  /**
   * Get cognome
   * @return cognome
  **/
  @ApiModelProperty(value = "")


  public String getCognome() {
    return cognome;
  }

  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  public Operatori luogoNascita(String luogoNascita) {
    this.luogoNascita = luogoNascita;
    return this;
  }

  /**
   * Get luogoNascita
   * @return luogoNascita
  **/
  @ApiModelProperty(value = "")


  public String getLuogoNascita() {
    return luogoNascita;
  }

  public void setLuogoNascita(String luogoNascita) {
    this.luogoNascita = luogoNascita;
  }

  public Operatori dataNascita(LocalDate dataNascita) {
    this.dataNascita = dataNascita;
    return this;
  }

  /**
   * Get dataNascita
   * @return dataNascita
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDataNascita() {
    return dataNascita;
  }

  public void setDataNascita(LocalDate dataNascita) {
    this.dataNascita = dataNascita;
  }

  public Operatori telefono(String telefono) {
    this.telefono = telefono;
    return this;
  }

  /**
   * Get telefono
   * @return telefono
  **/
  @ApiModelProperty(value = "")


  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operatori operatori = (Operatori) o;
    return Objects.equals(this.codiceFiscale, operatori.codiceFiscale) &&
        Objects.equals(this.email, operatori.email) &&
        Objects.equals(this.nome, operatori.nome) &&
        Objects.equals(this.cognome, operatori.cognome) &&
        Objects.equals(this.luogoNascita, operatori.luogoNascita) &&
        Objects.equals(this.dataNascita, operatori.dataNascita) &&
        Objects.equals(this.telefono, operatori.telefono);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceFiscale, email, nome, cognome, luogoNascita, dataNascita, telefono);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operatori {\n");
    
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    luogoNascita: ").append(toIndentedString(luogoNascita)).append("\n");
    sb.append("    dataNascita: ").append(toIndentedString(dataNascita)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
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

