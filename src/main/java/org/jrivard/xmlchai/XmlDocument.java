/*
 * XML Chai Library
 * Copyright (c) 2021 Jason D. Rivard
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.jrivard.xmlchai;

import java.util.List;
import java.util.Optional;

/**
 * Represents a mutable Document containing an {@link XmlElement} reference.  <code>XmlDocument</code> instances
 * are thread-safe.
 */
public interface XmlDocument
{
    XmlElement getRootElement();

    Optional<XmlElement> evaluateXpathToElement( String xpathExpression );

    List<XmlElement> evaluateXpathToElements( String xpathExpression );

    XmlDocument copy();

    AccessMode getModifyMode();

}