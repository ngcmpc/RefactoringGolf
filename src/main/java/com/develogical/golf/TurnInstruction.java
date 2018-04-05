package com.develogical.golf;

public class TurnInstruction extends Instruction {
    private final int amount;
	private final String name;

    public TurnInstruction(int amount) {
        this.amount = amount;
		this.name = "";
    }
}
