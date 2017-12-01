package ssc5094.WebserviceProject.Test;


import junit.framework.TestCase;
import ssc5094.WebserviceProject.Model.CPF;

public class UserTest extends TestCase {
		
	
	/**
	 * Simplesmente verifica se um determinado numero de CPF é validado de maneira correta
	 */
	public void testVerificaCPF() {
		assertTrue(CPF.verificaCPF("02742633359"));
	}

}
