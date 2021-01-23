package co.edu.udea.microserviciosudearegistration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {

    @RequestMapping(value = "/hello")
    public String viewMessage(){ return "Hola desde el mundo Spring Boot"; }

}
