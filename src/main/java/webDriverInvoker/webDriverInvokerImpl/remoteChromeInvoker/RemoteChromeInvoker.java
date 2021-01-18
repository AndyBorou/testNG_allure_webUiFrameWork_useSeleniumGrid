package webDriverInvoker.webDriverInvokerImpl.remoteChromeInvoker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import webDriverInvoker.WebDriverInvoker;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteChromeInvoker implements WebDriverInvoker {
    public WebDriver invokeWebDriver() throws MalformedURLException {
        String path = "seleniumgrid/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        return new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"), capability
        );
    }
}
