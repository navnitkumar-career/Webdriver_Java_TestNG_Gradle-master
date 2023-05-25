package testGoogle.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    protected static WebDriver driver;

    public static WebDriver getInstance() {

        driver = new FirefoxDriver();
        return driver;

    }

}
