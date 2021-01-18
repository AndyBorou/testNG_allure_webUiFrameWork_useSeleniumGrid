package webDriverProcessor.webDriverProcessFromTestngFile;

import org.openqa.selenium.WebDriver;
import supportBrowser.SupportedBrowsers;

class WebDriverFactory{

    public WebDriver getWebDriver(String browserName) {
        WebDriver browserWebDriver = null;
        if(browserName.equals("chrome")) {
            browserWebDriver = SupportedBrowsers.REMOTE_CHROME.getWebDriver();
        }else if (browserName.equals("firefox")){
            browserWebDriver = SupportedBrowsers.REMOTE_FIREFOX.getWebDriver();
        }

        else if (browserName.equals("local_chrome")){
            browserWebDriver = SupportedBrowsers.LOCAL_CROME.getWebDriver();
        }
        return  browserWebDriver;
    }
}
