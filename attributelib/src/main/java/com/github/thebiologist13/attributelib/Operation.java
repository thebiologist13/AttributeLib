package com.github.thebiologist13.attributelib;

public enum Operation {

	INCREMENT(0),
	ADDITIVE(1),
	MULTIPLICATIVE(2);
	
	private final int OP;
	
	Operation(int op) {
		this.OP = op;
	}
	
	public static Operation fromId(int id) {
		switch(id) {
		case 0:
			return INCREMENT;
		case 1:
			return ADDITIVE;
		case 2:
			return MULTIPLICATIVE;
		}
		return null;
	}
	
	public int getOperation() {
		return OP;
	}
	
}
