package Testing;

import Browsers.Manager;
import Browsers.PropertyAccesor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoadHome {
    public static Home loadHome(){
        Manager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new Home();
    }

    public static void maximizeWindow() {
        Manager.getInstance().getWebDriver().manage().window().maximize();
    }

    public static void closeWindow(){
        Manager.getInstance().getWebDriver().close();
        Manager.getInstance().getWebDriver().quit();
    }

    public static void waitTime(){ Manager.getInstance().getWebDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public static void waitTimeexplicit(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(Manager.getInstance().getWebDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

}
