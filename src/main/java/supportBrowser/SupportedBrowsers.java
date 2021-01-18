package supportBrowser;

import org.openqa.selenium.WebDriver;
import webDriverInvoker.WebDriverInvoker;
import webDriverInvoker.webDriverInvokerImpl.localChromeInvoker.LocalChromeInvoker;
import webDriverInvoker.webDriverInvokerImpl.remoteChromeInvoker.RemoteChromeInvoker;
import webDriverInvoker.webDriverInvokerImpl.remoteFirefoxInvoker.RemoteFirefoxInvoker;

import java.net.MalformedURLException;

public enum SupportedBrowsers {

    REMOTE_CHROME(new RemoteChromeInvoker()),
    REMOTE_FIREFOX(new RemoteFirefoxInvoker()),
    LOCAL_CROME(new LocalChromeInvoker());

    WebDriverInvoker webDriverInvoker;

    SupportedBrowsers(WebDriverInvoker driverInvoker) {
        webDriverInvoker = driverInvoker;
    }

    public WebDriver getWebDriver(){
        WebDriver webDriver = null;
        try {
            webDriver = webDriverInvoker.invokeWebDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return webDriver;
    }
}
