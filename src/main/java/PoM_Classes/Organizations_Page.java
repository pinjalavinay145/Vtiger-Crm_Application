package PoM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizations_Page {
    public Organizations_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@title=\"Create Organization...\"]")
    private WebElement createOrganizationButton;
    @FindBy(xpath = "//img[@title=\"Search in Organizations...\"]")
    private WebElement searchInOrganizationsButton;
    @FindBy(xpath = "//img[@title=\"Open Calendar...\"]")
    private WebElement openCalenderButton;
    @FindBy(xpath = "//img[@title=\"Show World Clock...\"]")
    private WebElement showWorldClockButton;
    @FindBy(xpath = "//img[@title=\"Chat...\"]")
    private WebElement chatButton;
    @FindBy(xpath = "//input[@name=\"search_text\"]")
    private WebElement searchTxtBox;
    @FindBy(xpath = "//td[@class=\"small\"]/div/select")
    private WebElement inDropDown;
    @FindBy(xpath = "//input[@class=\"crmbutton small create\" and@name=\"submit\"]")
    private  WebElement searchButton;

    public WebElement getCreateOrganizationButton() {
        return createOrganizationButton;
    }

    public WebElement getSearchInOrganizationsButton() {
        return searchInOrganizationsButton;
    }

    public WebElement getOpenCalenderButton() {
        return openCalenderButton;
    }

    public WebElement getShowWorldClockButton() {
        return showWorldClockButton;
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

    public WebElement getSearchButton() {
        return searchButton;
    }
}
