package com.github.thebiologist13.attributelib;

import java.util.HashMap;
import java.util.Map;

public enum VanillaAttribute {

	MAX_HEALTH("generic.maxHealth", 20, 0, -1),
	FOLLOW_RANGE("generic.followRange", 32, 0, 2048),
	KNOCKBACK_RESISTANCE("generic.knockbackResistance", 0, 0, 1),
	MOVEMENT_SPEED("generic.movementSpeed", 0.7D, 0, -1),
	ATTACK_DAMAGE("generic.attackDamage", 2, 0, -1),
	JUMP_STRENGTH("horse.jumpStrength", 0.7D, 0, 2),
	SPAWN_REINFORCEMENTS("zombie.spawnReinforcements", 0, 0, 1);
	
	private static final Map<String, VanillaAttribute> NAME_MAP = new HashMap<String, VanillaAttribute>();
	
	private final String NAME;
	private final double BASE;
	private final double MINIMUM;
	private final double MAXIMUM;
	
	VanillaAttribute(String name, double base, double min, double max) {
		this.NAME = name;
		this.BASE = base;
		this.MINIMUM = min;
		this.MAXIMUM = max;
	}

	public static VanillaAttribute fromName(String name) {
		return NAME_MAP.get(name);
	}
	
	public String getName() {
		return NAME;
	}

	public double getDefaultBase() {
		return BASE;
	}

	public double getMinimum() {
		return MINIMUM;
	}

	public double getMaximum() {
		return MAXIMUM;
	}
	
	static {
		for(VanillaAttribute v : values()) {
			NAME_MAP.put(v.getName(), v);
		}
	}
	
}
