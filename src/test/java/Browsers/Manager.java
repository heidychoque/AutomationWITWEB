package Browsers;

import org.openqa.selenium.WebDriver;

public class Manager {
    private WebDriver webDriver;
    private static Manager ourInstance = new Manager();

    public static Manager getInstance() {
        return ourInstance;
    }

    private Manager() {
        webDriver = Factory.getWebDriver(BrowserType.valueOf(PropertyAccesor.getInstance().getBrowser()));
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }
}
