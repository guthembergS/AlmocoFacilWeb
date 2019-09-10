package br.com.artecolaborativa.model;

import br.com.artecolaborativa.model.ProdutoEstoque;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.5.v20170607-rNA", date="2019-09-09T12:56:46")
@StaticMetamodel(VendaLojistaProduto.class)
public class VendaLojistaProduto_ { 

    public static volatile SingularAttribute<VendaLojistaProduto, Date> dataVenda;
    public static volatile SingularAttribute<VendaLojistaProduto, Long> idVendaLojista;
    public static volatile SingularAttribute<VendaLojistaProduto, ProdutoEstoque> produtoEstoque;
    public static volatile SingularAttribute<VendaLojistaProduto, Long> quantidade;

}