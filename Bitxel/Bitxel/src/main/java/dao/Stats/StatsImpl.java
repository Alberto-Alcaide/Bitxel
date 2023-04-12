package dao.Stats;

import java.util.Objects;

public class StatsImpl implements Stats {
	
	private Integer salud;
	private Integer velocidad;
	private Integer experiencia;
	private Integer nivel;
	private Integer ataque;
	private Integer defensa;
	private Integer suerte;
	
	
	
	/**
	 * @param salud
	 * @param velocidad
	 * @param experiencia
	 * @param nivel
	 * @param ataque
	 * @param defensa
	 * @param suerte
	 */
	public StatsImpl(Integer salud, Integer velocidad, Integer experiencia, Integer nivel, Integer ataque,
			Integer defensa, Integer suerte) {
		super();
		this.salud = salud;
		this.velocidad = velocidad;
		this.experiencia = experiencia;
		this.nivel = nivel;
		this.ataque = ataque;
		this.defensa = defensa;
		this.suerte = suerte;
	}



	@Override
	public String toString() {
		return "StatsImpl [salud=" + salud + ", velocidad=" + velocidad + ", experiencia=" + experiencia + ", nivel="
				+ nivel + ", ataque=" + ataque + ", defensa=" + defensa + ", suerte=" + suerte + "]";
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(ataque, defensa, experiencia, nivel, salud, suerte, velocidad);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatsImpl other = (StatsImpl) obj;
		return Objects.equals(ataque, other.ataque) && Objects.equals(defensa, other.defensa)
				&& Objects.equals(experiencia, other.experiencia) && Objects.equals(nivel, other.nivel)
				&& Objects.equals(salud, other.salud) && Objects.equals(suerte, other.suerte)
				&& Objects.equals(velocidad, other.velocidad);
	}



	public Integer getSalud() {
		// TODO Auto-generated method stub
		return salud;
	}

	public void setSalud(Integer salud) {
		this.salud=salud;

	}

	public Integer getVelocidad() {
		// TODO Auto-generated method stub
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;

	}

	public Integer getExperiencia() {
		// TODO Auto-generated method stub
		return experiencia;
	}

	
	public void setExperiencia(Integer experiencia) {
		this.experiencia = experiencia;

	}

	
	public Integer getNivel() {
		// TODO Auto-generated method stub
		return nivel;
	}

	
	public void setNivel(Integer nivel) {
		this.nivel = nivel;

	}

	
	public Integer getAtaque() {
		// TODO Auto-generated method stub
		return ataque;
	}

	
	public void setAtaque(Integer ataque) {
		this.ataque = ataque;

	}

	
	public Integer getDefensa() {
		// TODO Auto-generated method stub
		return defensa;
	}

	
	public void setDefensa(Integer defensa) {
		this.defensa = defensa;

	}

	
	public Integer getSuerte() {
		// TODO Auto-generated method stub
		return suerte;
	}


	public void setSuerte(Integer suerte) {
		this.suerte = suerte;

	}

}
