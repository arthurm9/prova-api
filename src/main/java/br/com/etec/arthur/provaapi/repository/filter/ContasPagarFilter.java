package br.com.etec.arthur.provaapi.repository.filter;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
public class ContasPagarFilter {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataconta;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate datavencimento;

    private BigDecimal valor;

    public LocalDate getDataconta() {
        return dataconta;
    }

    public void setDataconta(LocalDate dataconta) {
        this.dataconta = dataconta;
    }

    public LocalDate getDatavencimento() {
        return datavencimento;
    }

    public void setDatavencimento(LocalDate datavencimento) {
        this.datavencimento = datavencimento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
