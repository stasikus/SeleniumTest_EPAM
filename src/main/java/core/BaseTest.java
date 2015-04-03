package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.*;

/**
 * Created by s.o.kravchenko on 02.04.2015.
 */
public class BaseTest {

    protected static WebDriver driver;

    public static LLAction LaLPage = new LLAction(getCurrentDriver());

    protected static WebDriver getCurrentDriver() {
        if (driver == null) {
            driver = new FirefoxDriver();
        }
        return driver;
    }

}
