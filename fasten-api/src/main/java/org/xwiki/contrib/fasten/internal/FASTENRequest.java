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
package org.xwiki.contrib.fasten.internal;

import java.util.Arrays;
import java.util.List;

import org.xwiki.job.DefaultRequest;
import org.xwiki.job.Request;

/**
 * @version $Id$
 */
public class FASTENRequest extends DefaultRequest
{
    /**
     * The id of this job.
     */
    public static final List<String> ID = Arrays.asList("fasten");

    /**
     * @param request the request to copy
     */
    public FASTENRequest(Request request)
    {
        super(request);
    }

    /**
     * Default constructor.
     */
    public FASTENRequest()
    {
        setId(ID);
    }
}
