import core.ApplicationSettings;
import core.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.OtherActions;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

/**
 * Created by stas on 02.04.2015.
 */
public class sanityTest extends BaseTest {
    @Given("^web site login page$")
    public void OpenLoginPage()
    {
        LaLPage.ClickOnLoginButton();
        LaLPage.ProvideUserName();
        LaLPage.ProvidePassword();
    }

    @When("^logged$")
    public void Submit()
    {
        LaLPage.ClickOnSubmitButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("^user should be redirected to personal page$")
    public void isLoggedCheck()
    {
        Assert.assertTrue("isLoggedCheck was failed", OtherActions.isLoggedin());
    }

    @Given("^logged web page$")
    public void isContentPresentCheck()
    {
        Assert.assertTrue("isContentPresentCheck was failed", OtherActions.isContent());
    }

    @When("^name and surname should be the same like in ApplicationSetting file$")
    public void nameAndSurnameCheck()
    {
        boolean nameAndSurnameBool = OtherActions.checkNameAndSurname(ApplicationSettings.name, ApplicationSettings.surname);
        if (!nameAndSurnameBool) {
            String actualNameAndSurname = driver.findElement(By.xpath("//div[@class='user']/ul/li[1]/a")).getText();
            String expectedNameAndSurname = ApplicationSettings.name + " " + ApplicationSettings.surname;
            Assert.assertTrue("Error Check acc number. Expected: " + expectedNameAndSurname + "" +
                    " Actual: "+actualNameAndSurname+"", false);
        }
    }

    @And("^acc number should be the same like in ApplicationSetting file$")
    public void accNumCheck()
    {
        boolean accNuBool = OtherActions.checkAccNum(ApplicationSettings.accNu);

        if (!accNuBool) {
            String actualAccNum = driver.findElement(By.xpath("//div[@class='form-with-side']/dl[2]/dd[2]")).getText();
            Assert.assertTrue("Error Check acc number. Expected: " + ApplicationSettings.accNu + "" +
                    " Actual: "+actualAccNum+"", false);
        }
    }
    @And("^set a filter to country form$")
    public void setCounryFilterCheck()
    {
        Assert.assertTrue("Oops, counry wasn't filtered", OtherActions.changeFilter(ApplicationSettings.filterCountry));
    }

    @Then("^user able to add a new language$")
    public void addNewLan()
    {
        Assert.assertTrue("Oops, language wasn't added", OtherActions.changeLanguage(ApplicationSettings.language, ApplicationSettings.filterCountry));
    }

}
