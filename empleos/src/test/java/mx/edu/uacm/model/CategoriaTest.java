package mx.edu.uacm.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import mx.edu.uacm.exceptions.ClaseException;
import utils.Utileria;

public class CategoriaTest {
	
	static Logger logger = Logger.getLogger("class CategoriaTest");
	
	@Test
	public void testCosntrutorCategoriaUno() throws ClaseException {
		logger.log(Level.INFO, "testCosntrutorCategoriaUbo");
		Categoria c = new Categoria (
				"Desarrollo Móvil", 
				"Se solicita desarrollador mólvil con experiencia en Adnroid Strudio y lenguaje Java o Kotlin");
		Categoria c2 = new Categoria (
				"Desarrollo Móvil", 
				"Se solicita desarrollador mólvil con experiencia en Adnroid Strudio y lenguaje Java o Kotlin");
		assertEquals(c, c2);
	}
	
	@Test
	public void testCosntrutorCategoriaDos() throws ClaseException {
		logger.log(Level.INFO, "testCosntrutorCategoriaDos");
		Categoria c = new Categoria (
				"Desarrollo Móvil", 
				"Se solicita desarrollador mólvil con experiencia en Adnroid Strudio y lenguaje Java o Kotlin");
		Usuario u = new Usuario();
		assertNotEquals(c, u);
	}
	
	@Test
	public void testSetNombreCasoPruebaUno() throws ClaseException {
		logger.log(Level.INFO, "testSetNombreCasoPruebaUno");
		Categoria c = new Categoria("Desarrollo Móvil", 
				"Se solicitan cincuenta vacantes para desarrollo de producto robusto");
		String expected = "Desarrollo Móvil";
		String actual = c.getNombre(); 
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetNombreCasoPruebaDos() throws ClaseException {
		logger.log(Level.INFO, "testSetNombreCasoPruebaDos");
		Categoria c = new Categoria();
		assertThrows(ClaseException.class, 
				()->c.setNombre("75545ABC"));
	}
	
	@Test
	public void testSetNombreCasoPruebaTres() throws ClaseException {
		logger.log(Level.INFO, "testSetNombreCasoPruebaTres");
		Categoria c = new Categoria();
		assertThrows(ClaseException.class,
				()->c.setNombre("1"));
	}
	
	@Test
	public void testSetNombreCasoPruebaCuatro()  throws ClaseException {
		logger.log(Level.INFO, "testSetNombreCasoPruebaCuatro");
		Categoria c = new Categoria();
		assertThrows(ClaseException.class,
				()->c.setNombre("Desarrollo móvil, con capacidades de  DEVOPS" 
		+ Utileria.agregarCaracteres(350)));
	}
	
	
}
