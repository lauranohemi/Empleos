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

public class UsuarioTest {
	
	static Logger logger = Logger.getLogger("class UsuarioTest");
	
	@Test 
	public void testSetUsernameUno() throws ClaseException {
		logger.log(Level.INFO, "testSetUsernameUno");
		Usuario u = new Usuario();
		u.setUsername("Mari248");
		String actual = u.getUsername();
		String expected = "Mari248";
		assertEquals(expected, actual);
	}
	
	@Test 
	public void testSetUsernameDos() {
		logger.log(Level.INFO, "testSetUsernameDos");
		Usuario u = new Usuario();
		assertThrows(ClaseException.class,
				() -> u.setUsername("#$%A89%&"));
	}
	
	@Test 
	public void testSetUsernameTres() {
		logger.log(Level.INFO, "testSetUsernameTres");
		Usuario u = new Usuario();
		assertThrows(ClaseException.class,
				() -> u.setUsername("noe"));
	}
	
	@Test 
	public void testSetUsernameCuatro() {
		logger.log(Level.INFO, "testSetUsernameCuatro");
		Usuario u = new Usuario();
		assertThrows(ClaseException.class,
				() -> u.setUsername("Mari248Altus123654789"));
	}
	
	@Test
	public void testSetNombreUno() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetNombreUno");
		Usuario u = new Usuario();
		u.setNombre("José Miguel");
		String actual = u.getNombre();
		String expected = "José Miguel";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetNombreDos() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetNombreDos");
		Usuario u = new Usuario();
		u.setNombre("Átomo Lucas");
		String actual = u.getNombre();
		String expected = "Átomo Lucas";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetNombreTres() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetNombreTres");
		Usuario u = new Usuario();
		u.setNombre("átomo lucas");
		String actual = u.getNombre();
		String expected = "átomo lucas";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetNombreCuatro() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetNombreCuatro");
		Usuario u = new Usuario();
		u.setNombre("Éliab Lucas");
		String actual = u.getNombre();
		String expected = "Éliab Lucas";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetNombreCinco() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetNombreCinco");
		Usuario u = new Usuario();
		u.setNombre("éliab lucas");
		String actual = u.getNombre();
		String expected = "éliab lucas";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetNombreSeis() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetNombreSeis");
		Usuario u = new Usuario();
		u.setNombre("ElÍzabeth González");
		String actual = u.getNombre();
		String expected = "ElÍzabeth González";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetNombreSiete() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetNombreSiete");
		Usuario u = new Usuario();
		u.setNombre("elí gonzález");
		String actual = u.getNombre();
		String expected = "elí gonzález";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetNombreOcho() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetNombreOcho");
		Usuario u = new Usuario();
		u.setNombre("Óctopus Martinez");
		String actual = u.getNombre();
		String expected = "Óctopus Martinez";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetNombreNueve() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetNombreNueve");
		Usuario u = new Usuario();
		u.setNombre("óctopus martinez");
		String actual = u.getNombre();
		String expected = "óctopus martinez";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetNombreDiez() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetNombreDiez");
		Usuario u = new Usuario();
		u.setNombre("Últilio Gomez");
		String actual = u.getNombre();
		String expected = "Últilio Gomez";
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testSetNombreOnce() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetNombreOnce");
		Usuario u = new Usuario();
		u.setNombre("útiliio gomez");
		String actual = u.getNombre();
		String expected = "útiliio gomez";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetNombreDoce()  {
		logger.log(Level.INFO, "testSetNombretestSetNombreDoce");
		Usuario u = new Usuario();
		assertThrows(ClaseException.class, 
				() -> u.setNombre("/41553$RFghg"));
	}
	
	
	@Test
	public void testSetApellidoUno() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetApellidoUno");
		Usuario u = new Usuario();
		u.setApellido("Josefina Morales");
		String actual = u.getApellido();
		String expected = "Josefina Morales";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetApellidoDos() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetApellidoDos");
		Usuario u = new Usuario();
		u.setApellido("Chávez Morelos");
		String actual = u.getApellido();
		String expected = "Chávez Morelos";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetApellidoTres() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetApellidoTres");
		Usuario u = new Usuario();
		u.setApellido("CHÁVEZ MORELOS");
		String actual = u.getApellido();
		String expected = "CHÁVEZ MORELOS";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetApellidoCuatro() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetApellidoCuatro");
		Usuario u = new Usuario();
		u.setApellido("Chéco López");
		String actual = u.getApellido();
		String expected = "Chéco López";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetApellidoCinco() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetApellidoCinco");
		Usuario u = new Usuario();
		u.setApellido("CHÉCO LÓPEZ");
		String actual = u.getApellido();
		String expected = "CHÉCO LÓPEZ";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetApellidoSeis() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetApellidoSeis");
		Usuario u = new Usuario();
		u.setApellido("Río Martinez");
		String actual = u.getApellido();
		String expected = "Río Martinez";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetApellidoSiete() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetApellidoSiete");
		Usuario u = new Usuario();
		u.setApellido("RÍO MARTINEZ");
		String actual = u.getApellido();
		String expected = "RÍO MARTINEZ";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetApellidoOcho() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetApellidoOcho");
		Usuario u = new Usuario();
		u.setApellido("óschokos duglas");
		String actual = u.getApellido();
		String expected = "óschokos duglas";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetApellidoNueve() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetApellidoNueve");
		Usuario u = new Usuario();
		u.setApellido("ÓSCHKOS DUGLAS");
		String actual = u.getApellido();
		String expected = "ÓSCHKOS DUGLAS";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetApellidoDiez() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetApellidoDiez");
		Usuario u = new Usuario();
		u.setApellido("chóselin navaro");
		String actual = u.getApellido();
		String expected = "chóselin navaro";
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testSetApellidoOnce() throws ClaseException {
		logger.log(Level.INFO, "testSetNombretestSetApellidoOnce");
		Usuario u = new Usuario();
		u.setApellido("CHÓSELIN NAVARO");
		String actual = u.getApellido();
		String expected = "CHÓSELIN NAVARO";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetApellidoDoce() {
		logger.log(Level.INFO, "testSetNombretestSetApellidoDoce");
		Usuario u = new Usuario();
		assertThrows(ClaseException.class, 
				() -> u.setApellido("123456789%&"));
	}
	
	@Test
	public void testSetEmailUno() throws ClaseException {
		logger.log(Level.INFO, "testsetEmailUno");
		Usuario u = new Usuario();
		u.setEmail("noe.chavez@estudiante.uacm.edu.mx");
		String actual = u.getEmail();
		String expected = "noe.chavez@estudiante.uacm.edu.mx";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testsetEmailDos() {
		logger.log(Level.INFO, "testsetEmailDos");
		Usuario u = new Usuario();
		assertThrows(ClaseException.class, 
				() -> u.setEmail("noe.chavez.estudiante.uacm.edu.mx"));
	}
	
	@Test
	public void testSetPasswordUno() throws ClaseException {
		logger.log(Level.INFO, "testsetPasswordUno");
		Usuario u = new Usuario();
		u.setPassword("Melchiah_1993");
		String actual = u.getPassword();
		String expected = "Melchiah_1993";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetPasswordDos() {
		logger.log(Level.INFO, "testsetPasswordDos");
		Usuario u = new Usuario();
		assertThrows(ClaseException.class, 
				() -> u.setPassword("me"));
	}
	
	@Test
	public void testSetPasswordTres() {
		logger.log(Level.INFO, "testsetPasswordTres");
		Usuario u = new Usuario();
		assertThrows(ClaseException.class, 
				() -> u.setPassword("nKov123456789$%&/"));
	}
	
	@Test
	public void testSetPasswordCuatro() {
		logger.log(Level.INFO, "testsetPasswordCuatro");
		Usuario u = new Usuario();
		assertThrows(ClaseException.class, 
				() -> u.setPassword("Maria4569"));
	}
	
	@Test
	public void testSetEstatusUno() throws ClaseException {
		logger.log(Level.INFO, "testSetEstatusUno");
		Usuario u = new Usuario();
		u.setEstatus(1);
		int actual = u.getEstatus();
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetEstatusDos() throws ClaseException {
		logger.log(Level.INFO, "testSetEstatusDos");
		Usuario u = new Usuario();
		u.setEstatus(0);
		int actual = u.getEstatus();
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetEstatusTres() {
		logger.log(Level.INFO, "testSetEstatusTres");
		Usuario u = new Usuario();
		assertThrows(ClaseException.class, 
				() -> u.setEstatus(10));
	}
	
	@Test
	public void testSetFechaRegistroUno() {
		logger.log(Level.INFO, "testSetFechaRegistroUno");
		Solicitud solicitud = new Solicitud();
		Calendar fecha = new GregorianCalendar(2020, 7, 5);
		solicitud.setFecha(fecha);
		Calendar actual = solicitud.getFecha();
		Calendar expected = new GregorianCalendar(2020, 7, 5);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSetFechaRegistroDos() {
		logger.log(Level.INFO, "testSetFechaRegistroDos");
		Solicitud solicitud = new Solicitud();
		Calendar fecha = new GregorianCalendar(2020, 7, 5);
		solicitud.setFecha(fecha);
		Calendar actual = solicitud.getFecha();
		Date expected = new Date(2020, 7, 5);
		assertNotEquals(expected, actual);
	}
	
}
