package br.edu.infnet.vendasApi.controller;

import br.edu.infnet.vendasApi.model.domain.Informacao;
import br.edu.infnet.vendasApi.model.service.InformacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/informacao")
public class InformacaoController {

    @Autowired
    private InformacaoService informacaoService;

    @GetMapping(value = "/lista")
    public List<Informacao> obterLista(){
        return informacaoService.obterLista();
    }

    @PostMapping(value = "/incluir")
    public Informacao incluir(@RequestBody Informacao informacao){
        return informacaoService.incluir(informacao);
    }
}
