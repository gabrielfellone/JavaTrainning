package es.indra.ws.soap.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import es.indra.ws.soap.model.Pessoas;

public interface PessoaRepos extends JpaRepository<Pessoas, Integer> {

}
