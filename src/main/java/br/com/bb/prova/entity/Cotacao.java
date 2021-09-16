package br.com.bb.prova.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "cotacao")
@Cacheable
public class Cotacao extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRequisicao;

    @Column
    private LocalDateTime dtRequisicao;

    @Column
    private Date dtCotacao;

    @Column
    private Float vlCompra;

    @Column
    private Float vlVenda;

    @Column
    private LocalDateTime dataHoraCotacao;


    public Long getIdRequisicao() {
        return idRequisicao;
    }

    public void setIdRequisicao(Long idRequisicao) {
        this.idRequisicao = idRequisicao;
    }

    public LocalDateTime getDtRequisicao() {
        return dtRequisicao;
    }

    public void setDtRequisicao(LocalDateTime dtRequisicao) {
        this.dtRequisicao = dtRequisicao;
    }

    public Date getDtCotacao() {
        return dtCotacao;
    }

    public void setDtCotacao(Date dtCotacao) {
        this.dtCotacao = dtCotacao;
    }

    public Float getVlCompra() {
        return vlCompra;
    }

    public void setVlCompra(Float vlCompra) {
        this.vlCompra = vlCompra;
    }

    public Float getVlVenda() {
        return vlVenda;
    }

    public void setVlVenda(Float vlVenda) {
        this.vlVenda = vlVenda;
    }

    public LocalDateTime getDataHoraCotacao() {
        return dataHoraCotacao;
    }

    public void setDataHoraCotacao(LocalDateTime dataHoraCotacao) {
        this.dataHoraCotacao = dataHoraCotacao;
    }
}