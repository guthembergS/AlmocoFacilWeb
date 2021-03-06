package br.com.artecolaborativa.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

/**
 *
 * @author guthemberg.souza
 */
@Entity
@DiscriminatorValue(value = "L")
@NamedQueries(
        {
            @NamedQuery(
                    name = "Lojista.PorNome",
                    query = "SELECT a FROM Lojista a WHERE a.nome = :nome"
            )
            ,
            @NamedQuery(
                    name = "Lojista.PorId",
                    query = "SELECT a FROM Lojista a WHERE a.idUsuario = :idUsuario"
            )
        }
)

public class Lojista extends Usuario implements Serializable {

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "LOJISTA_ARTESAO", joinColumns = {
        @JoinColumn(name = "ID_LOJISTA", referencedColumnName = "ID_USUARIO", nullable = false)},
            inverseJoinColumns = {
                @JoinColumn(name = "ID_ARTESAO", referencedColumnName = "ID_USUARIO", nullable = false)
            }
    )
    public List<Artesao> artesaos = new ArrayList<Artesao>();

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, optional = true)
    @JoinColumn(name = "ID_ENDERECO", referencedColumnName = "ID_ENDERECO")
    protected Endereco endereco;

    @Column(name = "VL_ALUGUEL")
    protected double aluguel;

    @Column(name = "TAXA_VENDA")
    protected double taxaVenda;

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setAluguel(Double aluguel) {
        this.aluguel = aluguel;
    }

    public Double getAluguel() {
        return aluguel;
    }

    public void setTaxaVenda(Double taxaVenda) {
        this.taxaVenda = taxaVenda;
    }

    public Double getTaxaVenda() {
        return taxaVenda;
    }

    public List<Artesao> getArtesaos() {
        return artesaos;
    }

    public boolean setArtesaos(Artesao artesao) {
        return this.artesaos.add(artesao);
    }
}
