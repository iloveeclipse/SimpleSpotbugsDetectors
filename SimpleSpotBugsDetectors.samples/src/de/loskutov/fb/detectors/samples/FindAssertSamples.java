/*******************************************************************************
 * Copyright (c) 2012 Andrey Loskutov.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributor:
 *   Andrey Loskutov - initial API and implementation
 *******************************************************************************/
package de.loskutov.fb.detectors.samples;

import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

public class FindAssertSamples {

    @ExpectWarning(value = "ASSERT", rank = 2, confidence = Confidence.MEDIUM, num = 2)
    public void test() {
        assert (true == false);
        assert (true == false) : "Hallo";
        if(Boolean.TRUE){
            System.err.println();
        }
    }
}
