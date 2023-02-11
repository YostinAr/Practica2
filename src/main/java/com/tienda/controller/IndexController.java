package com.tienda.controller;

import com.tienda.domain.Cliente;
import java.util.Arrays;
import org.springframework.ui.Model;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
    
    @GetMapping("/")
    public String inicio(Model model) {  
       log.info("Ahora se usa arquitectura MVC");
       Cliente cliente1 = new Cliente("Yostin","Arias Zuñiga","yarias60180@gmail.com", "8578898487");
       Cliente cliente2 = new Cliente("Pedro","Gomez Contreras","pgomez@gmail.com", "8578898487");
       var clientes = Arrays.asList(cliente1, cliente2);
       model.addAttribute("clientes", clientes);
        return "index";
    }    
}