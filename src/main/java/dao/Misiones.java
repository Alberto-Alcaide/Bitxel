package dao;

public interface Misiones {

	//Source -> Generate Getter and Setter
	Integer getTiempoRestante();
	
	void setTiempoRestante(Integer name);

	String getName();
	
	void setName(String name);

	String getDescripcion();
	
	void setDescripcion(String Descripcion);
	
	//Esto serán implementaciones de equipamiento o oro
	public enum Recompensa{ oro, espada, botas, armadura, amuleto;}
	
	public enum Dificultad{ facil, normal, dificil;}
}