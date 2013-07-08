package com.github.thebiologist13.attributelib;

import java.util.UUID;

public class Modifier {

	private double amount;
	private UUID id;
	private String name;
	private Operation op;

	public Modifier(String name, Operation op, double amount) {
		this(name, op, amount, UUID.randomUUID());
	}

	public Modifier(String name, Operation op, double amount, UUID id) {
		this.name = name;
		this.op = op;
		this.amount = amount;
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Operation getOp() {
		return op;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOp(Operation op) {
		this.op = op;
	}

}
