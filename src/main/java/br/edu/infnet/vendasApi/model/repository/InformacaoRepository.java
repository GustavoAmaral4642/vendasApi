package br.edu.infnet.vendasApi.model.repository;

import br.edu.infnet.vendasApi.model.domain.Informacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformacaoRepository extends CrudRepository<Informacao, Integer> {


}
