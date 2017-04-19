package me.coley.bmf.consts;

public class ConstMethodHandle extends Constant<Integer> {

    public ConstMethodHandle(int kind, int index) {
        super(ConstantType.METHOD_HANDLE, (kind << 16) | index);
    }

    public int getKind() {
        return (getValue().intValue() >> 16) & 0xffff;
    }

    public int getIndex() {
        return getValue().intValue() & 0xffff;
    }
}