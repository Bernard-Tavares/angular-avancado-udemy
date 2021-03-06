package com.algamoneyapi.model;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Endereco {


    private String logradouro;

    private String numero;

    private String complemento;

    private String bairro;

    private String cep;

    private String cidade;

    private String estado;

    public Endereco() {
    }

    public Endereco(String logradouro, String numero, String complemento, String bairro, String cep, String cidade, String estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return getLogradouro().equals(endereco.getLogradouro()) &&
              getNumero().equals(endereco.getNumero()) &&
              getComplemento().equals(endereco.getComplemento()) &&
              getBairro().equals(endereco.getBairro()) &&
              getCep().equals(endereco.getCep()) &&
              getCidade().equals(endereco.getCidade()) &&
              getEstado().equals(endereco.getEstado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogradouro(), getNumero(), getComplemento(), getBairro(), getCep(), getCidade(), getEstado());
    }
}
