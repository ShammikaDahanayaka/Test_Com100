package Com100Test;

import Base.TestBase;
import Pages.Com100HomePage;
import Pages.Com100LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Com100Test extends TestBase {
    private WebDriver driver;
    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
                {"testemail@gmail.com", "testpassword"},
                {"testemail@gmail.com", "123456"}
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String email, String password) {
        Com100LoginPage loginPage = PageFactory.initElements(driver, Com100LoginPage.class);
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        loginPage.clickOnLoginButton();

        Com100HomePage homePage = PageFactory.initElements(driver, Com100HomePage.class);
        homePage.clickOnProfileDropdown();
        homePage.clickOnLogoutLink();
    }


}

