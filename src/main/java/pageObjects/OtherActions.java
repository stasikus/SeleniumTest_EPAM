package pageObjects;

import core.*;
import org.openqa.selenium.By;

/**
 * Created by stas on 02.04.2015.
 */
public class OtherActions extends BaseTest{
    public static boolean isLoggedin()
    {
        Object topx = driver.findElement(By.xpath("//span[@class='icon-top-x']"));
        if (topx != null)
            return true;

        return false;
    }

    public static boolean isContent()
    {
        Object contentBlock = driver.findElement(By.xpath("//div[@class='wrap']//div[@class='content']"));
        if (contentBlock != null)
            return true;

        return false;
    }

    public static boolean checkNameAndSurname(String expName, String expSurname)
    {
        String actualNameSurname = driver.findElement(By.xpath("//div[@class='user']//li[1]/a")).getText();
        if (actualNameSurname.equals(expName + " " + expSurname))
            return true;

        return false;
    }

    public static boolean checkAccNum(String expectedAccNum)
    {
        String actualAccNum = driver.findElement(By.xpath("//div[@class='form-with-side']/dl[2]/dd[2]")).getText();

        if (actualAccNum.equals(expectedAccNum))
            return true;

        return false;
    }

    public static boolean changeFilter(String countryFilter)
    {
        MainForm.MainFormDialog().Filter(countryFilter);

        Object chosenCountry = driver.findElement(By.xpath("//div[@class='countries']//ul[@class='clearfix']"));

        if (chosenCountry.toString() != "")
        {
            //MainForm.MainFormDialog().Close();
            return true;
        }
        //else
        //MainForm.MainFormDialog().Close();

        return false;
    }

    public static boolean changeLanguage(String language, String country)
    {
        MainForm.MainFormDialog().Language(language, country);

        Object actualLang = driver.findElement(By.xpath("//div[@class='language']/ul//a[contains(text(),'" + language + "')]"));

        if (actualLang != null)
            return true;
        else
            MainForm.MainFormDialog().Close();

        return false;
    }



}
