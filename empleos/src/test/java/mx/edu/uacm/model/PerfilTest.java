package mx.edu.uacm.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import mx.edu.uacm.exceptions.ClaseException;
import utils.Utileria;

public class PerfilTest {
	
	static Logger logger = Logger.getLogger("class PerfilTest");
	
	@Test
	public void testSetPerfilPruebaUno() throws ClaseException {
		logger.log(Level.INFO, "testSetPerfilPruebaUno");
		Perfil p = new Perfil();
		p.setPerfil("Morales Navarro Gomez");
		String actual = p.getPerfil();
		String expected = "Morales Navarro Gomez";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetPerfilPruebaDos() {
		logger.log(Level.INFO, "testSetPerfilPruebaDos");
		Perfil p = new Perfil();
		assertThrows(ClaseException.class, 
				() -> p.setPerfil("P@blo M3ndez"));
	}
	
	@Test
	public void testSetPerfilPruebaTres() {
		logger.log(Level.INFO, "testSetPerfilPruebaTres");
		Perfil p = new Perfil();
		assertThrows(ClaseException.class, 
				() -> p.setPerfil("N"));
	}
	
	@Test
	public void testSetPerfilPruebaCuatro() {
		logger.log(Level.INFO, "testSetPerfilPruebaCuatro");
		Perfil p = new Perfil();
		assertThrows(ClaseException.class, 
				() -> p.setPerfil("Nombre muy largo mayor a " + Utileria.agregarCaracteres(350) + " caracteres"));
	}

}
