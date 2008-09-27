package com.swtxml.swt.metadata;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.widgets.Widget;

import com.swtxml.definition.AttributeDefinition;
import com.swtxml.definition.IAttributeDefinition;
import com.swtxml.definition.ITagDefinition;
import com.swtxml.definition.DefinitionException;
import com.swtxml.swt.SwtHandling;
import com.swtxml.swt.types.StyleType;
import com.swtxml.util.properties.ClassProperties;
import com.swtxml.util.properties.Property;

public class WidgetTag implements ITagDefinition {

	private String className;
	private Class<? extends Widget> swtWidgetClass;

	private Map<String, IAttributeDefinition> attributes;

	public WidgetTag(String className) {
		this.className = className;
	}

	public String getName() {
		return getSwtWidgetClass().getSimpleName();
	}

	public Map<String, IAttributeDefinition> getAttributes() {
		if (attributes == null) {
			ClassProperties<? extends Widget> properties = SwtHandling.WIDGET_PROPERTIES
					.getProperties(getSwtWidgetClass());
			attributes = new HashMap<String, IAttributeDefinition>();
			for (Property property : properties.getProperties().values()) {
				WidgetAttribute attribute = new WidgetAttribute(property);
				attributes.put(attribute.getName(), attribute);
			}
			attributes.put("style", new AttributeDefinition("style", new StyleType(SwtHandling.SWT)));
		}
		return attributes;
	}

	@Override
	public String toString() {
		return "SwtTag[" + className + "]";
	}

	@SuppressWarnings("unchecked")
	public Class<? extends Widget> getSwtWidgetClass() {
		if (this.swtWidgetClass == null) {
			try {
				this.swtWidgetClass = (Class<Widget>) Class.forName(className);
			} catch (ClassNotFoundException e) {
				throw new DefinitionException(e);
			}
		}
		return swtWidgetClass;
	}

	public int compareTo(ITagDefinition o) {
		return this.getName().compareTo(o.getName());
	}
}
