package webDriverInvoker.webDriverInvokerImpl.localChromeInvoker;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import webDriverInvoker.WebDriverInvoker;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class LocalChromeInvoker implements WebDriverInvoker {

    public WebDriver invokeWebDriver() {
//        WebDriverManager от Bonigarcia. - очень полезная вешь для реализации локального драйвера
//                ЛЮБОГО драйвера

        chromedriver().setup();
        return new ChromeDriver();
    }
}
