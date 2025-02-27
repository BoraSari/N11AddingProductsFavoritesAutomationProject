package N11Tests;

import Pages.ElectronicProductsPage;
import Pages.N11LoginPage;
import Pages.N11ProductDetailsPage;
import Pages.N11TabBarPage;
import org.testng.annotations.Test;
import io.github.cdimascio.dotenv.Dotenv;

public class N11Tests extends BaseTest {
    N11TabBarPage n11TabBarPage;
    N11LoginPage loginPage;

    ElectronicProductsPage electronicProductsPage;
    N11ProductDetailsPage productDetailsPage;
    Dotenv dotenv = Dotenv.load();

    @Test(priority = 1)
    public void loginTest()throws InterruptedException{
        loginPage=new N11LoginPage(driver);
        loginPage.getBaseUrl();
        loginPage.navigateLoginPage();
        String email = dotenv.get("EMAIL");
        String password = dotenv.get("PASSWORD");
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }




    @Test(priority = 2)
  public void navigateElectronicCategoryTest(){
        n11TabBarPage=new N11TabBarPage(driver);
        n11TabBarPage.navigateElectronicCategory();
    electronicProductsPage=new ElectronicProductsPage(driver);
    electronicProductsPage.scrollPage();
    electronicProductsPage.navigateSelectedProduct();
  }



  @Test(priority = 3)
  public void checkProductPriceTest(){
    productDetailsPage=new N11ProductDetailsPage(driver);
    softAssert.assertTrue(productDetailsPage.checkProductPrice().isDisplayed());
    softAssert.assertFalse(productDetailsPage.productPriceShouldBeCorrect().equals("18999"));
  }

  @Test(priority = 4)
  public void addingProductFavorites()throws InterruptedException{
        productDetailsPage.addingProductFavorites();
        Thread.sleep(3000);
        softAssert.assertTrue(productDetailsPage.checkingFavoriteLists().isDisplayed());

  }







}
