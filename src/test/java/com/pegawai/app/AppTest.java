package com.pegawai.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.thymeleaf.dialect.springdata.SpringDataDialect;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    /**
     * Test of main method, of class App.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        App.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addViewControllers method, of class App.
     */
    @org.junit.Test
    public void testAddViewControllers() {
        System.out.println("addViewControllers");
        ViewControllerRegistry registry = null;
        App instance = new App();
        instance.addViewControllers(registry);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of springDataDialect method, of class App.
     */
    @org.junit.Test
    public void testSpringDataDialect() {
        System.out.println("springDataDialect");
        App instance = new App();
        SpringDataDialect expResult = null;
        SpringDataDialect result = instance.springDataDialect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
