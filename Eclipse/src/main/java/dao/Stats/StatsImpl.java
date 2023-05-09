package dao.Stats;

import java.util.Objects;

import dao.Equip.Equip.Rank;

public class StatsImpl implements Stats {
	
	private Integer health;
	private Integer speed;
	private Integer exp;
	private Integer level;
	private Integer attack;
	private Integer defense;
	private Integer luck;
	
	
	public StatsImpl(Integer health, Integer speed, Integer exp, Integer level, Integer attack, Integer defense,
			Integer luck) {
		super();
		this.health = health;
		this.speed = speed;
		this.exp = exp;
		this.level = level;
		this.attack = attack;
		this.defense = defense;
		this.luck = luck;
	}

	

	@Override
	public Rank getRank() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getHealth() {
		return health;
	}


	public void setHealth(Integer health) {
		this.health = health;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Integer getExp() {
		return exp;
	}


	public void setExp(Integer exp) {
		this.exp = exp;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getAttack() {
		return attack;
	}

	public void setAttack(Integer attack) {
		this.attack = attack;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	public Integer getLuck() {
		return luck;
	}

	public void setLuck(Integer luck) {
		this.luck = luck;
	}



	@Override
	public int hashCode() {
		return Objects.hash(attack, defense, exp, health, level, luck, speed);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatsImpl other = (StatsImpl) obj;
		return Objects.equals(attack, other.attack) && Objects.equals(defense, other.defense)
				&& Objects.equals(exp, other.exp) && Objects.equals(health, other.health)
				&& Objects.equals(level, other.level) && Objects.equals(luck, other.luck)
				&& Objects.equals(speed, other.speed);
	}
}
