package br.com.ferreira.ferreiraapi.resource;

import br.com.ferreira.ferreiraapi.repository.ClienteRepository;
import br.com.ferreira.ferreiraapi.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteResource {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/todos")
public List<Cliente> listarTodosClientes(){
        return clienteRepository.findAll();

    }

}
