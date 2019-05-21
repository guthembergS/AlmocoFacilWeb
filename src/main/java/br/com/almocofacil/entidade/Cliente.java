package br.com.almocofacil.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.validator.constraints.CreditCardNumber;

/**
 *
 * @author guthemberg
 */

@Entity
@DiscriminatorValue(value = "C")
@NamedQueries(
        {
            @NamedQuery(
                    name = Cliente.CLIENTE_POR_ID,
                    query = "SELECT c FROM Cliente c WHERE c.idUsuario = ?1"
            ),
            @NamedQuery(
                    name = Cliente.CLIENTE_POR_NOME,
                    query = "SELECT c FROM Cliente c WHERE c.nome = ?1"
            )
        }
)

//@PrimaryKeyJoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
public class Cliente extends Usuario implements Serializable {

    public static final String CLIENTE_POR_ID = "ClientePorId";
    public static final String CLIENTE_POR_NOME = "ClientePorNome";
    
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID_EMPRESA")
    protected Empresa empresa;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, optional = true)
    @JoinColumn(name = "ID_CARTAO_CREDITO", referencedColumnName = "ID_CARTAO_CREDITO")
    protected CartaoCredito cartaoCredito;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    protected List<Pedido> pedidos = new ArrayList<Pedido>();

    public Empresa getEmpresa() {
        return empresa;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean setPedidos(Pedido pedido) {
        return this.pedidos.add(pedido);
    }

    public void setCartaoCredito(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }
}
