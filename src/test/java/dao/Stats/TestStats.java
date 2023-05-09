package dao.Stats;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStats {

	Stats s1;
	
	@BeforeEach
	void setUp() throws Exception {
		s1 = new StatsImpl(100, 50, 0, 1, 10, 5, 20);
	}

	@Test
	void testGetHealth() {
		assertTrue(s1.getHealth() == 100,"Test Correcto");
	}

	@Test
	void testSetHealth() {
		s1.setHealth(150);
		assertTrue(s1.getHealth() == 150,"Test Correcto");
	}

	@Test
	void testGetSpeed() {
		assertTrue(s1.getSpeed() == 50,"Test Correcto");
	}

	@Test
	void testSetSpeed() {
		s1.setSpeed(70);
		assertTrue(s1.getSpeed() == 70,"Test Correcto");
	}

	@Test
	void testGetExp() {
		assertTrue(s1.getExp() == 0,"Test Correcto");
	}

	@Test
	void testSetExp() {
		s1.setExp(10);
		assertTrue(s1.getExp() == 10,"Test Correcto");
	}

	@Test
	void testGetLevel() {
		assertTrue(s1.getLevel() == 1,"Test Correcto");
	}

	@Test
	void testSetNivel() {
		s1.setLevel(2);
		assertTrue(s1.getLevel() == 2,"Test Correcto");
	}

	@Test
	void testGetAttack() {
		assertTrue(s1.getAttack() == 10,"Test Correcto");
	}

	@Test
	void testSetAtaque() {
		s1.setAttack(25);
		assertTrue(s1.getAttack() == 25,"Test Correcto");
	}

	@Test
	void testGetDefense() {
		assertTrue(s1.getDefense() == 5,"Test Correcto");
	}

	@Test
	void testSetDefense() {
		s1.setDefense(10);
		assertTrue(s1.getDefense() == 10,"Test Correcto");
	}

	@Test
	void testGetLuck() {
		assertTrue(s1.getLuck() == 20,"Test Correcto");
	}

	@Test
	void testSetLuck() {
		s1.setLuck(35);
		assertTrue(s1.getLuck() == 35,"Test Correcto");
	}

}
