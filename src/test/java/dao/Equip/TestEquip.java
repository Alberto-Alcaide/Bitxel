package dao.Equip;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dao.Equip.Equip.Rank;

class TestEquip {

	Equip e;
	
	@BeforeEach
	void setUp() throws Exception {
		e = new EquipImpl("Great Sword","Something new", 100, Rank.rare);
	}

	@Test
	void testGetName() {
		assertTrue(e.getName() == "Great Sword","Test Correcto");
	}

	@Test
	void testSetName() {
		e.setName("Patata");
		assertTrue(e.getName() == "Patata","Test Correcto");
	}

	@Test
	void testGetDescription() {
		assertTrue(e.getDescription() == "Something new","Test Correcto");
	}

	@Test
	void testSetDescription() {
		e.setDescription("Patata");
		assertTrue(e.getDescription() == "Patata","Test Correcto");
	}

	@Test
	void testGetCurrency() {
		assertTrue(e.getCurrency() == 100,"Test Correcto");
	}

	@Test
	void testSetCurrency() {
		e.setCurrency(0);
		assertTrue(e.getCurrency() == 0,"Test Correcto");
	}

	@Test
	void testGetRank() {
		assertTrue(e.getRank() == Rank.rare,"Test Correcto");
	}

	@Test
	void testSetRank() {
		e.setRank(Rank.legendary);
		assertTrue(e.getRank() == Rank.legendary,"Test Correcto");
	}
}
