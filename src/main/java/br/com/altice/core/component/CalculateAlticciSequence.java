package br.com.altice.core.component;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.altice.core.domain.AlticciSequence;
import br.com.altice.core.service.AlticciSequenceService;

@Component
public class CalculateAlticciSequence {

	private static final Logger log = LoggerFactory.getLogger(CalculateAlticciSequence.class);

	private static final Map<BigInteger, BigInteger> resultSequenceMemo = new HashMap<>();

	@Autowired
	private AlticciSequenceService service;

	// top-down dynamic program approach
	public BigInteger calculate(BigInteger number) {
		if(number.compareTo(BigInteger.valueOf(0)) == 0)
			return BigInteger.valueOf(0);

		if(number.compareTo(BigInteger.valueOf(1)) == 0 || number.compareTo(BigInteger.valueOf(2)) == 0)
			return BigInteger.valueOf(1);

		// search first in ram memory
		if(resultSequenceMemo.getOrDefault(number, null) != null) {
			return resultSequenceMemo.get(number);
		} else {
			// search second in disk memory
			Optional<AlticciSequence> optionalAlticciSequence = service.findById(number);
			if(optionalAlticciSequence.isPresent()) {
				resultSequenceMemo.put(number, optionalAlticciSequence.get().getValue()); // save in ram memory result
				return optionalAlticciSequence.get().getValue();
			}
		}

		BigInteger result = calculate(number.subtract(BigInteger.valueOf(3)))
				.add(calculate(number.subtract(BigInteger.valueOf(2))));
		resultSequenceMemo.put(number, result);

		try {
			AlticciSequence alticciSequence = new AlticciSequence();
			alticciSequence.setNumber(number);
			alticciSequence.setValue(result);

			service.create(alticciSequence); // save in a disk memory result
		} catch (Exception e) {
			log.info("Error for to save the alticci sequence: {}", e.getMessage());
		}

		return result;
	}

}