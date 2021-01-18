package pageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class GooglePage {

    private static final String URL = "http://google.com/";

    private static final By SEARCH_INPUT = By.name("q");
    private static final By SEARCH_BTN = By.name("btnK");

    public GooglePage(WebDriver driver) {
        WebDriverRunner.setWebDriver(driver);
    }

    public void search(String name){
        $(SEARCH_INPUT).sendKeys(name);
        $(SEARCH_BTN).click();
    }

    public void open() {
        Selenide.open(URL);
    }
}
