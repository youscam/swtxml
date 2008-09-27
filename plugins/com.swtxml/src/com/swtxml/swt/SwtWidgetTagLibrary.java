/*******************************************************************************
 * Copyright (c) 2008 Ralf Ebert and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ralf Ebert - initial API and implementation
 *******************************************************************************/
package com.swtxml.swt;

import com.swtxml.parser.ITagLibrary;
import com.swtxml.tag.TagInformation;

public class SwtWidgetTagLibrary implements ITagLibrary {

	public TagInformation tag(TagInformation tag) {
		return tag;
	}

}