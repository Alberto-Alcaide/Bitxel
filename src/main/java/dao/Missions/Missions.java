package dao.Missions;

public interface Missions {

	//Source -> Generate Getter and Setter
	Integer getRemainingTime();
	
	void setRemainingTime(Integer time);

	String getName();
	
	void setName(String name);

	String getDescription();
	
	void setDescription(String description);
	
	//Esto serán implementaciones de equipamiento o oro
	public enum Reward{ gold, sword, boots, armour, amulet;}
	
	public Reward getReward();
	
	public void setReward(Reward reward);
	
	public enum Dificulty{ easy, normal, hard;}
	
	public Dificulty getDificulty();
	
	public void setDificulty(Dificulty dificulty);
}