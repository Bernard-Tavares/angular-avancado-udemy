package com.algamoneyapi.service;

import com.algamoneyapi.service.exception.PessoaInexistenteOuInativaException;
import com.algamoneyapi.model.Lancamento;
import com.algamoneyapi.model.Pessoa;
import com.algamoneyapi.repository.LancamentoRepository;
import com.algamoneyapi.repository.PessoaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class LancamentoService {


    @Autowired
    private LancamentoRepository lancamentoRepository;


    @Autowired
    private PessoaRepository pessoaRepository;

    public Lancamento atualizar(Long codigo, Lancamento lancamento) {


        Lancamento lancamentoSalva = buscarLancamentoPeloCodigo(codigo);
        BeanUtils.copyProperties(lancamento, lancamentoSalva, "codigo");
        return lancamentoRepository.save(lancamentoSalva);

    }


    private Lancamento buscarLancamentoPeloCodigo(Long codigo) {
        Lancamento lancamentoSalva = lancamentoRepository.findOne(codigo);
        if (lancamentoSalva == null) {
            throw new EmptyResultDataAccessException(1);
        }
        return lancamentoSalva;
    }



    public Lancamento salvar(Lancamento lancamento) {
        Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
        if (pessoa == null || pessoa.isInativo()){
            throw new PessoaInexistenteOuInativaException();
        }

        return lancamentoRepository.save(lancamento);
    }
}

