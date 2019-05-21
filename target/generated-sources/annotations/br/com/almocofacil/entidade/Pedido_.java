package br.com.almocofacil.entidade;

import br.com.almocofacil.entidade.Cliente;
import br.com.almocofacil.entidade.Prato;
import br.com.almocofacil.entidade.Vendedor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-05-18T10:15:12")
@StaticMetamodel(Pedido.class)
public class Pedido_ extends Entidade_ {

    public static volatile SingularAttribute<Pedido, Double> vlTotal;
    public static volatile SingularAttribute<Pedido, Cliente> cliente;
    public static volatile SingularAttribute<Pedido, Vendedor> vendedor;
    public static volatile ListAttribute<Pedido, Prato> pratos;
    public static volatile SingularAttribute<Pedido, Long> idPedido;
    public static volatile SingularAttribute<Pedido, Date> dtPedido;

}