package br.edu.univille.projeto_fabrica_software.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.univille.projeto_fabrica_software.entity.ClienteReparo;
import br.edu.univille.projeto_fabrica_software.entity.Computador;
import br.edu.univille.projeto_fabrica_software.repository.ClienteRepository;
import br.edu.univille.projeto_fabrica_software.repository.ComputadorRepository;
import br.edu.univille.projeto_fabrica_software.service.ClienteService;
import br.edu.univille.projeto_fabrica_software.service.ComputadorService;

import org.springframework.stereotype.*;
//precisa do service para funcionar
@Service
public class ComputadorServiceImpl implements ComputadorService {

    @Autowired
    private ComputadorRepository  repository;

    @Override
    public List<Computador> getAll() {

        return repository.findAll();
    }

    @Override
    public void save(Computador pc) {
        repository.save(pc);
    }

    @Override
    public void delete(Computador pc) {
        // TODO Auto-generated method stub
        repository.delete(pc);
    }

}
