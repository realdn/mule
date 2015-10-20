/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.api.context.notification;

import java.io.Serializable;

/**
 * Keeps context information about the processors that a flow executed.
 * 
 * @since 3.8.0
 */
public interface FlowStackElement extends Serializable, Cloneable
{

    /**
     * Deep-copies this instance.
     */
    FlowStackElement clone();

    /**
     * Marks the passed processorRepresentation as being executed as part of this flow.
     */
    void addInvokedMessageProcessor(String processorRepresentation);

}
