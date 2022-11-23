package br.com.ferreira.ferreiraapi.repository;

import br.com.ferreira.ferreiraapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente,Long> {
}
