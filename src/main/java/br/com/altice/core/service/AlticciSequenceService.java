package br.com.altice.core.service;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.altice.core.domain.AlticciSequence;
import br.com.altice.core.repository.AlticciSequenceRepository;

@Service
public class AlticciSequenceService {

	@Autowired
	private AlticciSequenceRepository repository;

	public AlticciSequence create(AlticciSequence alticciSequence) {
		return repository.save(alticciSequence);
	}

	public Optional<AlticciSequence> findById(BigInteger id) {
		return repository.findById(id);
	}
	
}
