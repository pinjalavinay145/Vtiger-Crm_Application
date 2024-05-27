package PoM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leads_Page {

    public Leads_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@title=\"Create Lead...\"]")
    private WebElement createLeadButton;
    @FindBy(xpath = "//img[@title=\"Search in Leads...\"]")
    private WebElement searchInLeadButton;
    @FindBy(xpath = "//img[@title=\"Open Calendar...\"]")
    private WebElement openCalenderButton;
    @FindBy(xpath = "//img[@title=\"Show World Clock...\"]")
    private WebElement showWorldClockButton;
    @FindBy(xpath = "//img[@title=\"Open Calculator...\"]")
    private WebElement openCalculator;
    @FindBy(xpath = "//img[@title=\"Chat...\"]")
    private WebElement chatButton;
    @FindBy(xpath = "//input[@class=\"txtBox\"]")
    private WebElement searchTxtBox;
    @FindBy(xpath = "(//select[@id=\"bas_searchfield\" and @class=\"txtBox\" ])[1]")
    private WebElement inDropDown;
    @FindBy(xpath = "//input[@name=\"submit\"]")
    private WebElement searchNowButton;

    public WebElement getCreateLeadButton() {
        return createLeadButton;
    }

    public WebElement getSearchInLeadButton() {
        return searchInLeadButton;
    }

    public WebElement getOpenCalenderButton() {
        return openCalenderButton;
    }

    public WebElement getShowWorldClockButton() {
        return showWorldClockButton;
    }

    public WebElement getOpenCalculator() {
        return openCalculator;
    }

    public WebElement getChatButton() {
        return chatButton;
    }

    public WebElement getSearchTxtBox() {
        return searchTxtBox;
    }

    public WebElement getInDropDown() {
        return inDropDown;
    }

    public WebElement getSearchNowButton() {
        return searchNowButton;
    }
}
