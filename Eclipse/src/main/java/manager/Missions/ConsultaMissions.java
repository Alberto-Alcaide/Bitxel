package manager.Missions;

import java.util.ArrayList;
import java.util.List;

import dao.Missions.Missions;
import dao.Missions.Missions.Dificulty;
import dao.Missions.Missions.Reward;
import dao.Missions.MissionsImpl;

public class ConsultaMissions {
	
	public static List<Missions> CreacionListadoMissions()
	{
		List<Missions> missions = new ArrayList<>();
		
		missions.add( new MissionsImpl(600,"Ir al parque a dar un paseo","",Reward.gold,Dificulty.easy));
		missions.add( new MissionsImpl(600,"Marcate un backflip","",Reward.boots,Dificulty.normal));
		missions.add( new MissionsImpl(600,"Hazme 4 flexiones","",Reward.sword,Dificulty.normal));
		missions.add( new MissionsImpl(600,"Ve a correr a la calle","",Reward.gold,Dificulty.hard));
		missions.add( new MissionsImpl(600,"Haz 4 abdominales","",Reward.boots,Dificulty.normal));
		missions.add( new MissionsImpl(600,"Haz todas las dominadas que puedas","",Reward.sword,Dificulty.hard));
		missions.add( new MissionsImpl(600,"Levanta pesas","",Reward.gold,Dificulty.hard));
		missions.add( new MissionsImpl(600,"Haz 4 burpees","",Reward.boots,Dificulty.normal));
		missions.add( new MissionsImpl(600,"Meditar","",Reward.sword,Dificulty.easy));
		missions.add( new MissionsImpl(600,"Realiza Shadow Boxing","",Reward.gold,Dificulty.hard));
		
		
		return missions;
	}
	
	public List<Missions> filtraMissionsDificulty(Dificulty dificulty)
	{
		List<Missions> missions = CreacionListadoMissions();
		
		List<Missions> missionsNew = new ArrayList<>();
		
		for (Missions i : missions)
		{
			if (i.getDificulty() == dificulty)
			{
				missionsNew.add(i);
			}
		}
		
		return missionsNew;
	}
	public List<Missions> filtraMissionsReward(Reward reward)
	{
		List<Missions> missions = CreacionListadoMissions();
		
		List<Missions> missionsNew = new ArrayList<>();
		
		for (Missions i : missions)
		{
			if (i.getReward() == reward)
			{
				missionsNew.add(i);
			}
		}
			
		return missionsNew;
	}


}
