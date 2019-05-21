/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.almocofacil.test;

import br.com.almocofacil.servico.ClienteServico;
import javax.naming.NamingException;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author guto
 */
public class ClienteTeste extends Teste{
    
    private ClienteServico clienteServico;
    
    @Before
    public void setUp() throws NamingException {
        clienteServico = (ClienteServico) container.getContext().lookup("java:global/classes/ejb/ItemServico!softwarecorporativo.exemplo.ejb.servico.ItemServico");
        
    }

    @After
    public void tearDown() {
        clienteServico = null;
    }

    @Test
    public void consultarItensPorCategoria() {
        assertEquals(1, clienteServico.getClientePorId("1").size());
    }
    
}
