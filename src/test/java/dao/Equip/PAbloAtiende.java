package dao.Equip;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PAbloAtiende {

	Prueba a = new HopeImpl("qwe",2);
	@BeforeEach
	void setUp() throws Exception {
		Prueba a = new HopeImpl("qwe",2);
	}

	@Test
	void testDiscurso() {
		assertTrue(a.getDiscurso() == "qwe", "Correcto");
	}

}
