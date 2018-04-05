package com.develogical.golf;

public class MoveInstruction extends Instruction {
    private final int amount;
	private final String name;

    public MoveInstruction(int amount) {
       this.amount = amount;
	   this.name = "";
    }
}
