package io.github.bmf.attribute.method;

import io.github.bmf.attribute.Attribute;
import io.github.bmf.attribute.AttributeType;

/**
 * An attribute belonging to the
 * "{@link io.github.bmf.attribute.method.AttributeCode Code}" attribute of a method.
 * The table correlates opcode indices with java line numbers <i>(For
 * debugging).</i>
 */
public class AttributeLineNumberTable extends Attribute {
	/**
	 * The {@link io.github.bmf.attribute.method.LineNumberTable table}.
	 */
	public LineNumberTable lines;

	public AttributeLineNumberTable(int name, LineNumberTable lines) {
		super(name, AttributeType.LINE_NUMBER_TABLE);
		this.lines = lines;
	}

	@Override
	public int getLength() {
		// ??: linetable
		return BASE_LEN + lines.getLength();
	}

}
