package PoM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

    public Login_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[name='user_name']")
    private WebElement userName;
    @FindBy(css = "[name='[name='user_password']']")
    private WebElement passWord;
    @FindBy(css = "id='submitButton'")
    private WebElement loginButton;


    public WebElement getUserName() {
        return userName;
    }

    public WebElement getPassWord() {
        return passWord;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
}
