package ssc5094.WebserviceProject.Service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ssc5094.WebserviceProject.Model.Pacote;

/**
 * Simples interface que descreve o comportamento do serviço provido pelo WS
 * 
 * O serviço é definido por meio de uma interface pois ambos servidor e cliente
 * deverão ter acesso à interface a fim de respectivamente disponibilizar e
 * consultar o serviço.
 * 
 * @author stevao & marcelo
 *
 */

@Path("service")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public interface ICPFService {

	/**
	 * Interface que descreve o comportamento do serviço.
	 * 
	 * @param CPF
	 *            uma string com o numero de um CPF
	 * @return retorna uma string informando se o CPF é valido ou não
	 */
	@POST
	@Consumes("text/plain")
	@Produces("text/plain")
	@Path("verifyCPF/{varX}")
	public String getVerifyCPF(@PathParam("varX") String CPF);

	/**
	 * Interface que descreve o comportamento do serviço ao trabalhar com Json
	 * 
	 * @param cpf
	 *            representação em Json de um objeto do tipo CPF
	 * @return retorna o objeto CPF caso o numero do CPF seja valido, do contrario,
	 *         retorna NULL
	 */
	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Path("verifyCPFObject/")
	public Response getVerifyCPFObject(String cpf);

	/**
	 * Interface que descreve o comportamento do serviço ao trabalhar com Json
	 * 
	 * @param dados
	 *            um dicionario que contem os informações valores de largura, altura
	 *            e comprimento do pacote que deseja-se calcular o frete
	 * @return Response que contém o preço do frete, caso os dados enviados estejam
	 *         de acordo com o esperado, ou uma msg de erro.
	 */
	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Path("calculateShipment/")
	public Response calculateShipment(String dados);

	/**
	 * Interface que descreve o comportamento do serviço ao trabalhar com Json
	 * 
	 * @param height
	 *            - altura do pacote
	 * @param width
	 *            - largura do pacote
	 * @param lenght
	 *            - comprimento do pacote
	 * @return Response que contém o preço do frete, caso os dados enviados estejam
	 *         de acordo com o esperado, ou uma msg de erro.
	 */
	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Path("calculateShipmentObj/")
	public Response calculateShipmentObj(String pacoteString);
}
