package br.com.altice.core.component;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class CalculateAlticciSequence {

	private static final Map<Long, Long> resultSequenceMemo = new HashMap<>();

	// top-down dynamic program approach
	public Long calculate(Long number) {
		if(number == 0)
			return 0L;

		if(number == 1 || number == 2)
			return 1L;

		if(resultSequenceMemo.getOrDefault(number, null) != null) {
			return resultSequenceMemo.get(number);
		}

		long result = calculate(number - 3) + calculate(number - 2);
		resultSequenceMemo.put(number, result);

		return result;
	}

}