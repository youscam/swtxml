/*******************************************************************************
 * Copyright (c) 2008 Ralf Ebert
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ralf Ebert - initial API and implementation
 *******************************************************************************/
package com.swtxml;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.swtxml.events.EventNamespaceDefinitionTest;
import com.swtxml.events.registry.EventsRegistryTest;
import com.swtxml.events.visitor.CreateEventListenersTest;
import com.swtxml.resources.ClassResourceTest;
import com.swtxml.swt.byid.ByIdInjectorTest;
import com.swtxml.swt.injector.FormAttachmentTypeTest;
import com.swtxml.swt.injector.SwtInjectorTest;
import com.swtxml.swt.injector.SwtTypesTest;
import com.swtxml.swt.metadata.SwtNamespaceTest;
import com.swtxml.swt.sample.SwtWidgetsTest;
import com.swtxml.swt.visitor.BuildWidgetsTest;
import com.swtxml.swt.visitor.ProcessingTest;
import com.swtxml.tinydom.TinyDomParserTest;
import com.swtxml.util.context.ContextTest;
import com.swtxml.util.lang.CollectionUtilsTest;
import com.swtxml.util.lang.ResourceUtilsTest;
import com.swtxml.util.parser.ConstantParserTest;
import com.swtxml.util.parser.KeyValueParserTest;
import com.swtxml.util.parser.SplitterTest;
import com.swtxml.util.properties.BaseConvertersTest;
import com.swtxml.util.properties.PropertyMatcherTest;
import com.swtxml.util.properties.PropertyRegistryTest;
import com.swtxml.util.proposals.MatchTest;
import com.swtxml.util.reflector.ReflectorTest;

/**
 * Test suite containing all tests which can run independent from the
 * environment.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses( { CollectionUtilsTest.class, ResourceUtilsTest.class, SplitterTest.class,
		MatchTest.class, ReflectorTest.class, PropertyMatcherTest.class, BaseConvertersTest.class,
		PropertyRegistryTest.class, ConstantParserTest.class, KeyValueParserTest.class,
		FormAttachmentTypeTest.class, ContextTest.class, SwtTypesTest.class, SwtInjectorTest.class,
		SwtNamespaceTest.class, EventsRegistryTest.class, EventNamespaceDefinitionTest.class,
		CreateEventListenersTest.class, TinyDomParserTest.class, ByIdInjectorTest.class,
		BuildWidgetsTest.class, ProcessingTest.class, SwtWidgetsTest.class, ClassResourceTest.class })
public class AllTests {

}