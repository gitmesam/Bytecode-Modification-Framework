package me.coley.bmf.insn.impl;

import me.coley.bmf.insn.Instruction;
import me.coley.bmf.insn.OpType;

public class LADD extends Instruction {
    public LADD() {
        super(OpType.MATH, Instruction.LADD, 1);
    }
}
