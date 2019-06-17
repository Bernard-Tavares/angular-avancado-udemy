package com.algamoneyapi.repository.filter;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class LancamentoFilter {

    private String descricao;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataVencimentoDe;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate datavencimentoAte;


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataVencimentoDe() {
        return dataVencimentoDe;
    }

    public void setDataVencimentoDe(LocalDate dataVencimentoDe) {
        this.dataVencimentoDe = dataVencimentoDe;
    }

    public LocalDate getDatavencimentoAte() {
        return datavencimentoAte;
    }

    public void setDatavencimentoAte(LocalDate datavencimentoAte) {
        this.datavencimentoAte = datavencimentoAte;
    }
}
