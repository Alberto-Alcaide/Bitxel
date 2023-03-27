package es.juego;

public class Equip implements InterfaceEquip {

	private String description;
	private Integer price;
	
	private enum Rewards{};
	private enum rare{};

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
}
