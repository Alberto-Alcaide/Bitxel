package es.juego;

public class Equip implements InterfaceEquip {

	private String description;
	private Integer currency;
	
	private enum Rewards{};
	private enum rare{};

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
}
