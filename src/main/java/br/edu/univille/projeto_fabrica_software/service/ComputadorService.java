package br.edu.univille.projeto_fabrica_software.service;

import br.edu.univille.projeto_fabrica_software.entity.Computador;
import java.util.List;

public interface ComputadorService {
    // concentrar a logica

    List<Computador> getAll();

    void save(Computador pc);

    void delete(Computador pc);
}
