package br.com.gabriel.gabrielapi.repository;


import br.com.gabriel.gabrielapi.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato,Long> {

}
