package br.com.altice.core.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.altice.core.domain.AlticciSequence;


public interface AlticciSequenceRepository extends JpaRepository<AlticciSequence, BigInteger> { }
