/*******************************************************************************
 * Copyright (c) 2013 Andrey Loskutov.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributor:
 *   Andrey Loskutov
 *******************************************************************************/
package de.loskutov.fb.matcher;

import org.objectweb.asm.tree.AbstractInsnNode;

public class InsnNode extends InstructionMatcher {

    /**
     * @param opcode instruction opcode, as in {@link AbstractInsnNode#getOpcode()}
     */
    public InsnNode(int opcode) {
        super();
        this.opcode = opcode;
    }

    @Override
    public boolean matches(AbstractInsnNode n) {
        return n.getOpcode() == opcode;

    }

}
