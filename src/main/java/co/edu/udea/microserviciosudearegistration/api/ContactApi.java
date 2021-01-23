package co.edu.udea.microserviciosudearegistration.api;

import co.edu.udea.microserviciosudearegistration.dto.Contacto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ContactApi {



    // El objeto de la entidad es retornado como un XML
    @GetMapping(value = "/contact")
    public Contacto newContact() {
        Contacto alias = new Contacto(10L, "Robin", "CGarcia", "+57 3108917102", "robin.coronado@gmail");
        return alias;
    }

}
