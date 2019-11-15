package Browsers;

import Testing.Events;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class Factory {

    private Factory(){}

    public Browser getBrowser(String nameBrowser){
        if(nameBrowser == null){
            return null;
        }
        if(nameBrowser.equalsIgnoreCase("CHROME")){
            return new Chrome();

        } else if(nameBrowser.equalsIgnoreCase("FIREFOX")){
            return new Firefox();

        }

        return null;
    }

    public static WebDriver getWebDriver(BrowserType browserType){
        Map<BrowserType, Browser> browserPickUp = new HashMap<>();
        browserPickUp.put(BrowserType.CHROME, new Chrome());
        browserPickUp.put(BrowserType.FIREFOX, new Firefox());
        return browserPickUp.get(browserType).initializeDriver();
    }

    public void exampleMap(){
        Map<String, String > students = new HashMap<>();

        students.put("123456", "Nombre1");
        students.put("456789", "Nombre2");
        students.put("654123", "Nombre3");

        students.get("456789");

    }

}

