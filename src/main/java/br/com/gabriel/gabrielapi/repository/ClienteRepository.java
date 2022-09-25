package br.com.gabriel.gabrielapi.repository;

import br.com.gabriel.gabrielapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente,Long> {
}
