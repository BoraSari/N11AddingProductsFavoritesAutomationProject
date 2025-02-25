package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class N11LoginPage extends BasePage{
   @FindBy(id = "email")
    private WebElement emailElement;

    @FindBy(id = "password")
    private WebElement passwordElement;

    @FindBy(id = "loginButton")
    private WebElement loginButtonElement;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div[5]/div/div/div/a[2]")
    private WebElement navigateLoginPage;



    public N11LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


    public void enterEmail(String email){
        emailElement.sendKeys(email);

    }

    public void enterPassword(String password){
        passwordElement.sendKeys(password);
    }


    public void clickLoginButton(){
        loginButtonElement.click();
    }

    public void navigateLoginPage(){
        navigateLoginPage.click();
    }




}
