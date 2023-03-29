package dao.Equip;

import java.util.Objects;

public class EquipImpl implements Equip {

	private String name;
	private String description;
	private Integer currency;
	
	private Rank rank;
	
	public EquipImpl(String name, String description, Integer currency, Rank rank) {
		super();
		this.name = name;
		this.description = description;
		this.currency = currency;
		this.rank = rank;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(currency, description, name, rank);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EquipImpl other = (EquipImpl) obj;
		return Objects.equals(currency, other.currency) && Objects.equals(description, other.description)
				&& Objects.equals(name, other.name) && rank == other.rank;
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

	public Integer getCurrency() {
		return currency;
	}

	public void setCurrency(Integer currency) {
		this.currency = currency;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "EquipImpl [name=" + name + ", description=" + description + ", currency=" + currency + ", rank=" + rank
				+ "]";
	}





}
