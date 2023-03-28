package dao;

import java.sql.Date;

public class Tarea {

	Date fecha;
	Integer hora;
	String nombre;
	String Descripcion;
	Integer sonido;
	Boolean vibracion;
	
	
	/**
	 * @param fecha
	 * @param hora
	 * @param nombre
	 * @param descripcion
	 * @param sonido
	 * @param vibracion
	 */
	public Tarea(Date fecha, Integer hora, String nombre, String descripcion, Integer sonido, Boolean vibracion) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.nombre = nombre;
		Descripcion = descripcion;
		this.sonido = sonido;
		this.vibracion = vibracion;
	}
	
	@Override
	public String toString() {
		return "Tarea [fecha=" + fecha + ", hora=" + hora + ", nombre=" + nombre + ", Descripcion=" + Descripcion
				+ ", sonido=" + sonido + ", vibracion=" + vibracion + "]";
	}
	private Date getFecha() {
		return fecha;
	}
	private void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	private Integer getHora() {
		return hora;
	}
	private void setHora(Integer hora) {
		this.hora = hora;
	}
	private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private String getDescripcion() {
		return Descripcion;
	}
	private void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	private Integer getSonido() {
		return sonido;
	}
	private void setSonido(Integer sonido) {
		this.sonido = sonido;
	}
	private Boolean getVibracion() {
		return vibracion;
	}
	private void setVibracion(Boolean vibracion) {
		this.vibracion = vibracion;
	}
	
	
	
}
