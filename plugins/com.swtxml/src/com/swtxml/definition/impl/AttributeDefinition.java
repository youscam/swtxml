package com.swtxml.definition.impl;

import com.swtxml.definition.IAttributeDefinition;
import com.swtxml.util.types.IType;

public class AttributeDefinition implements IAttributeDefinition {

	private String name;
	private IType<?> type;

	public AttributeDefinition(String name, IType<?> type) {
		super();
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IType<?> getType() {
		return type;
	}

	public void setType(IType<?> type) {
		this.type = type;
	}

}