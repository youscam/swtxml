package com.swtxml.swt.processors;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Widget;

import com.swtxml.parser.ITagProcessor;
import com.swtxml.swt.SwtHandling;
import com.swtxml.swt.metadata.WidgetBuilder;
import com.swtxml.swt.metadata.WidgetTag;
import com.swtxml.tag.TagInformation;

public class BuildWidget implements ITagProcessor {

	public void process(TagInformation tag) {
		if (!(tag.getTagDefinition() instanceof WidgetTag)) {
			return;
		}
		// TODO: clarify root node processing
		if (tag.getParent() == null) {
			return;
		}

		WidgetTag widgetTag = (WidgetTag) tag.getTagDefinition();
		WidgetBuilder builder = new WidgetBuilder(widgetTag);

		Integer style = SwtHandling.SWT.getIntValue(tag.getAttribute("style"));
		Composite parent = (Composite) tag.parentRecursiveAdaptTo(builder.getParentClass());
		Widget widget = builder.build(parent, style == null ? SWT.NONE : style);
		tag.makeAdaptable(widget);
	}

}
