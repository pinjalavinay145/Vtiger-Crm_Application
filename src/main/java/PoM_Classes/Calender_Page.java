package PoM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calender_Page {
    public Calender_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//td[text()='Calendar' and @class=\"dvtSelectedCell\"]")
    private WebElement calender;
    @FindBy(xpath = "//a[text()='All Events & Todos']")
    private WebElement allEventsAndTodos;
    @FindBy(xpath = "//img[@title=\"Search in Calendar...\"]")
    private WebElement searchInCalender;
    @FindBy(xpath = "//img[@title=\"Open Calendar...\"]")
    private WebElement openCalender;
    @FindBy(xpath = "//img[@title=\"Show World Clock...\"]")
    private WebElement showWorldClock;
    @FindBy(xpath = "//img[@title=\"Open Calculator...\"]")
    private WebElement openCalculator;

    @FindBy(xpath = "//img[@alt='Open Calculator...']/../../following-sibling::td//img[@alt='Chat...']")
    private WebElement chat;
    @FindBy(xpath = "//img[@src=\"themes/softed/images/cal_next_nav.gif\"]")
    private WebElement futureDateArroe;

    public WebElement getCalender() {
        return calender;
    }

    public WebElement getAllEventsAndTodos() {
        return allEventsAndTodos;
    }

    public WebElement getSearchInCalender() {
        return searchInCalender;
    }

    public WebElement getOpenCalender() {
        return openCalender;
    }

    public WebElement getShowWorldClock() {
        return showWorldClock;
    }

    public WebElement getOpenCalculator() {
        return openCalculator;
    }

    public WebElement getChat() {
        return chat;
    }

    public WebElement getFutureDateArroe() {
        return futureDateArroe;
    }
}
