package dao.Missions;

import java.util.Objects;

public class MissionsImpl implements Missions {

	private Integer RemainingTime;
	private String name;
	private String description;
	private Reward reward;
	private Dificulty dificulty;
	
	/**
	 * @param remainingTime
	 * @param name
	 * @param description
	 * @param reward
	 * @param dificulty
	 */
	public MissionsImpl(Integer remainingTime, String name, String description, Reward reward, Dificulty dificulty) {
		super();
		RemainingTime = remainingTime;
		this.name = name;
		this.description = description;
		this.reward = reward;
		this.dificulty = dificulty;
	}
	
	
	
	@Override
	public String toString() {
<<<<<<< HEAD
		return "StatsImpl [RemainingTime=" + RemainingTime + ", name=" + name + ", description=" + description
=======
		return "EquipImpl [RemainingTime=" + RemainingTime + ", name=" + name + ", description=" + description
>>>>>>> AlbertoA
				+ ", reward=" + reward + ", dificulty=" + dificulty + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(RemainingTime, description, dificulty, name, reward);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MissionsImpl other = (MissionsImpl) obj;
		return Objects.equals(RemainingTime, other.RemainingTime) && Objects.equals(description, other.description)
				&& dificulty == other.dificulty && Objects.equals(name, other.name) && reward == other.reward;
	}
	public Integer getRemainingTime() {
		return RemainingTime;
	}
	public void setRemainingTime(Integer remainingTime) {
		RemainingTime = remainingTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Reward getReward() {
		return reward;
	}
	public void setReward(Reward reward) {
		this.reward = reward;
	}
	public Dificulty getDificulty() {
		return dificulty;
	}
	public void setDificulty(Dificulty dificulty) {
		this.dificulty = dificulty;
	}

}
