package com.algamoneyapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "permissao")
public class Permissao {


    @Id
    private long condigo;

    private String descricao;

    public long getCondigo() {
        return condigo;
    }

    public void setCondigo(long condigo) {
        this.condigo = condigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Permissao permissao = (Permissao) o;
        return getCondigo() == permissao.getCondigo() &&
              Objects.equals(getDescricao(), permissao.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCondigo(), getDescricao());
    }
}
