package dao.Missions;

public class MissionsImpl implements Missions {

	Integer RemainingTime;
	String name;
	String description;
	
	/**
	 * @param RemainingTime
	 * @param name
	 * @param description
	 */
	public MissionsImpl(Integer RemainingTime, String name, String description) {
		super();
		this.RemainingTime = RemainingTime;
		this.name = name;
		this.description = description;
	}	
	
	@Override
	public String toString() {
		return "MisionesImpl [tiempoRestante=" + RemainingTime + ", name=" + name + ", description=" + description
				+ "]";
	}

	@Override
	public Integer getRemainingTime() {
		// TODO Auto-generated method stub
		return RemainingTime;
	}

	@Override
	public void setRemainingTime(Integer time) {
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
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub

	}

}
