package br.com.almocofacil.entidade;

import br.com.almocofacil.entidade.Cliente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-05-18T10:15:12")
@StaticMetamodel(CartaoCredito.class)
public class CartaoCredito_ extends Entidade_ {

    public static volatile SingularAttribute<CartaoCredito, Date> dataExpiracao;
    public static volatile SingularAttribute<CartaoCredito, Cliente> dono;
    public static volatile SingularAttribute<CartaoCredito, String> numero;
    public static volatile SingularAttribute<CartaoCredito, String> bandeira;
    public static volatile SingularAttribute<CartaoCredito, Long> idCartaoCredito;

}