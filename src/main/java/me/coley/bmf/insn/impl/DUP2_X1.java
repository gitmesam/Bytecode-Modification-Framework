package me.coley.bmf.insn.impl;

import me.coley.bmf.insn.Instruction;
import me.coley.bmf.insn.OpType;

public class DUP2_X1 extends Instruction {
    public DUP2_X1() {
        super(OpType.STACK, Instruction.DUP2_X1, 1);
    }
}
