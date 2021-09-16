package br.com.bb.prova.repository;

import br.com.bb.prova.entity.Cotacao;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CotacaoRepository implements PanacheRepository<Cotacao> {
}
