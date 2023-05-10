package dao;

public class Ajustes {

	Integer brillo;
	Integer volumen;
	Boolean musica;
	
	
	
	
	/**
	 * @param brillo
	 * @param volumen
	 * @param musica
	 */
	public Ajustes(Integer brillo, Integer volumen, Boolean musica) {
		super();
		this.brillo = brillo;
		this.volumen = volumen;
		this.musica = musica;
	}
	
	private Integer getBrillo() {
		return brillo;
	}
	private void setBrillo(Integer brillo) {
		this.brillo = brillo;
	}
	private Integer getVolumen() {
		return volumen;
	}
	private void setVolumen(Integer volumen) {
		this.volumen = volumen;
	}
	private Boolean getMusica() {
		return musica;
	}
	private void setMusica(Boolean musica) {
		this.musica = musica;
	}
	public String toString() {
		return "Ajustes [brillo=" + brillo + ", volumen=" + volumen + ", musica=" + musica + "]";
	}
}
