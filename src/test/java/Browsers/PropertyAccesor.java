package Browsers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyAccesor {
    private static PropertyAccesor propertyAccesor;
    private Properties prop;

    private PropertyAccesor() {
        try (InputStream input = new FileInputStream("gradle.properties")) {
            prop = new Properties();
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PropertyAccesor getInstance(){
        if(propertyAccesor == null){
            propertyAccesor = new PropertyAccesor();
        }
        return propertyAccesor;
    }

    public String getBaseURL(){
        return prop.getProperty("url");
    }

    public String getBrowser() {
        return prop.getProperty("Browser");
    }
    
}
