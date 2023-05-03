package br.com.etec.arthur.provaapi.repository.filter;

import java.math.BigDecimal;
import java.util.Date;

public class ContasPagarFilter {
    private Date dataconta;
    private Date datavencimento;
    private BigDecimal valor;

    public Date getDataconta() {
        return dataconta;
    }

    public void setDataconta(Date dataconta) {
        this.dataconta = dataconta;
    }

    public Date getDatavencimento() {
        return datavencimento;
    }

    public void setDatavencimento(Date datavencimento) {
        this.datavencimento = datavencimento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
