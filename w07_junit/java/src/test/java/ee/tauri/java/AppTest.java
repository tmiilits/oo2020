package ee.tauri.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private static App app;
    private static String name;

    /**
     * Rigorous Test :-)
     */

    @BeforeClass
    public static void initiateApp(){
        name = "Tauri";
        app = new App(name);
    }

    @Test
    public void appHasCorrectName(){
        assertTrue("App name is Tauri", app.getName() == name);
    }

    @Test
    public void shouldAnswerWithTrue(){
        assertTrue( true );
    }

    @Test
    public void oneEqualsTwo(){
        //assertEquals("Checking if one equals two", );
        assertEquals("One equals two", 1, 2);
    }

    @Test
    public void getMaxValue(){
        assertEquals("Get max value", 10, app.maxValue(4, 10));
    }
}
