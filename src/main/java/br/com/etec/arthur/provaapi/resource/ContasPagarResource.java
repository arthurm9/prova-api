package br.com.etec.arthur.provaapi.resource;

import br.com.etec.arthur.provaapi.model.ContasPagar;
import br.com.etec.arthur.provaapi.repository.ContasPagarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("contaspagar")
public class ContasPagarResource {
    @Autowired
    private ContasPagarRepository contasPagarRepository;

    @GetMapping("/todos")
    public List<ContasPagar> listarTodosContasPagar() {
        return contasPagarRepository.findAll();
    }

    //localhost:8080/contaspagar/todos
}
