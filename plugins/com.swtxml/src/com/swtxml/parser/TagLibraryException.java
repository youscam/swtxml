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
package com.swtxml.parser;

import com.swtxml.tag.TagInformation;

public class TagLibraryException extends RuntimeException {

	public TagLibraryException(TagInformation tagInfo, String message, Throwable cause) {
		super(tagInfo.getLocationInfo() + message, cause);
	}

	public TagLibraryException(TagInformation tagInfo, String message) {
		super(tagInfo.getLocationInfo() + message);
	}

	public TagLibraryException(TagInformation tagInfo, Throwable cause) {
		super(tagInfo.getLocationInfo() + cause.getMessage(), cause);
	}
}