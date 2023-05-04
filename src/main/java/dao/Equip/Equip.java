package dao.Equip;

public interface Equip {

	public String getName();
	
	public void setName(String name);
	
	public String getDescription();
	
	public void setDescription(String description);
	
	public Integer getCurrency();

	public void setCurrency(Integer currency);

	public enum Rank{common, rare, epic, legendary};
	
	public Rank getRank();
	
	public void setRank(Rank rank);

}
