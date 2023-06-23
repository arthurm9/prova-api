package br.com.etec.arthur.provaapi.repository.projections;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ContasPagarDto {
    private Long id;
    private LocalDate dataconta;
    private LocalDate datavencimento;
    private BigDecimal valor;

    public ContasPagarDto(Long id, LocalDate dataconta, LocalDate datavencimento, BigDecimal valor) {
        this.id = id;
        this.dataconta = dataconta;
        this.datavencimento = datavencimento;
        this.valor = valor;
    }
}
