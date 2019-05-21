/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almocofacil.servico;

import br.com.almocofacil.entidade.Cliente;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;

/**
 *
 * @author guto
 */
@Stateless(name = "ejb/ClienteServico")
@LocalBean
@ValidateOnExecution(type = ExecutableType.ALL)
public class ClienteServico extends Servico<Cliente>{
    @PostConstruct
    public void init() {
        super.setClasse(Cliente.class);
    }
 
    @Override
    public Cliente criar() {
        return new Cliente();
    }

    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public List<Cliente> getClientePorId(String id) {
        return super.consultarEntidades(new Object[] {id}, Cliente.CLIENTE_POR_ID);
    }
    /*
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public List<Item> getItensPorTitulo(String titulo) {
        return super.consultarEntidades(new Object[] {titulo}, Item.ITEM_POR_TITULO);
    }*/    
    
    
}
