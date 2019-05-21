package br.com.almocofacil.entidade;

import br.com.almocofacil.entidade.Cliente;
import br.com.almocofacil.entidade.EnderecoEntrega;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-05-18T10:15:12")
@StaticMetamodel(Empresa.class)
public class Empresa_ extends Entidade_ {

    public static volatile SingularAttribute<Empresa, String> telefone;
    public static volatile SingularAttribute<Empresa, EnderecoEntrega> enderecoEntrega;
    public static volatile SingularAttribute<Empresa, Long> idEmpresa;
    public static volatile SingularAttribute<Empresa, String> cnpj;
    public static volatile ListAttribute<Empresa, Cliente> clientes;
    public static volatile SingularAttribute<Empresa, String> nmEmpresa;

}