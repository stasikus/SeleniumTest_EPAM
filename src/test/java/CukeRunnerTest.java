import core.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

/**
 * Created by s.o.kravchenko on 02.04.2015.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        format = { "html:target/cucumber.html" },
        features = "src/test/Features/")

public class CukeRunnerTest extends BaseTest {
    @BeforeClass
    public static void setUp(){
        LaLPage.Open();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown(){
        try {
            LaLPage.ClickOnLogoutButton();
        }
        finally {
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            driver.quit();
        }

    }
}
