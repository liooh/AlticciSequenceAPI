package br.com.altice.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.altice.core.component.CalculateAlticciSequence;

@RestController
@RequestMapping("alticci-sequence")
public class AlticciSequenceController {

	private static final Logger log = LoggerFactory.getLogger(AlticciSequenceController.class);

	@Autowired
	private CalculateAlticciSequence calculateAlticciSequence;

	@GetMapping("/alticci/{number}")
	public Long findAlticciSequence(@PathVariable Long number) {
		log.info("Started calculate alticci sequence for number: {}", number);
		long result = calculateAlticciSequence.calculate(number);
		log.info("Finished calculate alticci sequence for number: {} and the result is: {}", number, result);
		return result;
	}

}
