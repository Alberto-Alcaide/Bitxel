package dao.Equip;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dao.Equip.Equip.Rank;

class TestEquip {


	@BeforeEach
	void setUp() throws Exception {
		Equip e = new EquipImpl("Great Sword","A really BIG F. Sword", 100, Rank.rare);
	}


	@Test
	void testEquipImpl() {
		fail("Not yet implemented");
	}

	@Test
	void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	void testSetName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDescription() {
		fail("Not yet implemented");
	}

	@Test
	void testSetDescription() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCurrency() {
		fail("Not yet implemented");
	}

	@Test
	void testSetCurrency() {
		fail("Not yet implemented");
	}

	@Test
	void testGetRank() {
		fail("Not yet implemented");
	}

	@Test
	void testSetRank() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
