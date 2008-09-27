package com.swtxml.swt.injector;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.assertEquals;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.junit.Before;
import org.junit.Test;

import com.swtxml.swt.properties.IIdResolver;
import com.swtxml.swt.types.FormAttachmentType;

public class FormAttachmentTypeTest {

	private IIdResolver idResolver;
	private FormAttachmentType type;
	private Button test;

	@Before
	public void setUp() throws Exception {
		idResolver = createMock(IIdResolver.class);
		test = new Button(new Shell(), SWT.NONE);
		expect(idResolver.getById("test", Control.class)).andReturn(test);
		type = new FormAttachmentType(idResolver);
		replay(idResolver);
	}

	@Test
	public void testSimple() {
		FormAttachment attachment = type.convert(test, "10");
		assertEquals(10, attachment.offset);
		assertEquals(0, attachment.numerator);
	}

	@Test
	public void testPercentage() {
		FormAttachment attachment = type.convert(test, "90%-10");
		assertEquals(-10, attachment.offset);
		assertEquals(90, attachment.numerator);
	}

	@Test
	public void testReferControl() {
		FormAttachment attachment = type.convert(test, "test-10");
		assertEquals(test, attachment.control);
		assertEquals(-10, attachment.offset);
		assertEquals(0, attachment.numerator);
	}

}