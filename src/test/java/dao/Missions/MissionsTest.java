package dao.Missions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dao.Missions.Missions.Dificulty;
import dao.Missions.Missions.Reward;

public class MissionsTest {

	public static void main(String[] args) {
		
		Integer a = 2;
		Integer b = 4;
		Integer resultado = 2 + 4;
		assertTrue(resultado == 6,"La suma no ha sido correcta");
		
		
		
		
		// TODO Auto-generated method stub
		MissionsImpl e1 = new MissionsImpl(600,"Mata al señor Oscuro","",Reward.gold,Dificulty.hard);
		MissionsImpl m2 = new MissionsImpl(600,"Adentrate en la mazmorra","",Reward.boots,Dificulty.normal);
		MissionsImpl m3 = new MissionsImpl(600,"Salva el mundo","",Reward.sword,Dificulty.easy);
		MissionsRescueImpl m4 = new MissionsRescueImpl();
		
		List<Missions> misiones = new ArrayList<>();
		misiones.add(e1);
		misiones.add(m2);
		misiones.add(m3);
		misiones.add(m4);
		
		e1.setDescription("Prueba");
		e1.setDificulty(Dificulty.easy);
		e1.setName("Prueba");
		e1.setRemainingTime(0);
		e1.setReward(Reward.sword);
		
		System.out.println("TO STRING:");
		System.out.println(e1.toString());
		
		System.out.println("GETS:");
		System.out.println(e1.getDescription());
		System.out.println(e1.getName());
		System.out.println(e1.getClass());
		System.out.println(e1.getRemainingTime());
		System.out.println(e1.getDificulty());
		System.out.println(e1.getReward());
		
		System.out.println("HASHCODE:");
		System.out.println(e1.hashCode());
		
		System.out.println("EQUALS:");
		e1 = m2;
		System.out.println("e1 = M2: " + e1.equals(m2));
		
		
		System.out.println("LISTA, ordenada por nombre:");
		Collections.sort(misiones, new MissionsComparator());
		
		for (Missions i : misiones) {
			System.out.println("Mision: " + i.toString());
		}
		
	}

}
