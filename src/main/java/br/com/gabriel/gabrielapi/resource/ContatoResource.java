package br.com.gabriel.gabrielapi.resource;

import br.com.gabriel.gabrielapi.model.Contato;
import br.com.gabriel.gabrielapi.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("contatos")
public class ContatoResource {

@Autowired
public ContatoRepository contatoRepository;

@GetMapping("/todos")
    public List<Contato> listarTodosContatos(){

return contatoRepository.findAll();


    }

}
