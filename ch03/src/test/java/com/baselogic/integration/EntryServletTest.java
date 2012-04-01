package com.baselogic.integration;

import com.baselogic.selenium.AbstractSeleniumTestCase;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;

/**
 * [Class_Name]
 *
 * @author Mick Knutson
 *         <a href="http://www.baselogic.com>Blog</a>< /br>
 *         <a href="http://linkedin.com/in/mickknutson>LinkedIN</a>< /br>
 *         <a href="http://twitter.com/mickknutson>Twitter</a>< /br>
 *         <a href="http://www.mickknutson.com>Personal</a>< /br>
 * @since 2011
 *        <i>To change this template use File | Settings | File Templates.</i>
 */
public class EntryServletTest extends AbstractSeleniumTestCase {

    final Logger logger = LoggerFactory.getLogger(EntryServletTest.class);

    @Before
    public void beforeTest() throws Exception {
    }

    @Test
    public void testEntryServlet() throws Exception {
        logger.info("----------------------------------------");
        logger.info("/declarative/entry");

        selenium.windowMaximize();

        // base: http://localhost:8181
        selenium.open("/ch03/declarative/entry");
        selenium.waitForPageToLoad("40000");

        selenium.click("link=Patients Area");
        selenium.waitForPageToLoad("30000");

        // Sleep the thread if you want to view the rendered page while testing.
        Thread.sleep(30000);
        assertTrue(true);
    }
}
