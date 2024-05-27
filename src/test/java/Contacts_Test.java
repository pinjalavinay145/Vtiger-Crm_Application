import WebDriver_Utility.Webdriver_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Contacts_Test extends Base_Class{
    @Test
    public void homePageTest() {
        Webdriver_Methods methods= new Webdriver_Methods(driver);
        methods.maximize();
        methods.implicitlyWait();
        //clicking contacts button
        driver.findElement(By.linkText("Contacts_Test")).click();
        //select in dropdown
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='bas_searchfield' and @class='txtBox']"));
        dropdown.click();
        methods.selectByValue(dropdown,"firstname");

        driver.findElement(By.cssSelector(".txtBox")).sendKeys("Mary");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        // driver.findElement(By.xpath("//input[@name='submit']")).click();

        driver.findElement(By.xpath("//input[@name=\"selected_id\"]")).click();
        driver.findElement(By.xpath("//a[text()='edit']")).click();

        String emailBeforeModification = driver.findElement(By.xpath("//input[@name=\"email\"]")).getText();
        driver.findElement(By.xpath("//input[@name=\"email\"]")).clear();
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("mary_smith123@company.com");

        driver.findElement(By.cssSelector(".crmButton")).click();
        //driver.findElement(By.cssSelector(".crmButton")).click();

        String email = driver.findElement(By.linkText("mary_smith123@company.com")).getText();
        Assert.assertNotEquals(email, emailBeforeModification);
        //  Assert.assertEquals(emailBeforeModification,email);


    }
}
