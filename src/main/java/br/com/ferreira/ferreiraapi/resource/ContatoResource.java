package br.com.ferreira.ferreiraapi.resource;

import br.com.ferreira.ferreiraapi.repository.ContatoRepository;
import br.com.ferreira.ferreiraapi.model.Contato;
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
