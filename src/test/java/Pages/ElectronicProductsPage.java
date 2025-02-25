package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ElectronicProductsPage extends BasePage{

    @FindBy(xpath = "(//img[@class='lazy cardImage'])[2]")
    private WebElement product;
    JavascriptExecutor js=((JavascriptExecutor) driver);



    public ElectronicProductsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);

    }


    public void scrollPage(){
        js.executeScript("window.scrollBy(0,600)");

    }

    public void navigateSelectedProduct(){
      Actions actions = new Actions(driver);
      actions.moveToElement(product).click().build().perform();


    }
}





//xpath = "//h3[contains(@class,\"productName\") and contains(text(),\"Sony Playstation 5 Slim 1 TB Digital Edition Oyun Konsolu + 2 Dualsense Kol (İthalatçı Garantili)\")]"
