package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class testCuenta {
	
	private static Cuenta cuenta;
	private static Cuenta cuenta12345;
	private static Cuenta cuenta67890;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta(0.0);
		cuenta12345 = new Cuenta(50.0);
		cuenta67890 = new Cuenta(0.0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta.setSaldo(0.0); //reinicia en cada prueba para que sean independiente
		cuenta12345.setSaldo(50.);
		cuenta67890.setSaldo(0.0);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngreso() {
		cuenta.ingreso(200);
		assertEquals(200, cuenta.getSaldo());
	}
	

	@Test
	void testReingreso() {
		cuenta.reintegro(200);
		assertEquals(-200, cuenta.getSaldo());
	}	
	
	 @Test
	 void test0014() {
		 cuenta12345.reintegro(200);
		 assertEquals(-150, cuenta12345.getSaldo());
		 cuenta67890.reintegro(350);
		 assertEquals(-350, cuenta67890.getSaldo());
		 cuenta12345.ingreso(100);
		 assertEquals(-50, cuenta12345.getSaldo());
		 cuenta67890.reintegro(200);
		 assertEquals(-500, cuenta67890.getSaldo()); //debe dar error
		 cuenta67890.reintegro(150);
		 assertEquals(-500, cuenta67890.getSaldo());
		 cuenta12345.reintegro(200);
		 assertEquals(-250, cuenta12345.getSaldo());
		 cuenta67890.ingreso(50);
		 assertEquals(-500, cuenta67890.getSaldo());
		 cuenta67890.reintegro(100);
		 assertEquals(-500, cuenta67890.getSaldo()); //debe da error
		 
		 
		 
	 }

}
