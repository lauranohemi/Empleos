package mx.edu.uacm.model;

public class Correo {
	
	private String destinatario; 
	private String emisor; 
	private String asunto;
	private String cuerpo;
	
	public Correo () {
		
	}

	public Correo(String destinatario, String emisor, String asunto, String cuerpo) {
		super();
		this.destinatario = destinatario;
		this.emisor = emisor;
		this.asunto = asunto;
		this.cuerpo = cuerpo;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
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
