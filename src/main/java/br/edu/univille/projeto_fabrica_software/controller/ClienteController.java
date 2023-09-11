package br.edu.univille.projeto_fabrica_software.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import br.edu.univille.projeto_fabrica_software.entity.Cliente;
import java.util.List;
import org.springframework.http.ResponseEntity;


@Controller
@RequestMapping("/clientes")
public class ClienteController{
    @GetMapping
    public ModelAndView index(){
       return new ModelAndView("cliente/index");
    }
}