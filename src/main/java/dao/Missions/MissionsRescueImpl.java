package dao.Missions;

public class MissionsRescueImpl implements Missions {


	
	@Override
	public String toString() {
		return "MisionesImpl [Remaining Time=" +  getRemainingTime() + ", name=" + getName() + ", description=" + getDescription()
				+ "]";
	}
	
	@Override
	public Integer getRemainingTime() {
		// TODO Auto-generated method stub
		return 1000;
	}
	
	@Override
	public void setRemainingTime(Integer time) {
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
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Rescata a la princesa antes de que se acabe el tiempo o morira entre terribles sufrimientos";
	}
	
	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		
	}
	
	
}
