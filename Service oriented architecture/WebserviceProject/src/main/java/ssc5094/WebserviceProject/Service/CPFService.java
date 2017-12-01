package ssc5094.WebserviceProject.Service;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import ssc5094.WebserviceProject.Model.CPF;
import ssc5094.WebserviceProject.Model.Pacote;

/**
 * Implementa a interface que descreve o comportamento do serviço
 * 
 * @author stevao & marcelo
 *
 */
public class CPFService implements ICPFService {

	/**
	 * Simplesmente invoca o metodo estatico definido na classe CPF e retorna uma
	 * string que informa se o CPF requisitado possuem um valor valido ou não.
	 * 
	 * @param cpf
	 *            uma String que representa o numero de um cpf.
	 * 
	 */
	public String getVerifyCPF(String cpf) {

		boolean ehValido = CPF.verificaCPF(cpf);

		if (ehValido)
			return "CPF Válido";
		else
			return "CPF Inválido";
	}

	public Response getVerifyCPFObject(String cpfString) {

		// cria o objeto GSON para fazer a conversão e o objeto CPF
		Gson g = new Gson();
		CPF cpf = new CPF();

		// Faz a conversão do objeto enviado em JSON para instancia da classe CPF
		cpf = g.fromJson(cpfString, CPF.class);

		// verifica se o CPF passado no objeto é valido e retorna-o
		boolean ehValido = CPF.verificaObjetoCPF(cpf);

		// Devolver o resultado para o cliente
		Response response;

		// Converte novamente o obj para Json
		String cpfJSON = g.toJson(cpf);

		if (ehValido) {
			response = Response.ok().type(MediaType.APPLICATION_JSON).entity(cpfJSON).build();

			return response;
		} else {

			String erro = "O CPF Informado não possui um numero valido.";
			response = Response.status(500).type(MediaType.APPLICATION_JSON).entity(erro).build();

			return response;

		}

	}

	/**
	 * Cria uma instancia da classe Pacote com os dados recebidos como parametro e
	 * faz o calculo do frete retorna um response com as informações do valor do
	 * frete
	 */
	public Response calculateShipment(String dados) {

		Gson g = new Gson();
		Pacote p = new Pacote();
		Map<String, Double> dadosMap = g.fromJson(dados, HashMap.class);

		// seta os valores para a instancia da classe pacote
		p.setWidth( dadosMap.get("largura"));
		p.setHeight(dadosMap.get("altura"));
		p.setLength(dadosMap.get("comprimento"));
		
		// calcula o frete
		Double ship = p.calculateShipment();

		// envia a resposta com o calculo do frete
		Response response;
		response = Response.ok().type(MediaType.APPLICATION_JSON).entity(g.toJson(ship)).build();

		return response;
	}

	/**
	 * Serviço simplesmente faz uma chamada ao metodo calcular frete da classe
	 * PackageSSC e retorna o valor do frete
	 */
	public Response calculateShipmentObj(String pacoteString) {

		// converte o objeto de string para pacote
		Gson g = new Gson();
		Pacote p = new Pacote();
		p = g.fromJson(pacoteString, Pacote.class);

		// calcula o frete
		Double ship = p.calculateShipment();

		// devolve a resposta
		Response response;
		response = Response.ok().type(MediaType.APPLICATION_JSON).entity(g.toJson(ship)).build();

		return response;
	}

}
