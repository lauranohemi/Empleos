package mx.edu.uacm.model;

/**
 * 
 * @author Chávez Morelos Noé Baldemar
 *@perfil: Curriculum del usuario que desea postularse  a una vancate.
 */
public class Perfil {
	
	private String perfil;
	
	public Perfil() {
		
	}

	public Perfil(String perfil) {
		this.perfil = perfil;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	@Override
	public String toString() {
		return "Perfil [perfil=" + perfil + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((perfil == null) ? 0 : perfil.hashCode());
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
		Perfil other = (Perfil) obj;
		if (perfil == null) {
			if (other.perfil != null)
				return false;
		} else if (!perfil.equals(other.perfil))
			return false;
		return true;
	}
	
	

}
