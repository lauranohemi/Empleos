package mx.edu.uacm.model;

import java.time.Period;
import java.util.regex.Pattern;

import mx.edu.uacm.exceptions.ClaseException;

/**
 * 
 * @author Chávez Morelos Noé Baldemar
 *@perfil: Curriculum del usuario que desea postularse  a una vancate.
 */
public class Perfil {
	
	private String perfil;
	
	private final String EXP_REGULAR_PERFIL = "^[a-zA-Záéíóú]?([a-zA-Záéíóú^\\n. ]){2,350}$";
	
	public Perfil() {
		
	}

	public Perfil(String perfil) throws ClaseException {
		setPerfil(perfil);
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) throws ClaseException {
		if (Pattern.matches(EXP_REGULAR_PERFIL, perfil)) 
			this.perfil = perfil;
		else 
			throw new ClaseException("Error: " + perfil + Perfil.class);
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
