import Java_Utility.Random_Number;
import PoM_Classes.Home_Page;
import PoM_Classes.ProductsPage_EditButtonPage;
import PoM_Classes.Products_Page;
import WebDriver_Utility.Webdriver_Methods;
import org.testng.annotations.Test;

public class Products_Test extends Base_Class {
    @Test
    public void productsTabTest() {
        Webdriver_Methods methods = new Webdriver_Methods(driver);
        Home_Page homepage = new Home_Page(driver);
        Products_Page products = new Products_Page(driver);
        ProductsPage_EditButtonPage editbutton = new ProductsPage_EditButtonPage(driver);
        Random_Number no = new Random_Number();
        methods.maximize();
        methods.implicitlyWait();
        homepage.getProducts().click();

        methods.selectByValue(products.getSearchDropdown(), "productname");

        methods.sendKeysBasedonXpath(products.getSearchFotTab(), "Vtiger 5 Users Pack");
        methods.click(products.getSearchButton());

        methods.click(products.getEdit());

        editbutton.getProductNo();

        methods.sendKeysBasedonXpath(editbutton.getProductName(), "Vtiger 5 Users Pack" + no.randomNo());
        methods.sendKeysBasedonXpath(editbutton.getProductNo(), "PRO2" + no.randomNo());
        methods.click(editbutton.getSaveButton());

    }
}
