package mx.edu.uacm.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import mx.edu.uacm.exceptions.ExceptionCategoria;
import utils.Utileria;

public class CorreoTest {
	
	static Logger logger = Logger.getLogger("class CorreoTest");
	
	@Test
	public void testSetDestinatarioUno() throws ExceptionCategoria {
		logger.log(Level.INFO, "testSetDestinatarioUno");
		Correo c = new Correo();
		c.setDestinatario("melchiah@corporativo.dissek.com.mx");
		String expected = c.getDestinatario();
		String actual = "melchiah@corporativo.dissek.com.mx";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetDestinatarioDos() throws ExceptionCategoria { 
		logger.log(Level.INFO, "testSetDestinatarioDos");
		Correo c = new Correo();
		assertThrows(ExceptionCategoria.class, 
				() -> c.setDestinatario("melchiah.comporativo.dissek.com.mx"));
	}
	
	@Test
	public void testSetEmisorUno() throws ExceptionCategoria {
		logger.log(Level.INFO, "testSetEmisorUno");
		Correo c = new Correo();
		c.setEmisor("Morales Navarro Gomez");
		String expected = c.getEmisor();
		String actual = "Morales Navarro Gomez";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetEmisorDos() throws ExceptionCategoria { 
		logger.log(Level.INFO, "testSetEmisorDos");
		Correo c = new Correo();
		assertThrows(ExceptionCategoria.class, 
				() -> c.setEmisor("P@blo M3ndez"));
	}
	
	@Test
	public void testSetEmisorTres() throws ExceptionCategoria { 
		logger.log(Level.INFO, "testSetEmisorTres");
		Correo c = new Correo();
		assertThrows(ExceptionCategoria.class, 
				() -> c.setEmisor("N"));
	}
	
	@Test
	public void testSetEmisorCuatro() throws ExceptionCategoria { 
		logger.log(Level.INFO, "testSetEmisorCuatro");
		Correo c = new Correo();
		assertThrows(ExceptionCategoria.class, 
				() -> c.setEmisor("Nombre muy largo mayor caracteres prueba prueba aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
	}
	
	@Test
	public void testSetAsuntoUno() throws ExceptionCategoria {
		logger.log(Level.INFO, "testSetAsuntoUno");
		Correo c = new Correo();
		c.setAsunto("Morales Navarro Gomez");
		String expected = c.getAsunto();
		String actual = "Morales Navarro Gomez";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetAsuntoDos() throws ExceptionCategoria { 
		logger.log(Level.INFO, "testSetAsuntoDos");
		Correo c = new Correo();
		assertThrows(ExceptionCategoria.class, 
				() -> c.setAsunto("P@blo M3ndez"));
	}
	
	@Test
	public void testSetAsuntoTres() throws ExceptionCategoria { 
		logger.log(Level.INFO, "testSetAsuntoTres");
		Correo c = new Correo();
		assertThrows(ExceptionCategoria.class, 
				() -> c.setAsunto("N"));
	}
	
	@Test
	public void testSetAsuntoCuatro() throws ExceptionCategoria { 
		logger.log(Level.INFO, "testSetAsuntoCuatro");
		Correo c = new Correo();
		assertThrows(ExceptionCategoria.class, 
				() -> c.setAsunto("Nombre muy largo mayor " +  Utileria.agregarCaracteres(30) + " caracteres"));
	}
	
	@Test
	public void testSetCuerpoUno() throws ExceptionCategoria {
		logger.log(Level.INFO, "testSetCuerpoUno");
		Correo c = new Correo();
		c.setCuerpo("Morales Navarro Gomez");
		String expected = c.getCuerpo();
		String actual = "Morales Navarro Gomez";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetCuerpoDos() throws ExceptionCategoria { 
		logger.log(Level.INFO, "testSetCuerpoDos");
		Correo c = new Correo();
		assertThrows(ExceptionCategoria.class, 
				() -> c.setAsunto("P@blo M3ndez(2)"));
	}
	
	@Test
	public void testSetCuerpoTres() throws ExceptionCategoria { 
		logger.log(Level.INFO, "testSetCuerpoTres");
		Correo c = new Correo();
		assertThrows(ExceptionCategoria.class, 
				() -> c.setAsunto("N"));
	}
	
	@Test
	public void testSetCuerpoCuatro() throws ExceptionCategoria { 
		logger.log(Level.INFO, "testSetCuerpoCuatro");
		Correo c = new Correo();
		assertThrows(ExceptionCategoria.class, 
				() -> c.setAsunto("Nombre muy largo mayor " +  Utileria.agregarCaracteres(350) + " caracteres"));
	}


}
