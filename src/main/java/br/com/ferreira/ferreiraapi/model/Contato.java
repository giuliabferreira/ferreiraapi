package br.com.ferreira.ferreiraapi.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="contato")

public class Contato {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;


    private String descricao;
    private String  contato;

    @ManyToOne
    @JoinColumn(name="clienteid")
    private Cliente cliente;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return id == contato.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
