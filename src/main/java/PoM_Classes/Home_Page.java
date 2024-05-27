package PoM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
    public Home_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "tabSelected")
    private WebElement homeTab;
    @FindBy(xpath = "//a[text()='Calendar']")
    private WebElement calender;
    @FindBy(xpath = "//a[@href=\"index.php?module=Leads&action=index\" ]")
    private WebElement leads;
    @FindBy(xpath = "//a[@href=\"index.php?module=Accounts&action=index\" and text()='Organizations']")
    private WebElement organizations;
    @FindBy(xpath = "//a[@href=\"index.php?module=Contacts&action=index\" and text()='Contacts']")
    private WebElement contacts;
    @FindBy(xpath = "//a[@href=\"index.php?module=Potentials&action=index\" and text()='Opportunities']")
    private WebElement opportunities;
    @FindBy(xpath = "//a[@href=\"index.php?module=Products&action=index\" and text()='Products']")
    private WebElement products;
    @FindBy(xpath =  "//a[@href=\"index.php?module=Documents&action=index\" and text()='Documents']")
    private WebElement documents;
    @FindBy(xpath = "//a[@href=\"index.php?module=Emails&action=index\" and text()='Email']")
    private WebElement email;
    @FindBy(xpath = "//img[@src=\"themes/softed/images/user.PNG\"]")
    private WebElement administratorProfile;
    @FindBy(xpath = "//img[@src=\"themes/softed/images/info.PNG\"]")
    private WebElement administratoriButton;
    @FindBy(xpath = "//img[@src=\"themes/softed/images/mainSettings.PNG\"]")
    private WebElement administratorSettingsButton;

    public WebElement getHomeTab() {
        return homeTab;
    }

    public WebElement getAdministratorProfile() {
        return administratorProfile;
    }

    public WebElement getAdministratoriButton() {
        return administratoriButton;
    }

    public WebElement getAdministratorSettingsButton() {
        return administratorSettingsButton;
    }

    public WebElement getCalender() {
        return calender;
    }

    public WebElement getLeads() {
        return leads;
    }

    public WebElement getOrganizations() {
        return organizations;
    }

    public WebElement getContacts() {
        return contacts;
    }

    public WebElement getOpportunities() {
        return opportunities;
    }

    public WebElement getProducts() {
        return products;
    }

    public WebElement getDocuments() {
        return documents;
    }

    public WebElement getEmail() {
        return email;
    }
}

