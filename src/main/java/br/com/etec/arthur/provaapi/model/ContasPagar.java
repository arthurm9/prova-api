package br.com.etec.arthur.provaapi.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.*;

@Entity
@Table(name="contaspagar")
public class ContasPagar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dataconta;
    private Date datavencimento;
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name="clienteid")
    private Cliente cliente;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContasPagar that = (ContasPagar) o;
        return id.equals(that.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public Date getData() {
        return dataconta;
    }
    public void setData(Date data) {
        this.dataconta = data;
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
