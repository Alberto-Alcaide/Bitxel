package dao.Missions;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dao.Missions.Missions.Dificulty;
import dao.Missions.Missions.Reward;

class TestMissions {
	
	Missions m1 = new MissionsImpl(600,"Ir al parque a dar un paseo","",Reward.gold,Dificulty.easy);
	
	@BeforeEach
	void setUp() throws Exception {
		Missions m1 = new MissionsImpl(600,"Ir al parque a dar un paseo","",Reward.gold,Dificulty.easy);
	}

	@Test
	void testGetRemainingTime() {
		assertTrue(m1.getRemainingTime() == 600,"Test Correcto");
	}

	@Test
	void testSetRemainingTime() {
		m1.setRemainingTime(10);
		assertTrue(m1.getRemainingTime() == 10,"Test Correcto");
	}

	@Test
	void testGetName() {
		assertTrue(m1.getName() == "Ir al parque a dar un paseo","Test Correcto");
	}

	@Test
	void testSetName() {
		m1.setName("comer patatas");
		assertTrue(m1.getName() == "comer patatas","Test Correcto");
	}

	@Test
	void testGetDescription() {
		assertTrue(m1.getDescription() == "","Test Correcto");
	}

	@Test
	void testSetDescription() {
		m1.setDescription("Patata");
		assertTrue(m1.getDescription() == "Patata","Test Correcto");
	}

	@Test
	void testGetReward() {
		assertTrue(m1.getReward()== Reward.gold,"Test Correcto");
	}

	@Test
	void testSetReward() {
		m1.setReward(Reward.amulet);
		assertTrue(m1.getReward()== Reward.amulet,"Test Correcto");
	}

	@Test
	void testGetDificulty() {
		assertTrue(m1.getDificulty()== Dificulty.easy,"Test Correcto");
	}

	@Test
	void testSetDificulty() {
		m1.setDificulty(Dificulty.hard);
		assertTrue(m1.getDificulty()== Dificulty.hard,"Test Correcto");
	}

}
