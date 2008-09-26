package com.swtxml.util;

public interface IReflectorProperty {

	public abstract String getName();

	public abstract Class<?> getType();

	public abstract Object get(Object obj);

	public abstract void set(Object obj, Object value);

}