package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class Com100LoginPage {
    WebDriver driver;

    public Com100LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Using FindBy for locating elements
    @FindBy(how = How.XPATH, using = "//input[@name='email']")
    WebElement emailTextBox;
    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    WebElement passwordTextBox;
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Sign in')]")
    WebElement signinButton;


    // This method is to set Email in the email text box
    public void setEmail(String email) {
        emailTextBox.sendKeys(email);
    }

    // This method is to set Password in the password text box
    public void setPassword(String password) {
        passwordTextBox.sendKeys(password);
    }

    // This method is to click on Login Button
    public void clickOnLoginButton() {
        signinButton.click();
    }
}
