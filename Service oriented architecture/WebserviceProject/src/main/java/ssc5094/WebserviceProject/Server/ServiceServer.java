package ssc5094.WebserviceProject.Server;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;
import org.apache.cxf.jaxrs.provider.JAXBElementProvider;

import ssc5094.WebserviceProject.Service.CPFService;

/**
 * Classe responsavel por representar o Servidor que disponibiliza 
 * o serviço para verificação de CPF
 * 
 * @author stevao & marcelo
 *
 */
public class ServiceServer {
	
	/**
	 * Basicamente cria um objeto JAXRSServerFactoryBean, que será responsavel por criar o objeto
	 * servidor, contendo um Singleton da classe CPFService, que ficará responsavel por atender às 
	 * solicitações vindas dos clientes, ou seja, verificar se um dado numero de CPF é valido ou não  
	 * 
	 */
	public static void main(String args[]) throws Exception {
		
		//criar o JAXRSServerFactoryBean e atrela a classe responsavel por gerenciar o serviço a ele.
		JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
		factoryBean.setResourceClasses(CPFService.class);
		factoryBean.setResourceProvider(new SingletonResourceProvider(new CPFService()));
		
		//especifica os tipos de dados que podem ser gerenciados pelo factoryBean. Nesse caso, XLM e JSON
		Map<Object, Object> extensionMappings = new HashMap<Object, Object>();
		extensionMappings.put("xml", MediaType.APPLICATION_XML);
		extensionMappings.put("json", MediaType.APPLICATION_JSON);
		factoryBean.setExtensionMappings(extensionMappings);
		
		List<Object> providers = new ArrayList<Object>();
		providers.add(new JAXBElementProvider());
		//providers.add(new JacksonJsonProvider());
		factoryBean.setProviders(providers);
		
		//define o endereço onde o serviço ficará disponivel 
		factoryBean.setAddress("http://localhost:9001/");
		
		//cria uma instancia do servidor e inicia-lo
		Server server = factoryBean.create();
		System.out.println("Servidor pronto...");
		
		//lê às informações recebidas
		System.in.read();
		
		//encerra a execução do servidor
		server.destroy();
		System.exit(0);
	}

}
