package dao.Equip;

import java.util.Comparator;

import es.loyola.pdm.dao.Coche;

public class ComparatorEquip implements Comparator<Equip> {
	
	@Override
	public int compare(Equip e1, Equip e2) {
		// TODO Auto-generated method stub
		
		return e1.getName().compareTo(e2.getName());
	}	
}
