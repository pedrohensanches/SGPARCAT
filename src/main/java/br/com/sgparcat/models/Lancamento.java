/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sgparcat.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author pedrohensanches
 */
@Entity
@Table(name = "lancamento")
public class Lancamento implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numeroLancamento", nullable = false)
    private Long numeroLancamento;
    
    @Column(name = "isDespesa", nullable = false)
    private boolean isDespesa;
    
    @Column(name = "descricao", nullable = false)
    private String descricao;
    
    //@Max(value=?)
    //@Min(value=?)
    @Column(name = "valor")
    private BigDecimal valor;
    
    @Column(name = "valorJuros")
    private BigDecimal valorJuros;
    
    @Column(name = "dataVencimento")
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    
    @Column(name = "dataPagamento")
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;
    
    @Column(name = "emitente")
    private String emitente;
    
    @Column(name = "isParcelado", nullable = false)
    private boolean isParcelado;
    
    @Lob
    @Column(name = "observacao")
    private String observacao;
    
    @Column(name = "isPago", nullable = false)
    private boolean isPago;
    
    @Column(name = "dataRegistro", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataRegistro;
    
    @Column(name = "horarioRegistro", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date horarioRegistro;
    
    @JoinColumn(name = "idEvento", referencedColumnName = "idEvento")
    @ManyToOne
    private Evento idEvento;
    
    @JoinColumn(name = "idPessoaRegistrouLancamento", referencedColumnName = "idPessoa", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Pessoa pessoa;

    public Lancamento() {
    }

    public Lancamento(Long numeroLancamento, boolean isDespesa, String descricao, BigDecimal valor, boolean isParcelado, Date dataRegistro, Date horarioRegistro) {
        this.numeroLancamento = numeroLancamento;
        this.isDespesa = isDespesa;
        this.descricao = descricao;
        this.valor = valor;
        this.isParcelado = isParcelado;
        this.dataRegistro = dataRegistro;
        this.horarioRegistro = horarioRegistro;
    }
    
    
    //GETTES AND SETTERS
    
    
    //Métodos sobrescritos do java.lang.Object

}