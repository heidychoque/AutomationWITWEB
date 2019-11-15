package Testing;

import Browsers.Manager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoadPage {
    protected WebDriver webDriver;

    public LoadPage() {
        this.webDriver = Manager.getInstance().getWebDriver();
        PageFactory.initElements(webDriver, this);
    }
}
