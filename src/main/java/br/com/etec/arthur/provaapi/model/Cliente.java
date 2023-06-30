package br.com.etec.arthur.provaapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @JsonIgnore
    @OneToMany
    private List<ContasPagar> contaspagar = new ArrayList<>();
}
