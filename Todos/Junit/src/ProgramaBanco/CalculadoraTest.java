package ProgramaBanco;
import static org.junit.jupiter.api.Assertions.*;
import Calculadora;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculadoraTest {

	
	@BeforeEach
	public void before() {
		//En este JUNIT 5. No funciona bien el assert equals en doubles. 
		System.out.println("Se ejecuta");
	}
	
	
	
	@Test
	void sumarTest() {
		int a = 3, b = 2;
		int resultado = Calculadora.suma(a,b);
		int esperado = 5; //3 + 2 = 5;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void dividirTest() {
		int a = 10, b = 2;
		int resultado = Calculadora.division(a,b);
		int esperado = 5; //3 + 2 = 5;
		assertEquals(esperado, resultado);
	}

}
