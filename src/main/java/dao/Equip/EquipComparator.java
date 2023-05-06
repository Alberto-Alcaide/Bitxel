package dao.Equip;

import java.util.Comparator;


public class EquipComparator implements Comparator<Equip> {

	@Override
	public int compare(Equip e1, Equip e2) {
		// TODO Auto-generated method stub
		
		return e1.getCurrency().compareTo(e2.getCurrency());
	}	
	
}
