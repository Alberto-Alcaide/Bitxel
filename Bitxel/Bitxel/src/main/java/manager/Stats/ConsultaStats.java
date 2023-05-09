package manager.Stats;

import java.util.ArrayList;
import java.util.List;

import dao.Equip.Equip;
import dao.Equip.Equip.Rank;
import dao.Stats.Stats;
import dao.Stats.StatsImpl;

public class ConsultaStats {
	
	public List<Stats> CreacionListadoEquip(){
		List<Stats> statsList = new ArrayList<Stats>();
        
		statsList.add( new StatsImpl(100, 50, 0, 1, 10, 5, 20));

		StatsImpl objeto2 = new StatsImpl(80, 70, 250, 3, 15, 8, 15);
		statsList.add(objeto2);

		StatsImpl objeto3 = new StatsImpl(120, 40, 500, 5, 20, 10, 25);
		statsList.add(objeto3);

		StatsImpl objeto4 = new StatsImpl(90, 60, 150, 2, 12, 6, 18);       
		
		return statsList;
	}
	
	public List<Stats> filtraStatsNivel(int nivel){
		List<Stats> equipList = CreacionListadoEquip();
		
		List<Stats> seleccionados = new ArrayList<Stats>();
		for (Stats i : equipList) {
			if(i.getNivel() == nivel) {				
				seleccionados.add(i);
			}
		}
		return equipList;
	}
}