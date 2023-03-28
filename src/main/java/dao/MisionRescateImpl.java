package dao;

public class MisionRescateImpl implements Misiones {


	
	@Override
	public String toString() {
		return "MisionesImpl [tiempoRestante=" +  getTiempoRestante() + ", name=" + getName() + ", descripcion=" + getDescripcion()
				+ "]";
	}
	
	@Override
	public Integer getTiempoRestante() {
		// TODO Auto-generated method stub
		return 1000;
	}
	
	@Override
	public void setTiempoRestante(Integer name) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Mision de rescate";
	}
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Rescata a la princesa antes de que se acabe el tiempo o morira entre terribles sufrimientos";
	}
	
	@Override
	public void setDescripcion(String Descripcion) {
		// TODO Auto-generated method stub
		
	}
	
}
