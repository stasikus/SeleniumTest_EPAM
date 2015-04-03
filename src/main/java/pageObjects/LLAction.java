package pageObjects;

import core.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by s.o.kravchenko on 02.04.2015.
 */
public class LLAction extends WebdriverExtension{

    public LLAction(WebDriver driver) {
        super(driver);
    }

    protected By loginButton = By.xpath("//div[@class='user']/a[2]");
    protected By usernameTextbox = By.id("username");
    protected By passwordTextbox = By.id("password");
    protected By submitButton = By.xpath("//button[@class='button big alt3 uppercase']");
    protected By logoutButton = By.xpath("//div[@class='user']//a[@class='delete']");

    public void Open() {

        driver.navigate().to(ApplicationSettings.baseurl);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        if (MainForm.isPresendSimpleModal())   //check if main for is opened
            MainForm.MainFormDialog().Close();
    }

    public void ClickOnLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void ProvideUserName() {
        driver.findElement(usernameTextbox).sendKeys(ApplicationSettings.login);
    }

    public void ProvidePassword() {
        driver.findElement(passwordTextbox).sendKeys(ApplicationSettings.pass);
    }

    public void ClickOnSubmitButton() {
        driver.findElement(submitButton).click();
    }

    public void ClickOnLogoutButton() {
        driver.findElement(logoutButton).click();
    }

}
