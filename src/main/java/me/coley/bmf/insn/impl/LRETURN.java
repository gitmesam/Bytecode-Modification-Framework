package me.coley.bmf.insn.impl;

import me.coley.bmf.insn.AbstractRETURN;
import me.coley.bmf.insn.Instruction;
import me.coley.bmf.insn.OpType;
import me.coley.bmf.type.Type;

public class LRETURN extends AbstractRETURN {
    public LRETURN() {
        super(OpType.RETURN, Instruction.LRETURN, Type.LONG);
    }
}
