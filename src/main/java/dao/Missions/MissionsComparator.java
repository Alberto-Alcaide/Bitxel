package dao.Missions;

import java.util.Comparator;

public class MissionsComparator implements Comparator<Missions> {

	@Override
	public int compare(Missions o1, Missions o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
