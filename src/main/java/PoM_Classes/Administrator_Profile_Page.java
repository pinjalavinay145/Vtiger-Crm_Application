package PoM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Administrator_Profile_Page {
    public Administrator_Profile_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Sign Out']")
    private WebElement signOutButton;

    public WebElement getSignOutButton() {
        return signOutButton;
    }
}
