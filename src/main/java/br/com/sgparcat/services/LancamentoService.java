/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sgparcat.services;

import br.com.sgparcat.models.Lancamento;
import br.com.sgparcat.repositories.Lancamentos;
import java.io.Serializable;
import java.util.Date;
import javax.inject.Inject;

/**
 *
 * @author pedrohensanches
 */
public class LancamentoService implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private Lancamentos repositorioLancamentos;
    
    public Lancamento salvar(Lancamento lancamento){
        lancamento.setDataRegistro(new Date());
        return repositorioLancamentos.guardar(lancamento);
    }
    
    public void excluir(Lancamento lancamento){
        repositorioLancamentos.remover(lancamento);
    }
    
}