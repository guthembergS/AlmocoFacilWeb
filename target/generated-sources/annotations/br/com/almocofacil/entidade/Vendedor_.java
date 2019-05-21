package br.com.almocofacil.entidade;

import br.com.almocofacil.entidade.Pedido;
import br.com.almocofacil.entidade.Prato;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-05-18T10:15:12")
@StaticMetamodel(Vendedor.class)
public class Vendedor_ extends Usuario_ {

    public static volatile ListAttribute<Vendedor, Prato> pratos;
    public static volatile ListAttribute<Vendedor, Pedido> pedidos;

}