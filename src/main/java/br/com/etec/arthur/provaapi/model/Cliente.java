package br.com.etec.arthur.provaapi.model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    @OneToMany
    private List<ContasPagar> contaspagar = new ArrayList<>();

    public List<ContasPagar> getContaspagar() {
        return contaspagar;
    }

    public void setContaspagar() {
        this.contaspagar = contaspagar;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id.equals(cliente.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
