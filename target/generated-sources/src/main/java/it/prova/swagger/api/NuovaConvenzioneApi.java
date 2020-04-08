/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package it.prova.swagger.api;

import java.util.List;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-08T17:00:14.854+02:00")

@Api(value = "nuova-convenzione", description = "the nuova-convenzione API")
public interface NuovaConvenzioneApi {

    @ApiOperation(value = "Crea un nuovo convenzionamento", nickname = "nuovaConvenzione", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ritorna successo in caso di avvenuta creazione della convenzionamento") })
    @RequestMapping(value = "/nuova-convenzione",
        method = RequestMethod.POST)
    ResponseEntity<Void> nuovaConvenzione(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String NDG,@ApiParam(value = "",required=true) @PathVariable("codiceFICS") String codiceFICS,@ApiParam(value = "" ,required=true )  @Valid @RequestBody String ABI,@ApiParam(value = "" ,required=true )  @Valid @RequestBody String tipoAccesso,@ApiParam(value = "" ,required=true )  @Valid @RequestBody List<byte[]> documenti);

}
