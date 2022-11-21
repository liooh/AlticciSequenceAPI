package br.com.altice.core.component;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.altice.core.component.CalculateAlticciSequence;

@SpringBootTest
class CalculateAlticciSequenceTest {

	@Autowired
	private CalculateAlticciSequence calculateAlticcieSequence;

	@Test
	void testAlticciSequenceWhenNumberIsZero() {
		Long alticciSequence = calculateAlticcieSequence.calculate(0L);
		assertEquals(0, alticciSequence);
	}

	@Test
	void testAlticciSequenceWhenNumberIsOne() {
		Long alticciSequence = calculateAlticcieSequence.calculate(1L);
		assertEquals(1, alticciSequence);
	}

	@Test
	void testAlticciSequenceWhenNumberIsTwo() {
		Long alticciSequence = calculateAlticcieSequence.calculate(2L);
		assertEquals(1, alticciSequence);
	}

	@Test
	void testAlticciSequenceWhenNumberIsThree() {
		Long alticciSequence = calculateAlticcieSequence.calculate(3L);
		assertEquals(1, alticciSequence);
	}

	@Test
	void testAlticciSequenceWhenNumberIsFive() {
		Long alticciSequence = calculateAlticcieSequence.calculate(5L);
		assertEquals(2, alticciSequence);
	}

	@Test
	void testAlticciSequenceWhenNumberIsTen() {
		Long alticciSequence = calculateAlticcieSequence.calculate(10L);
		assertEquals(9, alticciSequence);
	}

}
