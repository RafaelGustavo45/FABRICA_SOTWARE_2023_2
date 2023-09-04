package br.edu.univille.projeto_fabrica_software.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.univille.projeto_fabrica_software.entity.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository
    extends JpaRepository<Cliente,Long>{
    
}
