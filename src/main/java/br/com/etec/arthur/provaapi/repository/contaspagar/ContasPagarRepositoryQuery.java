package br.com.etec.arthur.provaapi.repository.contaspagar;

import br.com.etec.arthur.provaapi.repository.filter.ContasPagarFilter;
import br.com.etec.arthur.provaapi.repository.projections.ContasPagarDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContasPagarRepositoryQuery {
    public Page<ContasPagarDto> filtrarContasPagar(ContasPagarFilter contasPagarFilter, Pageable pageable);
}
