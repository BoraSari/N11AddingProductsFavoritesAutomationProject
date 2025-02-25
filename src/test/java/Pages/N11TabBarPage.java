package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class N11TabBarPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div[5]/div/div/div/a[2]")
    private  WebElement loginSection;

    @FindBy(xpath = "//span[contains(text(),'Elektronik')]")
    private WebElement electronicCategory;







    public N11TabBarPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }




    public void navigateElectronicCategory(){
        electronicCategory.click();
    }


}
