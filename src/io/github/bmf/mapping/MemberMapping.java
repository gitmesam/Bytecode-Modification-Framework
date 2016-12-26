package io.github.bmf.mapping;

import io.github.bmf.type.descriptors.MemberDescriptor;
import io.github.bmf.util.Box;

public class MemberMapping extends AbstractMapping {
    public final MemberDescriptor desc;

    public MemberMapping(String name, MemberDescriptor desc) {
        this(new Box<String>(name), desc);
    }

    public MemberMapping(Box<String> name, MemberDescriptor desc) {
        super(name);
        this.desc = desc;
    }
    
    @Override
    public String toString(){
        return name.getValue() + desc.toDesc();
    }
}
