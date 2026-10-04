package com.jdc.pattern.domain;

import java.math.BigDecimal;

public final class ConsumerTransaction extends AbstractTransaction {

	private String consumerName;
	private BigDecimal amount;

	public ConsumerTransaction(long id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public ConsumerTransaction(long id, String name, String consumerName, BigDecimal amount) {
		super(id, name);
		this.consumerName = consumerName;
		this.amount = amount;
	}

	public String getConsumerName() {
		return consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
