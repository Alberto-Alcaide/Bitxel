package dao.Stats;

import java.util.Comparator;

public class StatsComparator implements Comparator<Stats> {

	public int compare(Stats o1, Stats o2) {
		// TODO Auto-generated method stub
		return o1.getNivel().compareTo(o2.getNivel());
	}

}
