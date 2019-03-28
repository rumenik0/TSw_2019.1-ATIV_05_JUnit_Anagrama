package unico;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramaTeste {
	Anagrama anagrama = new Anagrama();

	@Test
	void testIsAnagramas() {
		assertEquals(true, anagrama.isAnagramas("amor", "roma"));
	}

	@Test
	void testIsAnagramasMaiuscula() {
		assertEquals(true, anagrama.isAnagramas("Amor", "Roma"));
	}
	
	@Test
	void testIsAnagramasAcentuacao() {
		anagrama.isAnagramas("eva", "áve");
	}
	
	@Test
	void testIsAnagramasEmpty() {
		assertEquals(false, anagrama.isAnagramas("", ""));
	}
	
	@Test
	void testIsAnagramasNulo1() {
		assertEquals(false, anagrama.isAnagramas(null, "Roma"));
	}
	
	@Test
	void testIsAnagramasNulo2() {
		assertEquals(false, anagrama.isAnagramas("", null));
	}
}
