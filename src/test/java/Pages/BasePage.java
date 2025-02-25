package Pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void getBaseUrl(){
        driver.get("https://www.n11.com/");
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public String getPageSources(){
        return driver.getPageSource();
    }
}
