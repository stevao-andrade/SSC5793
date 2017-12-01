package ssc5094.WebserviceProject.Client;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;

import com.google.gson.Gson;

import ssc5094.WebserviceProject.Model.CPF;
import ssc5094.WebserviceProject.Model.Pacote;
import ssc5094.WebserviceProject.Service.ICPFService;

public class CPFClient {

	public static void main(String[] args) {

		// URI base do servidor
		final String URI_CPF = "http://localhost:9001";

		// Instacia que invocará os serviços desejados
		ICPFService cpfService = JAXRSClientFactory.create(URI_CPF, ICPFService.class);

		// laço de execução
		while (true) {

			Gson g = new Gson(); // converter o objeto em string

			// menu para seleção de opção
			int opcao = menu();

			switch (opcao) {

			case 1:
				System.out.print("Informe o CPF a ser validado: ");
				Scanner entrada = new Scanner(System.in);
				String cpfString = entrada.nextLine();

				// Testando o serviço passando uma string
				String resultado = verifyByString(cpfService, cpfString);
				System.out.println(resultado);

				break;

			case 2:

				System.out.print("Informe os digitos do CPF: ");
				entrada = new Scanner(System.in);
				String stringDigitos = entrada.nextLine();

				System.out.print("Informe o verificador do CPF: ");
				entrada = new Scanner(System.in);
				String stringVerificador = entrada.nextLine();

				// parametros
				int verificador = Integer.parseInt(stringVerificador);
				int digitos = Integer.parseInt(stringDigitos);

				// nova instancia do objeto
				CPF cpfAValidar = new CPF(digitos, verificador);

				// recebe response da execução do serviço
				Response response = verifyByObject(cpfService, g.toJson(cpfAValidar));

				// verifica se o response recebido é valido ou não
				if (response.getStatus() == 500) { // Bad request

					String error = response.readEntity(String.class);
					System.out.println("Erro na solicitação.\nResposta do servidor: " + error);

				} else { // requisição com numero de CPF valido

					String cpfJSON = response.readEntity(String.class);

					CPF cpf = g.fromJson(cpfJSON, CPF.class);

					System.out.println("Objeto CPF valido!");
					System.out.println("Digitos: " + cpf.getDigitos());
					System.out.println("Verificador: " + cpf.getVerificador());

				}

				break;
			case 3:
				System.out.print("Informe a largura do pacote (cm): ");
				entrada = new Scanner(System.in);
				Double largura = entrada.nextDouble();

				System.out.print("Informe a altura do pacote (cm): ");
				entrada = new Scanner(System.in);
				Double altura = entrada.nextDouble();

				System.out.print("Informe o comprimento do pacote (cm): ");
				entrada = new Scanner(System.in);
				Double comprimento = entrada.nextDouble();

				// cria um mapa com os dados referentes aos dados repassados pelo usuario
				Map<String, Double> dados = new HashMap<String, Double>();
				dados.put("largura", largura);
				dados.put("altura", altura);
				dados.put("comprimento", comprimento);

				// envia o mapa com as informações de altura largura e comprimento para calculo
				// do serviço
				Response responseFrete = calculaFreteParametros(cpfService, g.toJson(dados));

				// recebe a resposta e depois apresenta o preço do frete
				String stringFrete = responseFrete.readEntity(String.class);
				Double frete = g.fromJson(stringFrete, Double.class);

				System.out.println("Valor do frete: R$" + frete);
				break;

			case 4:
				System.out.print("Informe a largura do pacote (cm): ");
				entrada = new Scanner(System.in);
				Double largura2 = entrada.nextDouble();

				System.out.print("Informe a altura do pacote (cm): ");
				entrada = new Scanner(System.in);
				Double altura2 = entrada.nextDouble();

				System.out.print("Informe o comprimento do pacote (cm): ");
				entrada = new Scanner(System.in);
				Double comprimento2 = entrada.nextDouble();

				// cria o pacota a ser enviado
				Pacote p = new Pacote(largura2, altura2, comprimento2);

				// envia o pacote e recebe como resposta o calculo do frete
				Response responseFrete2 = calculaFreteObjeto(cpfService, g.toJson(p));

				// faz a conversão do calculo do frete para Double e mostra o resultado
				String stringfrete2 = responseFrete2.readEntity(String.class);
				Double frete2 = Double.parseDouble(stringfrete2);
				System.out.println("Valor do frete: R$" + frete2);

				break;

			case 5:
				System.out.println("Encerrando a execução..");
				break;
			default:
				System.out.println("Opção invalida!");
				break;

			}

		}

	}

	/**
	 * Simplesmente faz a chamada do serviço
	 * 
	 * @param cpfService
	 *            - instancia do serviço com a URI de destino
	 * @param cpf
	 *            - Uma String que representa o numero de CPF a ser avaliado
	 * @return Uma string que identifica se o CPF informado é valido ou não
	 */
	private static String verifyByString(ICPFService cpfService, String cpf) {

		String response = cpfService.getVerifyCPF(cpf);

		return response;
	}

	/**
	 * Simplesmente uma chamada ao serviço
	 * 
	 * @param service
	 *            - Instancia do serviço para verificar CPF a partir de um objeto
	 * @param cpf
	 *            - Instancia da classe CPF a ser avaliada
	 * @return - Um objeto da classe Response que representa a resposta que contem
	 *         um CODIGO com o resultado da execução do serviço. Em caso de erro,
	 *         retorna ERRO 500
	 */
	private static Response verifyByObject(ICPFService service, String cpf) {

		Response response = service.getVerifyCPFObject(cpf);

		return response;
	}

	/**
	 * Simples chamada ao serviço com os parametros recebidos pelo usuario
	 * 
	 * @param service
	 *            - interface do serviço
	 * @param largura
	 *            - largura do pacote
	 * @param altura
	 *            - altura do pacote
	 * @param comprimento
	 *            - comprimento do pacote
	 * @return
	 */
	private static Response calculaFreteParametros(ICPFService service, String dados) {

		Response response = service.calculateShipment(dados);

		return response;
	}

	/**
	 * Simples chamada ao serviço utilizando como parametro um obj
	 * 
	 * @param service
	 *            serviço
	 * @param p
	 *            - obj da classe PackageSSC
	 * @return
	 */
	private static Response calculaFreteObjeto(ICPFService service, String pacoteString) {

		Response response = service.calculateShipmentObj(pacoteString);

		return response;
	}

	/**
	 * Menu para seleção de opcoes
	 * 
	 * @return retorna um inteiro equivalente à selecao do usuario
	 */
	public static int menu() {

		System.out.println("\n\n");

		// opçoes
		System.out.println("==========================================");
		System.out.println("| Verificador de CPF & Calculo de Frete  |");
		System.out.println("==========================================");
		System.out.println("| Opções:                                |");
		System.out.println("|    1. Verificar por String             |");
		System.out.println("|    2. Verificar por Objeto             |");
		System.out.println("|    3. Realizar calculo de frete        |");
		System.out.println("|    4. Realizar calculo de frete (Obj)  |");
		System.out.println("|    5. Sair                             |");
		System.out.println("==========================================");
		System.out.print("Selecione uma opção: ");

		int selecao;
		Scanner entrada = new Scanner(System.in);
		selecao = entrada.nextInt();

		return selecao;

	}

}