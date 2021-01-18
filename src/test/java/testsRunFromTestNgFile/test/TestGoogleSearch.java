package testsRunFromTestNgFile.test;

import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.GooglePage;
import testsRunFromTestNgFile.fixture.BaseTestGrid;
import webDriverProcessor.webDriverProcessFromTestngFile.WebDriverInstansiator;

public class TestGoogleSearch extends BaseTestGrid {

//    @Test
    public void shouldBeBlogTitle2() {
        WebDriver driver = WebDriverInstansiator.getDriver();
        driver.navigate().to("http://joyreactor.cc/");
    }

    GooglePage googlePage;

    @BeforeMethod
    public void setUp() {
        googlePage = new GooglePage(WebDriverInstansiator.getDriver());
    }

    @Epic("epic")
    @Feature("feature")
    @Story("Story")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Description")

    @Test
    public void shouldBeBlogTitle() {
        googlePage.open();
        googlePage.search("automation remarks");
    }

}
