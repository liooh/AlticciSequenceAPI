package br.com.altice.core.domain;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alticci", schema = "altice")
public class AlticciSequence implements Serializable {

	private static final long serialVersionUID = 6705989041652735573L;

	@Id
	private BigInteger number;
	private BigInteger value;

	public BigInteger getNumber() {
		return number;
	}

	public void setNumber(BigInteger number) {
		this.number = number;
	}

	public BigInteger getValue() {
		return value;
	}

	public void setValue(BigInteger value) {
		this.value = value;
	}

}
