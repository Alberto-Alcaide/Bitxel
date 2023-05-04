package dao.Equip;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestHope {
	
	Prueba a = new HopeImpl("Patata", 99);
	@BeforeEach
	void setUp() throws Exception {
		Prueba a = new HopeImpl("Patata", 99);
	}

	@Test
	void testDiscurso() {
		assertTrue(a.getDiscurso() == "Patata", "Correctisimo Máquina");
	}
	
	@Test
	void testEsperanza() {
		assertTrue(a.getEsperanza() == 99, "Correctisimo Máquina");
	}

}
