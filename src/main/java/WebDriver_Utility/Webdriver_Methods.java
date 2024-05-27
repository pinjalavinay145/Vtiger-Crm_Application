package WebDriver_Utility;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Webdriver_Methods {
    WebDriver driver=null;
    WebDriverWait wait;
    Select select;
    Actions action;

    public Webdriver_Methods(WebDriver driver) {
        this.driver = driver;
    }

    public void maximize() {
        driver.manage().window().maximize();
    }
    public void minimize() {
        driver.manage().window().minimize();
    }
    public void implicitlyWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    public void get(String browser) {
        driver.get(browser);
    }

    public void ExplictlyWait(String webElement) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.id(webElement)));
    }

    public void selectByValue(WebElement webelement, String value) {
        select = new Select(webelement);
        select.selectByValue(value);
    }

    public void selectByIndex(WebElement webelement, int indexValue) {
        select = new Select(webelement);
        select.selectByIndex(indexValue);
    }

    public void selectByVisibleText(WebElement webelement, String textValue) {
        select = new Select(webelement);
        select.selectByVisibleText(textValue);
    }

    public void clickHoldRelease(WebDriver driver, WebElement element1, WebElement element2) {
        action = new Actions(driver);
        action.clickAndHold(element1).release(element2).perform();
    }

    public void clickAction(WebDriver driver, WebElement element1, WebElement element2) {
        action = new Actions(driver);
        action.moveToElement(element1).click(element2).perform();
    }

    public void doubleClickActions(WebDriver driver, WebElement element1, WebElement element2) {
        action = new Actions(driver);
        action.doubleClick(element1).click(element2);
    }

    public void takeScreenShotOfEntireWebPage(String externalFilePath) throws IOException {
        TakesScreenshot takescreenShot = (TakesScreenshot) driver;
        File source = takescreenShot.getScreenshotAs(OutputType.FILE);
        File destination = new File(externalFilePath);
        FileHandler.copy(source, destination);
    }

    public void takeScreenShotOfParticularWebelement(WebElement locator, String externalFilePath) throws IOException {
        File source = locator.getScreenshotAs(OutputType.FILE);
        File destination = new File(externalFilePath);
        FileHandler.copy(source, destination);
    }

    public void switchToChildWindow(String childWindowName) {
        driver.switchTo().window(childWindowName);
    }

    public void switchToParentWindow(String parentWindowName) {
        driver.switchTo().window(parentWindowName);
    }

    public void switchToDefaultWindow() {
        driver.switchTo().defaultContent();
    }

    public void closeDriver() {
        driver.close();
    }

    public void quitDriver() {
        driver.quit();
    }

    public void switchToFrameBasedOnIndex(int index) {
        driver.switchTo().frame(index);
    }
    public void switchToFrameBasedOnWebElement(String webelement) {
        driver.switchTo().frame(webelement);
    }
    public void switchToFrameBasedOacnId(String idValue) {
        driver.switchTo().frame(idValue);
    }
    public void switchToFrameBasedOnName(String nameValue) {
        driver.switchTo().frame(nameValue);
    }
    public void sendKeysBasedonXpath(WebElement element, String value){
       // driver.findElement(By.xpath(xpath)).sendKeys();
        element.sendKeys(value);
    }
    public void click(WebElement element){
       // driver.findElement(By.xpath(String.valueOf(xpath))).click();
        element.click();
    }

}
