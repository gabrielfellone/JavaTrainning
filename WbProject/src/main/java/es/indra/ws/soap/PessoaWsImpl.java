package es.indra.ws.soap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.indra.ws.soap.model.Pessoas;
import es.indra.ws.soap.repos.PessoaRepos;

@Service
public class PessoaWsImpl implements PessoaWs {
	
	@Autowired
	private PessoaRepos pessoaRep;

	@Override
	public List<Pessoas> getPessoas() {

		return pessoaRep.findAll();
	}

	@Override
	public Pessoas getPessoa(int id) {

		return pessoaRep.findById(id).get();
	}
	
	@Override
	public void deletePessoa(int id) {
	  pessoaRep.deleteById(id);
	}
	
	@Override
	public Pessoas insertPessoa(Pessoas pessoa) {
		return pessoaRep.save(pessoa);
	}

}
