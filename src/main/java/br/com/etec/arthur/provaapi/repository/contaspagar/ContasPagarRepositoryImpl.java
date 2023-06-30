package br.com.etec.arthur.provaapi.repository.contaspagar;

import br.com.etec.arthur.provaapi.model.ContasPagar;
import br.com.etec.arthur.provaapi.repository.filter.ContasPagarFilter;
import br.com.etec.arthur.provaapi.repository.projections.ContasPagarDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ContasPagarRepositoryImpl implements ContasPagarRepositoryQuery{

    @PersistenceContext
    public EntityManager manager;

    @Override
    public Page<ContasPagarDto> filtrarContasPagar(ContasPagarFilter contasPagarFilter, Pageable pageable) {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<ContasPagarDto> criteria = builder.createQuery(ContasPagarDto.class);
        Root<ContasPagar> root = criteria.from(ContasPagar.class);

        criteria.select(builder.construct(ContasPagarDto.class
                ,root.get("id")
                ,root.get("dataconta")
                ,root.get("datavencimento")
                ,root.get("valor")
        ));

        Predicate[] predicates = criarRestricoes(contasPagarFilter, builder, root);

        criteria.where(predicates);

        TypedQuery<ContasPagarDto> query = manager.createQuery(criteria);
        adicionarRestricoesDePaginacao(query, pageable);

        return new PageImpl<>(query.getResultList(), pageable, total(contasPagarFilter));
    }

    private Long total(ContasPagarFilter contasPagarFilter) {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
        Root<ContasPagar> root = criteria.from(ContasPagar.class);

        Predicate[] predicates = criarRestricoes(contasPagarFilter, builder, root);
        criteria.where(predicates);

        criteria.select(builder.count(root));
        return manager.createQuery(criteria).getSingleResult();
    }

    private void adicionarRestricoesDePaginacao(TypedQuery<?> query, Pageable pageable) {
        int paginaAtual = pageable.getPageNumber();
        int totalRegistrosDaPagina = pageable.getPageSize();
        int primeiroRegistroDaPagina = paginaAtual * totalRegistrosDaPagina;

        query.setFirstResult(primeiroRegistroDaPagina);
        query.setMaxResults(totalRegistrosDaPagina);
    }

    private Predicate[] criarRestricoes(ContasPagarFilter contasPagarFilter, CriteriaBuilder builder, Root<ContasPagar> root) {
        List<Predicate> predicates = new ArrayList<>();

        if(contasPagarFilter.getDataconta() != null){
            predicates.add(builder.equal(root.get("dataconta"), contasPagarFilter.getDataconta()));
        }

        if(contasPagarFilter.getDatavencimento() != null){
            predicates.add(builder.equal(root.get("datavencimento"), contasPagarFilter.getDatavencimento()));
        }

        if(contasPagarFilter.getValor() != null){
            predicates.add(builder.equal(root.get("valor"), contasPagarFilter.getValor()));
        }

        return predicates.toArray(new Predicate[predicates.size()]);
    }
}
