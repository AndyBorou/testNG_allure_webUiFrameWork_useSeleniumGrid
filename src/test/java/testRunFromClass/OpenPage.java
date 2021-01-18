package testRunFromClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.GooglePage;
import webDriverProcessor.webDriverProcess_fromPropertyFile.WebDriverInstansiator;

import java.util.concurrent.TimeUnit;

public class OpenPage {
    GooglePage googlePage;
    WebDriver driver;

    @BeforeMethod
    public void setupDriver(){
            googlePage = new GooglePage(driver = new WebDriverInstansiator().newWebDriver());
    }

    @Test
    public void shouldBeBlogTitle() throws InterruptedException {

        googlePage.open();
        googlePage.search("automation remarks");
    }

    @AfterClass
    public void quiteDriver(){
        driver.quit();
    }
}
