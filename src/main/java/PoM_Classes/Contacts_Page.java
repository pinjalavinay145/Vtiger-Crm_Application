package PoM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contacts_Page {
    public Contacts_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@title=\"Create Contact...\"]")
    private WebElement createContactsButton;
    @FindBy(xpath = "//img[@title=\"Search in Contacts...\"]")
    private WebElement searchContactsButton;
    @FindBy(xpath = "//img[@title=\"Open Calendar...\"]")
    private WebElement openCalenderButton;
    @FindBy(xpath = "//img[@title=\"Show World Clock...\"]")
    private WebElement showWorldClockButton;
    @FindBy(xpath = "//img[@title=\"Open Calculator...\"]")
    private WebElement openCalculatorButton;
    @FindBy(xpath = "//img[@title=\"Chat...\"]")
    private WebElement chatButton;

    public WebElement getCreateContactsButton() {
        return createContactsButton;
    }

    public WebElement getSearchContactsButton() {
        return searchContactsButton;
    }

    public WebElement getOpenCalenderButton() {
        return openCalenderButton;
    }

    public WebElement getShowWorldClockButton() {
        return showWorldClockButton;
    }

    public WebElement getOpenCalculatorButton() {
        return openCalculatorButton;
    }

    public WebElement getChatButton() {
        return chatButton;
    }
}
