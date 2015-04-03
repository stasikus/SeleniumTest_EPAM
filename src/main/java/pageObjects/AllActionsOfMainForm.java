package pageObjects;

import core.*;
import org.openqa.selenium.By;

/**
 * Created by s.o.kravchenko on 02.04.2015.
 */
public class AllActionsOfMainForm extends BaseTest{
    protected By mainForm = By.id("simplemodal-container");
    protected By countryChooser = By.xpath("//div[@class='language']/a[@class='open-country-chooser']");

    public AllActionsOfMainForm Close()
    {
        try {
            Object mainFormElement = driver.findElement(mainForm); //if the main form is present
            if (mainFormElement != null)
                driver.findElement(By.xpath("//div[@id='simplemodal-container']/a[@class='modalCloseImg simplemodal-close']")).click();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return this;
    }

    public AllActionsOfMainForm Language(String language, String country)
    {
        try {
            //driver.findElement(countryChooser).click(); //open language form
            //driver.findElement(By.xpath("//ul[@class='clearfix']/li[@data-country='xx']/a[@class='more_languages']")).click(); //add new language
            driver.findElement(By.xpath("//ul[@class='clearfix']//div[contains(.,'" + country + "')]/../a[@class='more_languages']")).click(); //add new language
            driver.findElement(By.xpath("//div[@class='simplemodal-wrap']//div[@class='languages']//a[contains(text(),'" + language + "')]")).click(); //choose language
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return this;
    }

    public AllActionsOfMainForm Filter(String countryFilter)
    {
        try {
            driver.findElement(countryChooser).click(); //open language form
            driver.findElement(By.xpath("//div[@class='countries']/div[@class='header']//input")).sendKeys(countryFilter); //fill the county filter
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return this;
    }

}
