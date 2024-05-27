import PoM_Classes.Administrator_Profile_Page;
import PoM_Classes.Home_Page;
import WebDriver_Utility.Webdriver_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

public class Base_Class {
    WebDriver driver;
    @BeforeSuite
    public void beforeSuite(){
        Reporter.log("before environmental configurations executed");

    }
    @BeforeTest
    public void beforeTest(){
        Reporter.log("before Database configurations executed");

    }
    @BeforeClass
    public void beforeClass(){
         driver=new ChromeDriver();

    }
    @BeforeMethod
    public void beforeMethod(){
        driver.get("http://localhost:8888/index.php?action=Login&module=Users");
        driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("root");
        driver.findElement(By.id("submitButton")).click();

    }
    @AfterMethod
    public void afetMethod(){
        Webdriver_Methods methods= new Webdriver_Methods(driver);
        Home_Page home= new Home_Page(driver);
        home.getAdministratorProfile();
        Administrator_Profile_Page admin= new Administrator_Profile_Page(driver);
        WebElement signOutButton = admin.getSignOutButton();
        methods.clickAction(driver, home.getAdministratorProfile(),signOutButton);

    }
    @AfterClass
    public void afterClass(){
        driver.quit();

    }
    @AfterTest
    public void afterTest(){
        Reporter.log("after Database configurations executed");

    }

    @BeforeSuite
    public void aftereSuite(){
        Reporter.log("after environmental configurations executed");

    }
}
