package br.com.etec.arthur.provaapi.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

@Data
@Entity
@Table(name="contaspagar")
public class ContasPagar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dataconta;
    private LocalDate datavencimento;
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name="clienteid")
    private Cliente cliente;
}
