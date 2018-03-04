/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.context;

import org.xwiki.component.annotation.Role;
import org.xwiki.stability.Unstable;

/**
 * Manager for handling the initialization of the XWikiContext inside of the current execution context.
 *
 * @version $Id$
 * @since 10.2-RC1
 */
@Role
@Unstable
public interface XWikiContextInitializationManager
{
    /**
     * Initialize the XWiki context and set it in the execution context available through the Execution component.
     *
     * @throws XWikiContextInitializationException if an error happened
     */
    void initialize() throws XWikiContextInitializationException;

    /**
     * Initialize the XWiki context and set it in the execution context available through the Execution component.
     *
     * @param mode the mode of the XWiki context
     * @throws XWikiContextInitializationException if an error happened
     */
    void initialize(int mode) throws XWikiContextInitializationException;

    /**
     * Initialize the XWiki context and set it in the given execution context.
     *
     * @param executionContext the execution context that should contain the initialized XWiki context
     * @param mode the mode of the XWiki context
     * @throws XWikiContextInitializationException if an error happened
     */
    void initialize(ExecutionContext executionContext, int mode) throws XWikiContextInitializationException;
}
