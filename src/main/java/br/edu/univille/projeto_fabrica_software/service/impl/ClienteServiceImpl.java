package br.edu.univille.projeto_fabrica_software.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.univille.projeto_fabrica_software.entity.ClienteReparo;
import br.edu.univille.projeto_fabrica_software.repository.ClienteRepository;
import br.edu.univille.projeto_fabrica_software.service.ClienteService;

public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Override
    public List<ClienteReparo> getAll() {

        return repository.findAll();
    }

}
