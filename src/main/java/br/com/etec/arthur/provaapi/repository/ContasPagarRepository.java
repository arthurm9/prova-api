package br.com.etec.arthur.provaapi.repository;

import br.com.etec.arthur.provaapi.model.ContasPagar;
import br.com.etec.arthur.provaapi.repository.contaspagar.ContasPagarRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContasPagarRepository extends JpaRepository<ContasPagar, Long>, ContasPagarRepositoryQuery {
}
