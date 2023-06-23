package br.com.etec.arthur.provaapi.repository;

import br.com.etec.arthur.provaapi.model.Cliente;
import br.com.etec.arthur.provaapi.repository.cliente.ClienteRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long>, ClienteRepositoryQuery {
}
