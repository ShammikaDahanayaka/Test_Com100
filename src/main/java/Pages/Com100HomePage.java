package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Com100HomePage {
    WebDriver driver;

    public Com100HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Using FindBy for locating elements
    @FindBy(how = How.XPATH, using = "//div")
    WebElement profileDropdown;
    @FindBy(how = How.XPATH, using = "//text()[.='Log Out']")
    WebElement logoutLink;

    // This method to click on Profile Dropdown
    public void clickOnProfileDropdown() {
        profileDropdown.click();
    }

    // This method to click on Logout link
    public void clickOnLogoutLink() {
        logoutLink.click();
    }
}