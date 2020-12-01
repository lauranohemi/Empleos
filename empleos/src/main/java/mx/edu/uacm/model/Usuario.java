package mx.edu.uacm.model;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import mx.edu.uacm.exceptions.ClaseException;

/**
 * 
 * @author Morales Pablo Laura Nohemi
 * fecha: fecha en la que se dio de alta el usuario en el sistema
 * estatus: *******pendiente 
 *
 */
public class Usuario {
	
	private String username;
	private String nombre;
	private String apellido;
	private String email;
	private String password;
	private Integer estatus;
	private Calendar fechaRegistro;
	
	private List<Perfil> perfiles;
	
	private final String EXP_REGULAR_USERNAME = "^[a-zA-Z0-9][A-Za-z0-9]{4,15}$";
	private final String EXP_REGULAR_NOMBRE_APELLIDO = "^([A-Za-zÁÉÍÓÚñáéíóúÑ]*?[A-Za-zÁÉÍÓÚñáéíóúÑ\\']+[\\s])+([A-Za-zÁÉÍÓÚñáéíóúÑ]*?[A-Za-zÁÉÍÓÚñáéíóúÑ\\'])+[\\s]?([A-Za-zÁÉÍÓÚñáéíóúÑ]*?[A-Za-zÁÉÍÓÚñáéíóúÑ\\'])?$";
	private final String EXP_REGULAR_EMAIL = "^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$";
	private final String EXP_REGULAR_PASSWORD = "^(?=.*\\d)(?=.*[\\u0021-\\u002b\\u003c-\\u0040-\\u005F])(?=.*[A-Z])(?=.*[a-z])\\S{8,16}$";
	
	public Usuario() {
		
	}
	
	public Usuario(String username, String nombre, String apellido, String email, String password, Integer estatus,
			Calendar fechaRegistro, List<Perfil> perfiles) throws ClaseException {
		setUsername(username);
		setNombre(nombre);
		setApellido(apellido);
		setEmail(email);
		setPassword(password);
		setEstatus(estatus);
		setFechaRegistro(fechaRegistro);
		this.perfiles = perfiles;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) throws ClaseException {
		if (Pattern.matches(EXP_REGULAR_USERNAME, username))
			this.username = username;
		else
			throw new ClaseException("Error :" + username + Usuario.class);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws ClaseException {
		if (Pattern.matches(EXP_REGULAR_NOMBRE_APELLIDO, nombre))
			this.nombre = nombre;
		else
			throw new ClaseException("Error :" + nombre + Usuario.class);
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) throws ClaseException {
		if (Pattern.matches(EXP_REGULAR_NOMBRE_APELLIDO, apellido))
			this.apellido = apellido;
		else
			throw new ClaseException("Error :" + apellido + Usuario.class);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws ClaseException {
		if (Pattern.matches(EXP_REGULAR_EMAIL, email))
			this.email = email;
		else
			throw new ClaseException("Error :" + email + Usuario.class);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws ClaseException {
		if (Pattern.matches(EXP_REGULAR_PASSWORD, password))
			this.password = password;
		else
			throw new ClaseException("Error :" + password + Usuario.class);	
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) throws ClaseException {
		if (estatus == 0 || estatus == 1)
			this.estatus = estatus;
		else
			throw new ClaseException("Error :" + estatus + Usuario.class);	
	}

	public Calendar getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Calendar fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public List<Perfil> getPerfiles() {
		return perfiles;
	}

	public void setPerfiles(List<Perfil> perfiles) {
		this.perfiles = perfiles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((estatus == null) ? 0 : estatus.hashCode());
		result = prime * result + ((fechaRegistro == null) ? 0 : fechaRegistro.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((perfiles == null) ? 0 : perfiles.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (estatus == null) {
			if (other.estatus != null)
				return false;
		} else if (!estatus.equals(other.estatus))
			return false;
		if (fechaRegistro == null) {
			if (other.fechaRegistro != null)
				return false;
		} else if (!fechaRegistro.equals(other.fechaRegistro))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (perfiles == null) {
			if (other.perfiles != null)
				return false;
		} else if (!perfiles.equals(other.perfiles))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [username=" + username + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", password=" + password + ", estatus=" + estatus + ", fechaRegistro=" + fechaRegistro + ", perfiles="
				+ perfiles + "]";
	}
}
