package mx.edu.uacm.model;

import java.util.regex.Pattern;

import org.apache.tomcat.util.buf.CharsetCache;

import mx.edu.uacm.exceptions.ClaseException;

/**
 * 
 * @author Chávez Morelos Noé Baldemar
 * @descripcion: Breve descripcion de la categoria para la que se realiza la oferta de trabajo.
 * @nombre: Nombre de la categoria para la que se lanza la vacante.
 */
public class Categoria {
	
	private String nombre;
    private String descripcion;
    
    private final String EXP_REGULAR_NOMBRE ="[A-Za-zÁÉÍÓÚñáéíóúÑ ]{2,35}";
    private final String EXP_REGULAR_DESCRIPCION = "[a-zA-Záéíóú0-9]?([a-zA-Z0-9áéíóú^\\n. ]){5,350}";
    
    public Categoria() {
    	
    }
    
	public Categoria(String nombre, String descripcion) throws ClaseException {
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) throws ClaseException {
		if (Pattern.matches(EXP_REGULAR_NOMBRE, nombre)) 
			this.nombre = nombre;
		else 
			throw new ClaseException("Error: " + nombre);
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) throws ClaseException {
		if (Pattern.matches(EXP_REGULAR_DESCRIPCION, descripcion)) 
			this.descripcion = descripcion;
		else 
			throw new ClaseException("Error: " + descripcion);
	}

	@Override
	public String toString() {
		return "Categoria [nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Categoria other = (Categoria) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
    
	
    
}
