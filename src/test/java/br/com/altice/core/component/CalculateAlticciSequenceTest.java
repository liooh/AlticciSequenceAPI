package br.com.altice.core.component;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;

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
		BigInteger alticciSequence = calculateAlticcieSequence.calculate(BigInteger.valueOf(0));
		assertEquals(BigInteger.valueOf(0), alticciSequence);
	}

	@Test
	void testAlticciSequenceWhenNumberIsOne() {
		BigInteger alticciSequence = calculateAlticcieSequence.calculate(BigInteger.valueOf(1));
		assertEquals(BigInteger.valueOf(1), alticciSequence);
	}

	@Test
	void testAlticciSequenceWhenNumberIsTwo() {
		BigInteger alticciSequence = calculateAlticcieSequence.calculate(BigInteger.valueOf(2));
		assertEquals(BigInteger.valueOf(1), alticciSequence);
	}

	@Test
	void testAlticciSequenceWhenNumberIsThree() {
		BigInteger alticciSequence = calculateAlticcieSequence.calculate(BigInteger.valueOf(3));
		assertEquals(BigInteger.valueOf(1), alticciSequence);
	}

	@Test
	void testAlticciSequenceWhenNumberIsFive() {
		BigInteger alticciSequence = calculateAlticcieSequence.calculate(BigInteger.valueOf(5));
		assertEquals(BigInteger.valueOf(2), alticciSequence);
	}

	@Test
	void testAlticciSequenceWhenNumberIsTen() {
		BigInteger alticciSequence = calculateAlticcieSequence.calculate(BigInteger.valueOf(10));
		assertEquals(BigInteger.valueOf(9), alticciSequence);
	}

}
