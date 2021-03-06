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
package com.vaadin.tests.components.table;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import com.vaadin.testbench.By;
import com.vaadin.testbench.commands.TestBenchElementCommands;
import com.vaadin.tests.tb3.MultiBrowserTest;

public class TableTooManyColumnsTest extends MultiBrowserTest {

    @Test
    public void testDropdownTable() throws IOException {
        openTestURL();

        WebElement element = findElement(
                By.className("v-table-column-selector"));

        element.click();

        WebElement menu = findElement(By.className("gwt-MenuBar-vertical"));

        TestBenchElementCommands scrollable = testBenchElement(menu);
        scrollable.scroll(3000);

        compareScreen(getScreenshotBaseName());
    }

}
