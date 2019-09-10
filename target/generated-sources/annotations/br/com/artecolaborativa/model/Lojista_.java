package br.com.artecolaborativa.model;

import br.com.artecolaborativa.model.Artesao;
import br.com.artecolaborativa.model.Endereco;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.5.v20170607-rNA", date="2019-09-09T12:56:46")
@StaticMetamodel(Lojista.class)
public class Lojista_ extends Usuario_ {

    public static volatile SingularAttribute<Lojista, Endereco> endereco;
    public static volatile SingularAttribute<Lojista, Double> aluguel;
    public static volatile SingularAttribute<Lojista, Double> taxaVenda;
    public static volatile ListAttribute<Lojista, Artesao> artesaos;

}