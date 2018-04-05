package com.develogical.golf;

public class TurnInstruction extends Instruction {
    private final int amount;
	private final long x;

    public TurnInstruction(int amount) {
        this.amount = amount;
		this.x = 1L;
    }
}
