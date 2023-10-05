package br.edu.univille.projeto_fabrica_software.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.univille.projeto_fabrica_software.entity.Computador;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputadorRepository
        extends JpaRepository<Computador, Long> {

}
