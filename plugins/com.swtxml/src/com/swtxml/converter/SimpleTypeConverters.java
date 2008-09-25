package com.swtxml.converter;

import com.swtxml.util.FormatException;

public class SimpleTypeConverters {

	public static class StringConverter implements IConverter<String> {
		public String convert(String value) {
			// TODO: i18n
			if (value.startsWith("%")) {
				throw new FormatException("i18n for string properties is currently unsupported");
			}
			return value;
		}
	}

	public static class BooleanConverter implements IConverter<Boolean> {
		public Boolean convert(String value) {
			return Boolean.parseBoolean(value);
		}
	}

	public static class IntegerConverter implements IConverter<Integer> {
		public Integer convert(String value) {
			return Integer.parseInt(value);
		}
	}

	public static class FloatConverter implements IConverter<Float> {
		public Float convert(String value) {
			return Float.parseFloat(value);
		}
	}

	public static class CharacterConverter implements IConverter<Character> {
		public Character convert(String value) {
			return value.charAt(0);
		}
	}

}
