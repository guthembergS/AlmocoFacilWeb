package br.com.artecolaborativa.model;

import br.com.artecolaborativa.model.Lojista;
import br.com.artecolaborativa.model.Produto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.5.v20170607-rNA", date="2019-09-09T12:56:46")
@StaticMetamodel(ProdutoEstoque.class)
public class ProdutoEstoque_ { 

    public static volatile SingularAttribute<ProdutoEstoque, Produto> produto;
    public static volatile SingularAttribute<ProdutoEstoque, Lojista> lojista;
    public static volatile SingularAttribute<ProdutoEstoque, Integer> quantidade;
    public static volatile SingularAttribute<ProdutoEstoque, Long> idProdutoEstoque;

}