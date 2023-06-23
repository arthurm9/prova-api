package br.com.etec.arthur.provaapi.repository.cliente;

import br.com.etec.arthur.provaapi.model.Cliente;
import br.com.etec.arthur.provaapi.repository.filter.ClienteFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClienteRepositoryQuery {
    public Page<Cliente> filtrarCliente(ClienteFilter clienteFilter, Pageable pageable);
}
