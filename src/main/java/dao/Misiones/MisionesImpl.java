package dao.Misiones;

import java.util.Objects;

public class MisionesImpl implements Misiones {

	Integer tiempoRestante;
	String name;
	String descripcion;
	
	
	
	
	/**
	 * @param tiempoRestante
	 * @param name
	 * @param descripcion
	 */
	public MisionesImpl(Integer tiempoRestante, String name, String descripcion) {
		super();
		this.tiempoRestante = tiempoRestante;
		this.name = name;
		this.descripcion = descripcion;
	}	
	
	@Override
	public String toString() {
		return "MisionesImpl [tiempoRestante=" + tiempoRestante + ", name=" + name + ", descripcion=" + descripcion
				+ "]";
	}

	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(descripcion, name, tiempoRestante);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MisionesImpl other = (MisionesImpl) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(name, other.name)
				&& Objects.equals(tiempoRestante, other.tiempoRestante);
	}

	@Override
	public Integer getTiempoRestante() {
		// TODO Auto-generated method stub
		return tiempoRestante;
	}

	@Override
	public void setTiempoRestante(Integer name) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return descripcion;
	}

	@Override
	public void setDescripcion(String Descripcion) {
		// TODO Auto-generated method stub

	}
	
	

}
