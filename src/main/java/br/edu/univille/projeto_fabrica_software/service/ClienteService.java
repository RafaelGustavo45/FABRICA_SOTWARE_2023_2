package br.edu.univille.projeto_fabrica_software.service;

import br.edu.univille.projeto_fabrica_software.entity.ClienteReparo;
import java.util.List;

public interface ClienteService {
    // concentrar a logica

    List<ClienteReparo> getAll();
}
