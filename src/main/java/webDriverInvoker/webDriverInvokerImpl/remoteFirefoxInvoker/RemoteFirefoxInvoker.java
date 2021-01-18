package webDriverInvoker.webDriverInvokerImpl.remoteFirefoxInvoker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import webDriverInvoker.WebDriverInvoker;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteFirefoxInvoker implements WebDriverInvoker {
    public WebDriver invokeWebDriver() throws MalformedURLException {
        String path1 = "seleniumgrid/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", path1);
        DesiredCapabilities capabilityFirefox = DesiredCapabilities.firefox();
        return new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"), capabilityFirefox
        );
    }
}
