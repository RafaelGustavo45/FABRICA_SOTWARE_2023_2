package br.edu.univille.projeto_fabrica_software.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import br.edu.univille.projeto_fabrica_software.entity.Cliente;
import br.edu.univille.projeto_fabrica_software.entity.ClienteReparo;
import br.edu.univille.projeto_fabrica_software.entity.Computador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import br.edu.univille.projeto_fabrica_software.repository.ClienteRepository;
import br.edu.univille.projeto_fabrica_software.service.ClienteService;
import br.edu.univille.projeto_fabrica_software.service.ComputadorService;
import br.edu.univille.projeto_fabrica_software.repository.ComputadorRepository;

import java.util.ArrayList;

@Controller
@RequestMapping("/computadores")
public class ComputadorController {

    // @Autowired
    // private ClienteRepository repository;

    @Autowired
    private ComputadorService service;

    @GetMapping
    public ModelAndView index() {

        // ClienteReparo cliR1 = new ClienteReparo();
        // cliR1.setCpf(234673247);
        // cliR1.setNome("jose");
        // ClienteReparo cliR2 = new ClienteReparo();
        // cliR2.setCpf(325648434);
        // cliR2.setNome("roberto");

        // criando a lista

        // ArrayList<ClienteReparo> listaClientes = new ArrayList<>();
        // listaClientes.add(cliR1);
        // listaClientes.add(cliR2);

        // usando banco de dados

        // var listaClientes = repository.findAll();

        var listaComputadores = service.getAll();

        return new ModelAndView("computador/index", "listaComputadores", listaComputadores);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
       var novoComputador = new Computador();
       return new ModelAndView("computador/form","computadores",novoComputador);
    }

    @PostMapping
    public ModelAndView save(Computador computador){
        service.save(computador);
        return new ModelAndView("redirect:/computadores");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Computador clientereparo){

        return new ModelAndView("computador/form","computador",clientereparo);
    }

    @GetMapping("/remover/{id}")
    public ModelAndView remover(
            @PathVariable("id") Computador computador){
        service.delete(computador);
        return new ModelAndView("redirect:/computadores");
    }
}