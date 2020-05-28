package br.gov.sp.fatec;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculadoraTest {
	private Calculadora c = new Calculadora();
	
	@Test
	public void soma() {
		double r = c.somar(3, 2);
		assertEquals(5, r, 0);
	}
	@Test
	public void subtrai() {
		double r=c.subtrair(8, 7);
		assertEquals(1, r, 0);
	}
	@Test
	public void divide() {
		double r=c.dividir(20, 5);
		assertEquals(4, r, 0);
	}
	@Test
	public void multiplica() {
		double r=c.multiplicar(5, 3);
		assertEquals(15, r, 0);
	}
	@Test
	public void raiz() {
		double r=c.raiz(25);
		assertEquals(5, r, 0);
	}
	@Test
	public void quadrado() {
		double r=c.quadrado(3);
		assertEquals(9, r, 0);
	}
	

}
