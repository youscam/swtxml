package com.swtxml.util;

import java.util.Collection;
import java.util.Collections;

public class ReflectorBean {

	private Collection<IReflectorProperty> properties;

	public ReflectorBean(Class<?> clazz) {
		this(clazz, false);
	}

	public ReflectorBean(Class<?> clazz, boolean includePublicFields) {
		this.properties = Reflector.findPublicProperties(clazz, includePublicFields);
	}

	public IReflectorProperty getProperty(String propertyName) {
		for (IReflectorProperty property : properties) {
			if (propertyName.equals(property.getName())) {
				return property;
			}
		}
		return null;
	}

	public Collection<IReflectorProperty> getProperties() {
		return Collections.unmodifiableCollection(properties);
	}

}
