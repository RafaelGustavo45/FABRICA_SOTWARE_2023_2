package br.edu.univille.projeto_fabrica_software.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import br.edu.univille.projeto_fabrica_software.entity.Cliente;
import br.edu.univille.projeto_fabrica_software.entity.ClienteReparo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import br.edu.univille.projeto_fabrica_software.repository.ClienteRepository;
import br.edu.univille.projeto_fabrica_software.service.ClienteService;

import java.util.ArrayList;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    // @Autowired
    // private ClienteRepository repository;

    @Autowired
    private ClienteService service;

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

        var listaClientes = service.getAll();



        return new ModelAndView("cliente/index", "listaClientes", listaClientes);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
       var novoCliente = new ClienteReparo();
       return new ModelAndView("cliente/form","cliente",novoCliente);
    }

    @PostMapping
    public ModelAndView save(ClienteReparo clientereparo){
        service.save(clientereparo);
        return new ModelAndView("redirect:/clientes");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") ClienteReparo clientereparo){

        return new ModelAndView("cliente/form","cliente",clientereparo);
    }
}