/*
 * Copyright 2000-2014 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.tests.widgetset.server.gwtrpc;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.vaadin.tests.widgetset.client.gwtrpc.GwtRpcServiceTest;

/**
 * Test GWT RPC in Vaadin DevMode.
 *
 * @author Vaadin Ltd
 */
@SuppressWarnings("serial")
public class GwtRpcServletTest extends RemoteServiceServlet
        implements GwtRpcServiceTest {

    @Override
    public String giveMeThat(String that, String haveThis) {
        return "Take " + that + " for " + haveThis;
    }

}
