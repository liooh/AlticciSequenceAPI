package br.com.altice.core.component;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class CalculateAlticciSequence {

	private static final Map<BigInteger, BigInteger> resultSequenceMemo = new HashMap<>();

	// top-down dynamic program approach
	public BigInteger calculate(BigInteger number) {
		if(number.compareTo(BigInteger.valueOf(0)) == 0)
			return BigInteger.valueOf(0);

		if(number.compareTo(BigInteger.valueOf(1)) == 0 || number.compareTo(BigInteger.valueOf(2)) == 0)
			return BigInteger.valueOf(1);

		if(resultSequenceMemo.getOrDefault(number, null) != null) {
			return resultSequenceMemo.get(number);
		}

		BigInteger result = calculate(number.subtract(BigInteger.valueOf(3)))
			.add(calculate(number.subtract(BigInteger.valueOf(2))));
		resultSequenceMemo.put(number, result);

		return result;
	}

}