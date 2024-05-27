package PoM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products_Page {
    public Products_Page(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//select[@class=\"txtBox\"]")
       private WebElement searchDropdown;

    @FindBy(xpath = "//input[@name='search_text']")
    private WebElement searchFotTab;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement searchButton;

    @FindBy(xpath = "//a[text()='Vtiger 5 Users Pack']/../following-sibling::td/a[text()='edit']")
    private WebElement edit;


    public WebElement getEdit() {
        return edit;
    }

    public WebElement getSearchDropdown() {
        return searchDropdown;
    }

    public WebElement getSearchFotTab() {
        return searchFotTab;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }
}
