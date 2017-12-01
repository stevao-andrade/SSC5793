package ssc5094.WebserviceProject.Model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe que representa o CPF. Possui 2 atributos que representam o numero do
 * CPF e o digito verificador Também possui um método para validar dado numero
 * de um CPF
 * 
 * @author stevao & marcelo
 *
 */

@SuppressWarnings("restriction")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPF", propOrder = { "digitos", "verificador" })
public class CPF {

	private int digitos;
	private int verificador;

	public CPF() {

	}

	public CPF(int digitos, int verificador) {
		this.digitos = digitos;
		this.verificador = verificador;
	}

	public int getDigitos() {
		return digitos;
	}

	public void setDigitos(int digitos) {
		this.digitos = digitos;
	}

	public int getVerificador() {
		return verificador;
	}

	public void setVerificador(int verificador) {
		this.verificador = verificador;
	}

	/**
	 * Verifica se um dado CPF é valido ou não
	 * 
	 * @param cpf
	 *            String contendo 11 digitos do CPF
	 * @return um booleano que indica se o cpf é valido ou não
	 */
	public static boolean verificaCPF(String cpf) {

		int quebra[] = new int[11];
		int primeiroVerificador, segundoVerificador;
		int soma = 0;
		boolean valido1 = false;
		boolean valido2 = false;

		if (cpf.length() < 11 || cpf.length() > 11) // verifica o comprimento do cpf passado
			return false;

		for (int i = 0; i < 11; i++) {
			quebra[i] = cpf.charAt(i);
			quebra[i] = quebra[i] - 48;
		}

		for (int i = 10, k = 0; i >= 2; i--, k++) {
			primeiroVerificador = quebra[k] * i;
			soma = soma + primeiroVerificador;
		}

		int verificador = soma % 11;

		if (verificador == 0 || verificador == 1) { // penultimo primeiro verificador
			if (quebra[9] == 0) {
				valido1 = true;
			}
		} else {
			if (quebra[9] == 11 - verificador) { // penultimo primeiro verificador
				valido1 = true;
			}
		}

		soma = 0;

		for (int i = 11, k = 0; i >= 2; i--, k++) {
			segundoVerificador = quebra[k] * i;
			soma = soma + segundoVerificador;
		}

		verificador = soma % 11;

		if (verificador == 0 || verificador == 1) {
			if (quebra[10] == 0) { // ultimo digito verificador
				valido2 = true;
			}
		} else {
			if (quebra[10] == 11 - verificador) { // ultimo digito verificador
				valido2 = true;
			}
		}

		return (valido1 && valido2);
	}

	public static boolean verificaObjetoCPF(CPF cpf) {

		String digitos = String.format("%09d", cpf.getDigitos());
		String dv = Integer.toString(cpf.getVerificador());

		String stringCPF = digitos + dv;

		int quebra[] = new int[11];
		int primeiroVerificador, segundoVerificador;
		int soma = 0;
		boolean valido1 = false;
		boolean valido2 = false;

		if (stringCPF.length() < 11 || stringCPF.length() > 11) // verifica o comprimento do cpf passado
			return false;

		for (int i = 0; i < 11; i++) {
			quebra[i] = stringCPF.charAt(i);
			quebra[i] = quebra[i] - 48;
		}

		for (int i = 10, k = 0; i >= 2; i--, k++) {
			primeiroVerificador = quebra[k] * i;
			soma = soma + primeiroVerificador;
		}

		int verificador = soma % 11;

		if (verificador == 0 || verificador == 1) { // penultimo primeiro verificador
			if (quebra[9] == 0) {
				valido1 = true;
			}
		} else {
			if (quebra[9] == 11 - verificador) { // penultimo primeiro verificador
				valido1 = true;
			}
		}

		soma = 0;

		for (int i = 11, k = 0; i >= 2; i--, k++) {
			segundoVerificador = quebra[k] * i;
			soma = soma + segundoVerificador;
		}

		verificador = soma % 11;

		if (verificador == 0 || verificador == 1) {
			if (quebra[10] == 0) { // ultimo digito verificador
				valido2 = true;
			}
		} else {
			if (quebra[10] == 11 - verificador) { // ultimo digito verificador
				valido2 = true;
			}
		}

		return (valido1 && valido2);
	}

}
