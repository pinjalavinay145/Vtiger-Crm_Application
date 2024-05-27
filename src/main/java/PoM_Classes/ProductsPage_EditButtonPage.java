package PoM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductsPage_EditButtonPage {

    public ProductsPage_EditButtonPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@name=\"productname\"]")
    private WebElement productName;
    @FindBy(xpath = "//input[@name=\"product_no\"]")
    private WebElement productNo;
    @FindBy(xpath = "//input[@type=\"submit\"]")
    private WebElement saveButton;

    public WebElement getProductName() {
        return productName;
    }

    public WebElement getProductNo() {
        return productNo;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }
}
