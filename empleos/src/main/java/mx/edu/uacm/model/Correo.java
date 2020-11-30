package mx.edu.uacm.model;

import java.util.regex.Pattern;

import mx.edu.uacm.exceptions.ClaseException;

public class Correo {
	
	private String destinatario; 
	private String emisor; 
	private String asunto;
	private String cuerpo;
	
	private final String EXP_REGULAR_DESTINATARIO ="^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$";
	private final String EXP_REGULAR_EMISOR ="^([a-zA-ZÁÉÍÓÚñáéíóúÑ\\s]?[A-Za-zÁÉÍÓÚñáéíóúÑ]){2,35}$";
	private final String EXP_REGULAR_ASUNTO ="^[a-zA-Záéíóú]?([a-zA-Záéíóú^\\n. ]){2,35}$";
	private final String EXP_REGULAR_CUERPO ="^[a-zA-Záéíóú]?([a-zA-Záéíóú^\\n. ]){2,350}$";
	
	public Correo () {
		
	}

	public Correo(String destinatario, String emisor, String asunto, String cuerpo) throws ClaseException {
		setDestinatario(destinatario);
		setEmisor(emisor);
		setAsunto(asunto);
		setCuerpo(cuerpo);
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) throws ClaseException {
		if (Pattern.matches(EXP_REGULAR_DESTINATARIO, destinatario)) 
			this.destinatario = destinatario;
		else 
			throw new ClaseException("Error: " + destinatario);
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) throws ClaseException {
		if (Pattern.matches(EXP_REGULAR_EMISOR, emisor)) 
			this.emisor = emisor;
		else 
			throw new ClaseException("Error: " + emisor);
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) throws ClaseException {
		if (Pattern.matches(EXP_REGULAR_ASUNTO, asunto)) 
			this.asunto = asunto;
		else 
			throw new ClaseException("Error: " + asunto);
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) throws ClaseException {
		if (Pattern.matches(EXP_REGULAR_CUERPO, cuerpo)) 
			this.cuerpo = cuerpo;
		else 
			throw new ClaseException("Error: " + cuerpo);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asunto == null) ? 0 : asunto.hashCode());
		result = prime * result + ((cuerpo == null) ? 0 : cuerpo.hashCode());
		result = prime * result + ((destinatario == null) ? 0 : destinatario.hashCode());
		result = prime * result + ((emisor == null) ? 0 : emisor.hashCode());
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
		Correo other = (Correo) obj;
		if (asunto == null) {
			if (other.asunto != null)
				return false;
		} else if (!asunto.equals(other.asunto))
			return false;
		if (cuerpo == null) {
			if (other.cuerpo != null)
				return false;
		} else if (!cuerpo.equals(other.cuerpo))
			return false;
		if (destinatario == null) {
			if (other.destinatario != null)
				return false;
		} else if (!destinatario.equals(other.destinatario))
			return false;
		if (emisor == null) {
			if (other.emisor != null)
				return false;
		} else if (!emisor.equals(other.emisor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Correo [destinatario=" + destinatario + ", emisor=" + emisor + ", asunto=" + asunto + ", cuerpo="
				+ cuerpo + "]";
	}
	
	

}
