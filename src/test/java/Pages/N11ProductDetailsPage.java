package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class N11ProductDetailsPage extends BasePage{


    @FindBy(css = "ins[content='49459.00']")
    private WebElement priceOfSelectedProduct;


    @FindBy(id = "addToFavouriteWishListBtn")
    private  WebElement favorites;

    @FindBy(xpath = "//span[@class='toaster-sub-title']")
    private WebElement confirmMessageForAddingProductsCorrectly;

    public N11ProductDetailsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


    public WebElement checkProductPrice(){
        WebElement productPrice = priceOfSelectedProduct;
        return productPrice;
    }


    public String productPriceShouldBeCorrect(){
       String priceCheck =  priceOfSelectedProduct.getText();
       return priceCheck;

    }

    public void addingProductFavorites()throws InterruptedException{
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addToFavouriteWishListBtn")));
        Thread.sleep(6000);
        actions.moveToElement(favorites).click(favorites).build().perform();
    }

    public WebElement checkingFavoriteLists(){
        WebElement favoritesMessage = confirmMessageForAddingProductsCorrectly;
         return favoritesMessage;
    }
}
