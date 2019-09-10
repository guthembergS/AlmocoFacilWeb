package br.com.artecolaborativa.model;

import br.com.artecolaborativa.model.Produto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.5.v20170607-rNA", date="2019-09-09T12:56:46")
@StaticMetamodel(Artesao.class)
public class Artesao_ extends Usuario_ {

    public static volatile SingularAttribute<Artesao, String> marca;
    public static volatile ListAttribute<Artesao, Produto> produtos;

}