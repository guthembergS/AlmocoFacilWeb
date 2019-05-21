package br.com.almocofacil.entidade;

import br.com.almocofacil.entidade.Vendedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-05-18T10:15:12")
@StaticMetamodel(Prato.class)
public class Prato_ extends Entidade_ {

    public static volatile SingularAttribute<Prato, Long> idPrato;
    public static volatile SingularAttribute<Prato, String> nmPrato;
    public static volatile SingularAttribute<Prato, Vendedor> vendedor;
    public static volatile SingularAttribute<Prato, Double> valor;

}