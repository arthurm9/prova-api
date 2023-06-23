package br.com.etec.arthur.provaapi.resource;

import br.com.etec.arthur.provaapi.model.ContasPagar;
import br.com.etec.arthur.provaapi.repository.ContasPagarRepository;
import br.com.etec.arthur.provaapi.repository.filter.ContasPagarFilter;
import br.com.etec.arthur.provaapi.repository.projections.ContasPagarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @GetMapping()
    public Page<ContasPagarDto> pesquisar(ContasPagarFilter contasPagarFilter, Pageable pageable){
        return contasPagarRepository.filtrarContasPagar(contasPagarFilter, pageable);
    }
}
