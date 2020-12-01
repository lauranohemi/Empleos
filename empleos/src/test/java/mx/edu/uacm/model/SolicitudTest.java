package mx.edu.uacm.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import mx.edu.uacm.exceptions.ClaseException;
import utils.Utileria;

public class SolicitudTest {
	
	static Logger logger = Logger.getLogger("class SolicitudTest");
	
	@Test
	public void testSetFechaUno() {
		logger.log(Level.INFO, "testSetFechaUno");
		Solicitud solicitud = new Solicitud();
		Calendar fecha = new GregorianCalendar(2020, 7, 5);
		solicitud.setFecha(fecha);
		Calendar actual = solicitud.getFecha();
		Calendar expected = new GregorianCalendar(2020, 7, 5);
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFechaDos() {
		logger.log(Level.INFO, "testSetFechaDos");
		Solicitud solicitud = new Solicitud();
		Calendar fecha = new GregorianCalendar(2020, 7, 5);
		solicitud.setFecha(fecha);
		Date fecha1 = new Date(2020, 7, 5);
		Calendar actual = solicitud.getFecha();
		Date expected = fecha1;
		assertNotEquals(expected, actual);
	}
	
	@Test
	public void testSetComentariosUno() throws ClaseException {
		logger.log(Level.INFO, "testSetComentariosUno");
		Solicitud s = new Solicitud();
		s.setComentarios("Esta es una descripción de comentarios de la clase Comentarios.");
		String actual = s.getComentarios();
		String expected = "Esta es una descripción de comentarios de la clase Comentarios.";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testComentariosDos() {
		logger.log(Level.INFO, "testComentariosDos");
		Solicitud s = new Solicitud();
		assertThrows(ClaseException.class, 
				() -> s.setComentarios("3sta es un@ descripción con c@racterés extraños"));
	}
	
	@Test
	public void testComentariosTres() {
		logger.log(Level.INFO, "testComentariosTres");
		Solicitud s = new Solicitud();
		assertThrows(ClaseException.class, 
				() -> s.setComentarios("A"));
	}
	
	@Test
	public void testComentariosCuatro() {
		logger.log(Level.INFO, "testComentariosCuatro");
		Solicitud s = new Solicitud();
		assertThrows(ClaseException.class, 
				() -> s.setComentarios("esta es una descripción con una longitud mayor a 350 caractere " + Utileria.agregarCaracteres(350)));
	}

}
