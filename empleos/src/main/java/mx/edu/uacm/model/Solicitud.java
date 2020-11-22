package mx.edu.uacm.model;

import java.util.Calendar;

/**
 * 
 * @author Morales Pablo Laura Nohemi
 * @fecha: Fecha en la que el usuario aplico para esta oferta de trabajo.
 * @archivo: Nombre del archivo PDF, DOCX del CV.
 *
 */
public class Solicitud {
	
	private Calendar fecha;
	private String comentarios;
	private String archivo;
	
	public Solicitud() {
		
	}
	
	public Solicitud(Calendar fecha) {
		this.fecha=fecha;
	}

	public Solicitud(Calendar fecha, String comentarios, String archivo) {
		super();
		this.fecha = fecha;
		this.comentarios = comentarios;
		this.archivo = archivo;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((archivo == null) ? 0 : archivo.hashCode());
		result = prime * result + ((comentarios == null) ? 0 : comentarios.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
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
		Solicitud other = (Solicitud) obj;
		if (archivo == null) {
			if (other.archivo != null)
				return false;
		} else if (!archivo.equals(other.archivo))
			return false;
		if (comentarios == null) {
			if (other.comentarios != null)
				return false;
		} else if (!comentarios.equals(other.comentarios))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Solicitud [fecha=" + fecha + ", comentarios=" + comentarios + ", archivo=" + archivo + "]";
	}
	
	
	
	
	
	

}
