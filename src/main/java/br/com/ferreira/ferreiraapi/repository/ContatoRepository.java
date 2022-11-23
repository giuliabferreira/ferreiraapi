package br.com.ferreira.ferreiraapi.repository;

import br.com.ferreira.ferreiraapi.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato,Long> {

}
