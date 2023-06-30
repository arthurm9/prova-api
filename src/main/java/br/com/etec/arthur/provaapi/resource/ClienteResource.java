package br.com.etec.arthur.provaapi.resource;

import br.com.etec.arthur.provaapi.model.Cliente;
import br.com.etec.arthur.provaapi.repository.ClienteRepository;
import br.com.etec.arthur.provaapi.repository.filter.ClienteFilter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;

import java.util.List;


@RestController
@RequestMapping("clientes")
public class ClienteResource {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/todos")
    public List<Cliente> listarTodosClientes() {
        return clienteRepository.findAll(Sort.by("nome").ascending());
    }

    @GetMapping()
    public Page<Cliente> filtrarCliente(ClienteFilter clienteFilter, Pageable pageable){
        return clienteRepository.filtrarCliente(clienteFilter, pageable);
    }
}