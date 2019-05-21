package br.com.almocofacil.entidade;

import br.com.almocofacil.entidade.CartaoCredito;
import br.com.almocofacil.entidade.Empresa;
import br.com.almocofacil.entidade.Pedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-05-18T10:15:12")
@StaticMetamodel(Cliente.class)
public class Cliente_ extends Usuario_ {

    public static volatile SingularAttribute<Cliente, CartaoCredito> cartaoCredito;
    public static volatile ListAttribute<Cliente, Pedido> pedidos;
    public static volatile SingularAttribute<Cliente, Empresa> empresa;

}