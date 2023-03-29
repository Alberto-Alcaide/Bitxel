package dao.Equip;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dao.Equip.Equip.Rank;


public class EquipTest {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 EquipImpl equip1 = new EquipImpl("Great Sword","A really BIG F. Sword", 100, Rank.rare);
		 EquipImpl equip2 = new EquipImpl("Dagger","Sneacky sneacky...", 70, Rank.rare);
		 EquipImpl equip3 = new EquipImpl("Holy Sword","Blessed by God himself (I am God)", 200, Rank.epic);
		 
		 List<Equip> equip = new ArrayList<>();
		 
		 equip.add(equip3);
		 equip.add(equip2);
		 equip.add(equip1);
		
		equip1.setName("Not a Fake Sword");
		equip1.setDescription("Why don't you buy me...?");
		equip1.setCurrency(500);
		equip1.setRank(Rank.legendary);
		
		
		System.out.println("TO STRING:");
		System.out.println(equip1.toString());
		
		System.out.println("GETS:");
		System.out.println(equip1.getName());
		System.out.println(equip1.getDescription());
		System.out.println(equip1.getClass());
		System.out.println(equip1.getCurrency());
		System.out.println(equip1.getRank());
		
		System.out.println("HASHCODE:");
		System.out.println(equip1.hashCode());
		
		System.out.println("EQUALS:");
		System.out.println("equip1 = equip2: " + equip1.equals(equip2));
		
		Collections.sort(equip, new EquipComparator());
		System.out.println("LIST, order by Currency:");
		for (Equip i : equip) {
			System.out.println("Mision: " + i.toString());
		}

	 
	}
}
