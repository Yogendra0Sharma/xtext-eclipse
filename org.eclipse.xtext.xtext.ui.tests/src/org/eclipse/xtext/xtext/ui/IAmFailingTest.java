/*******************************************************************************
 * Copyright (c) 2020 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xtext.ui;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author dietrich - Initial contribution and API
 */
public class IAmFailingTest {
	
	@Test
	public void testDoFail() {
		Assert.fail("mimimi");
	}

}
