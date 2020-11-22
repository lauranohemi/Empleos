package mx.edu.uacm.model;

import java.util.Calendar;

/**
 * 
 * @author Morales Pablo Laura Nohemi
 * @nombre: Nombre de la oferta de trabajo.
 * @descripcion: Breve descripcion de la oferta de  trabajo.
 * @fecha: fecha de publicación de la oferta de trabajo.
 * @salario: Salario aproximado que se ofrece por el trabajo.
 * @estaus: Valores:[Creado, Aprobado, Eliminado].
 * @destacado: Valores:[0, 1]. 0:No se muestra en la pagina principal | 1:Se muestra
 * en la pagina principal.
 * @imagen: Nombre del archivo de la imagen del logotipo de la empresa que ofrece el trabajo
 * @detalles: detalles de la oferta de trabajo.
 *  
 */
public class Vacante {
	
	private String nombre; 
	private String descripcion;
	private Double salario;
	private Integer destacado;
	private Calendar fecha;
	private String imagen;
	private String estatus;
	private String detalles;
	
	public Vacante() {
		
	}

	public Vacante(String nombre, String descripcion, Double salario, Integer destacado, Calendar fecha, String imagen,
			String estatus, String detalles) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.salario = salario;
		this.destacado = destacado;
		this.fecha = fecha;
		this.imagen = imagen;
		this.estatus = estatus;
		this.detalles = detalles;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getDestacado() {
		return destacado;
	}

	public void setDestacado(Integer destacado) {
		this.destacado = destacado;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	
	public void reset() {
		this.imagen=null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((destacado == null) ? 0 : destacado.hashCode());
		result = prime * result + ((detalles == null) ? 0 : detalles.hashCode());
		result = prime * result + ((estatus == null) ? 0 : estatus.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((imagen == null) ? 0 : imagen.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((salario == null) ? 0 : salario.hashCode());
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
		Vacante other = (Vacante) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (destacado == null) {
			if (other.destacado != null)
				return false;
		} else if (!destacado.equals(other.destacado))
			return false;
		if (detalles == null) {
			if (other.detalles != null)
				return false;
		} else if (!detalles.equals(other.detalles))
			return false;
		if (estatus == null) {
			if (other.estatus != null)
				return false;
		} else if (!estatus.equals(other.estatus))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (imagen == null) {
			if (other.imagen != null)
				return false;
		} else if (!imagen.equals(other.imagen))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (salario == null) {
			if (other.salario != null)
				return false;
		} else if (!salario.equals(other.salario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vacante [nombre=" + nombre + ", descripcion=" + descripcion + ", salario=" + salario + ", destacado="
				+ destacado + ", fecha=" + fecha + ", imagen=" + imagen + ", estatus=" + estatus + ", detalles="
				+ detalles + "]";
	}
	
	

}
