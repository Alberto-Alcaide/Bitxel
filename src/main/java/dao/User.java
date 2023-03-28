package dao;

public class User {
	
	Integer money;
	String name; 
	
	
	public User(Integer money, String name) {
		this.money=money;
		this.name=name;
	}

	public Integer getMoney() {
		return money;
	}


	public void setMoney(Integer money) {
		this.money = money;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}
