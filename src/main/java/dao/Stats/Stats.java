package dao.Stats;

import dao.Equip.Equip.Rank;

public interface Stats {
	
	Integer getHealth();
	
	void setHealth(Integer health);
	
	Integer getSpeed();
	
	void setSpeed(Integer speed);
	
	Integer getExp();
	
	void setExp(Integer exp);
	
	Integer getLevel();
	
	void setLevel(Integer level);
	
	Integer getAttack();
	
	void setAttack(Integer attack);
	
	Integer getDefense();
	
	void setDefense(Integer defense);
	
	Integer getLuck();
	
	void setLuck(Integer luck);

	Rank getRank();
}
