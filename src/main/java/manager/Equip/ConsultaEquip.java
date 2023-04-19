package manager.Equip;

import java.util.ArrayList;
import java.util.List;

import dao.Equip.Equip;
import dao.Equip.Equip.Rank;
import dao.Equip.EquipImpl;

public class ConsultaEquip {

	
	public static List<Equip> CreacionListadoEquip(){
		List<Equip> equipList = new ArrayList<>();
        
		equipList.add(new EquipImpl("Sword", "A basic sword", 100, Rank.common));
		equipList.add(new EquipImpl("Bow", "A basic bow", 120, Rank.common));
		equipList.add(new EquipImpl("Axe", "A basic axe", 90, Rank.common));
		equipList.add(new EquipImpl("Wand", "A basic wand", 110, Rank.common));
		equipList.add(new EquipImpl("Dagger", "A basic dagger", 80, Rank.common));
		equipList.add(new EquipImpl("Shield", "A basic shield", 150, Rank.common));
		equipList.add(new EquipImpl("Greatsword", "A powerful greatsword", 500, Rank.rare));
		equipList.add(new EquipImpl("Staff", "A powerful staff", 600, Rank.rare));
		equipList.add(new EquipImpl("Hammer", "A powerful hammer", 550, Rank.rare));
		equipList.add(new EquipImpl("Mace", "A powerful mace", 520, Rank.rare));        
		
		return equipList;
	}
	
	public List<Equip> fitraEquipPrecio(int precio, int modo){
		List<Equip> equipList = CreacionListadoEquip();
		
		List<Equip> seleccionados = new ArrayList<>();
		for (Equip i : equipList) {
			if(modo == 1) {
				if(i.getCurrency() <= precio) {				
					seleccionados.add(i);
				}
			}
			else {
				if(i.getCurrency() >= precio) {
					seleccionados.add(i);
				}
			}
		}
		
		return equipList;
	}
	
	public List<Equip> fitraEquipRango(Rank rango){
		List<Equip> equipList = CreacionListadoEquip();
		
		List<Equip> seleccionados = new ArrayList<>();
		for (Equip i : equipList) {
			if(i.getRank() == rango) {				
				seleccionados.add(i);
			}
		}
		return equipList;
	}
	
}
