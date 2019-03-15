package es.indra.ws.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import es.indra.ws.soap.model.Pessoas;

@WebService
public interface PessoaWs {
	@WebMethod
	List<Pessoas> getPessoas();

	@WebMethod
	Pessoas getPessoa(int id);
	
	@WebMethod
	void deletePessoa(int id);
	
	@WebMethod
	Pessoas insertPessoa(Pessoas pessoa);
}
