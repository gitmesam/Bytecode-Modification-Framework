package io.github.bmf.opcode.impl;

import io.github.bmf.opcode.Opcode;
import io.github.bmf.opcode.OpcodeType;
import io.github.bmf.opcode.SingleValueOpcode;

public class ICONST extends SingleValueOpcode<Integer> {
    public ICONST(int value) {
        super(OpcodeType.CONST_VALUE, opFromValue(value), 1, value);
    }

    private static int opFromValue(int value) {
        if (value == 0)
            return Opcode.ICONST_0;
        else if (value == 1)
            return Opcode.ICONST_1;
        else if (value == 2)
            return Opcode.ICONST_2;
        else if (value == 3)
            return Opcode.ICONST_3;
        else if (value == 4)
            return Opcode.ICONST_4;
        else return Opcode.ICONST_5;
    }
}
