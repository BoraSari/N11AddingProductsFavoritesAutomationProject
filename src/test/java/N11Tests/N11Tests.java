package N11Tests;

import Pages.ElectronicProductsPage;
import Pages.N11LoginPage;
import Pages.N11ProductDetailsPage;
import Pages.N11TabBarPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.cdimascio.dotenv.Dotenv;
import org.testng.log4testng.Logger;

public class N11Tests extends BaseTest {
    N11TabBarPage n11TabBarPage;
    N11LoginPage loginPage;
    ElectronicProductsPage electronicProductsPage;
    N11ProductDetailsPage productDetailsPage;
    Dotenv dotenv = Dotenv.load();
    private static final Logger logger = Logger.getLogger(N11Tests.class);


    @BeforeMethod
    public void setupPageClass(){
        logger.info("Setup process for all classes");
        n11TabBarPage= new N11TabBarPage(driver);
        loginPage = new N11LoginPage(driver);
        electronicProductsPage = new  ElectronicProductsPage(driver);
        productDetailsPage = new N11ProductDetailsPage(driver);
    }

    @Test(priority = 1)
    public void loginTest()throws InterruptedException{
        logger.info("Opening MainPage");
        loginPage.getBaseUrl();
        logger.info("Navigating Login Page Section");
        loginPage.navigateLoginPage();
        logger.info("Special Values");
        String email = dotenv.get("EMAIL");
        logger.info("Special Values");
        String password = dotenv.get("PASSWORD");
        logger.info("Input email");
        loginPage.enterEmail(email);
        logger.info("Input password");
        loginPage.enterPassword(password);
        logger.info("Click Login Button");
        loginPage.clickLoginButton();
    }




    @Test(priority = 2)
  public void navigateElectronicCategoryTest(){
        logger.info("Navigating electronic category section");
        n11TabBarPage.navigateElectronicCategory();
    electronicProductsPage=new ElectronicProductsPage(driver);
    logger.info("Scroll down the page.");
    electronicProductsPage.scrollPage();
    logger.info("Select product");
    electronicProductsPage.navigateSelectedProduct();
  }



  @Test(priority = 3)
  public void checkProductPriceAssertionTest(){
        logger.info("Navigate Product Details Page");
      electronicProductsPage.navigateSelectedProduct();
      logger.info("Assertion for product price display and text.");
        softAssert.assertTrue(productDetailsPage.checkProductPrice().isDisplayed());
    softAssert.assertTrue(productDetailsPage.productPriceShouldBeCorrect().equals("49.459 TL"));
  }

  @Test(priority = 4)
  public void addingProductFavorites()throws InterruptedException{
        logger.info("Adding products favorites");
        productDetailsPage.addingProductFavorites();
        logger.info("Assertion for favorite message display.");
        softAssert.assertTrue(productDetailsPage.checkingFavoriteLists().isDisplayed());

  }







}
