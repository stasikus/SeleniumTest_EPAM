package core;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by s.o.kravchenko on 02.04.2015.
 */
public class WebdriverExtension {

    protected static WebDriver driver;
    public WebdriverExtension(WebDriver driver) {
        this.driver = driver;
    }


}