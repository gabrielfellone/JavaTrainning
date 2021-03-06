package es.indra.ws.soap;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class WebServiceConfig {
	
	@Autowired
	private Bus bus;
	
	@Autowired
	private PessoaWs pessoaService;

	private Endpoint endpoint;
	
	@Bean
	public Endpoint endpoint() {
		endpoint = new EndpointImpl(bus, pessoaService);
		endpoint.publish("/pessoas");
		return null;

	}
	
}
