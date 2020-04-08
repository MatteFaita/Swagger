/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package it.prova.swagger.api;

import it.prova.swagger.model.Operatori;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-08T17:07:52.571+02:00")

@Api(value = "search-operatore", description = "the search-operatore API")
public interface SearchOperatoreApi {

    @ApiOperation(value = "Ricerca uno o più operatori", nickname = "searchOperatorePost", notes = "", response = Operatori.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ritorna uno o più operatori", response = Operatori.class, responseContainer = "List") })
    @RequestMapping(value = "/search-operatore",
        method = RequestMethod.POST)
    ResponseEntity<List<Operatori>> searchOperatorePost(@ApiParam(value = "Non vengono specificati i parametri di ricerca degli operatori per ora metto il codiceFiscale e basta" ,required=true )  @Valid @RequestBody String codiceFiscale);

}
