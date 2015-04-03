package pageObjects;

import core.BaseTest;
import org.openqa.selenium.By;

/**
 * Created by s.o.kravchenko on 02.04.2015.
 */
public class MainForm extends BaseTest{

    public static boolean isPresendSimpleModal()
    {
        Object mainFormElement = driver.findElement(By.id("simplemodal-container"));
        if (mainFormElement != null)
            return true;
        return false;
    }

    public static AllActionsOfMainForm MainFormDialog()
    {
        return new AllActionsOfMainForm();
    }
}
