package dao.Stats;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StatsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatsImpl e1 = new StatsImpl(1,1,1,1,1,1,1);
		StatsImpl e2 = new StatsImpl(2,2,2,2,2,2,2);
		StatsImpl e3 = new StatsImpl(3,3,3,3,3,3,3);
		
		List<Stats> estadisticas = new ArrayList<>();
		estadisticas.add(e3);
		estadisticas.add(e2);
		estadisticas.add(e1);
		
		e1.setAtaque(0);
		e1.setDefensa(0);
		e1.setExperiencia(0);
		e1.setNivel(0);
		e1.setSalud(0);
		e1.setSuerte(0);
		e1.setVelocidad(0);
		
		System.out.println("TO STRING:");
		System.out.println(e1.toString());
		
		System.out.println("GETS:");
		System.out.println(e1.getAtaque());
		System.out.println(e1.getDefensa());
		System.out.println(e1.getExperiencia());
		System.out.println(e1.getNivel());
		System.out.println(e1.getSalud());
		System.out.println(e1.getSuerte());
		System.out.println(e1.getVelocidad());
		
		System.out.println("HASHCODE:");
		System.out.println(e1.hashCode());
		
		System.out.println("EQUALS:");
		System.out.println("e1 = M2: " + e1.equals(e2));
		
		System.out.println("LISTA, ordenada por nombre:");
		Collections.sort(estadisticas, new StatsComparator());
		
		System.out.println("LISTA, ordenada por nombre:");
		for (Stats i : estadisticas) {
			System.out.println("Mision: " + i.toString());
		}
	}
}
