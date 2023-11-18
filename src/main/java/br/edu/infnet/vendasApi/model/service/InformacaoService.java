package br.edu.infnet.vendasApi.model.service;

import br.edu.infnet.vendasApi.model.domain.Informacao;
import br.edu.infnet.vendasApi.model.repository.InformacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformacaoService {

    @Autowired
    private InformacaoRepository informacaoRepository;
    public List<Informacao> obterLista() {
        return (List<Informacao>) informacaoRepository.findAll();
    }

    public Informacao incluir(Informacao informacao) {
        return informacaoRepository.save(informacao);
    }
}
