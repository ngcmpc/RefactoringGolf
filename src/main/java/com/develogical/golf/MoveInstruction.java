package com.develogical.golf;

public class MoveInstruction extends Instruction {
    private final int amount;
	private final long x;

    public MoveInstruction(int amount) {
       this.amount = amount;
	   this.x = 1L;
    }
}
