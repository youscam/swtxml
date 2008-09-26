package com.swtxml.swt.properties.setter;

import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.graphics.Point;

import com.swtxml.util.properties.IConverter;

public class PointConverter implements IConverter<Point> {

	public Point convert(Object obj, String value) {
		String[] sizes = StringUtils.split(value, ",x");
		return new Point(Integer.parseInt(sizes[0]), Integer.parseInt(sizes[1]));
	}

}
