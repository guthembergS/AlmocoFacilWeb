package br.com.artecolaborativa.model;

import br.com.artecolaborativa.model.Artesao;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.5.v20170607-rNA", date="2019-09-09T12:56:46")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, Double> preco;
    public static volatile SingularAttribute<Produto, Long> idProduto;
    public static volatile SingularAttribute<Produto, Artesao> artesao;
    public static volatile SingularAttribute<Produto, String> descricao;

}