package dao.Equip;



import java.util.ArrayList;
import java.util.List;

import dao.Equip.*;
import dao.Equip.Equip.Rank;

public class EquipTest {

	public static void main(String[] args)
	{
		 EquipImpl equip1 = new EquipImpl("Great Sword","A really BIG F. Sword", 100, Rank.rare);
		 EquipImpl equip2 = new EquipImpl("Dagger","Sneacky sneacky...", 70, Rank.rare);
		 EquipImpl equip3 = new EquipImpl("Holy Sword","Blessed by God himself (I am God)", 200, Rank.epic);

		 List<Equip> equip = new ArrayList<>();
		 
		 equip.add(equip3);
		 equip.add(equip2);
		 equip.add(equip1);
		 System.out.println(equip);
		 
		 System.out.println(equip1.toString());
		 System.out.println(equip2.toString());
		 System.out.println(equip3.toString());
		 
		 
		 equip1.setName("Sword");
		 System.out.println(equip1.getName());
		 
		 equip2.setCurrency(75);
		 System.out.println(equip2.getCurrency());
		 
		 equip3.setRank(Rank.legendary);
		 System.out.println(equip3.getRank());
		 
	}
}
