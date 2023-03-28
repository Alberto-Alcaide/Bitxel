package dao.Stats;

public class StatsImpl implements Stats {
	
	private Integer salud;
	private Integer velocidad;
	private Integer experiencia;
	private Integer nivel;
	private Integer ataque;
	private Integer defensa;
	private Integer suerte;
	
	
	@Override
	public Integer getSalud() {
		// TODO Auto-generated method stub
		return salud;
	}

	@Override
	public void setSalud(Integer salud) {
		this.salud=salud;

	}

	@Override
	public Integer getVelocidad() {
		// TODO Auto-generated method stub
		return velocidad;
	}

	@Override
	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;

	}

	@Override
	public Integer getExperiencia() {
		// TODO Auto-generated method stub
		return experiencia;
	}

	@Override
	public void setExperiencia(Integer experiencia) {
		this.experiencia = experiencia;

	}

	@Override
	public Integer getNivel() {
		// TODO Auto-generated method stub
		return nivel;
	}

	@Override
	public void setNivel(Integer nivel) {
		this.nivel = nivel;

	}

	@Override
	public Integer getAtaque() {
		// TODO Auto-generated method stub
		return ataque;
	}

	@Override
	public void setAtaque(Integer ataque) {
		this.ataque = ataque;

	}

	@Override
	public Integer getDefensa() {
		// TODO Auto-generated method stub
		return defensa;
	}

	@Override
	public void setDefensa(Integer defensa) {
		this.defensa = defensa;

	}

	@Override
	public Integer getSuerte() {
		// TODO Auto-generated method stub
		return suerte;
	}

	@Override
	public void setSuerte(Integer suerte) {
		this.suerte = suerte;

	}

}
