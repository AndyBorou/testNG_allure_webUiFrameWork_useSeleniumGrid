package webDriverProcessor.webDriverProcess_fromPropertyFile;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import supportBrowser.SupportedBrowsers;

public class WebDriverFactory {

    public SupportedBrowsers getWebDriver(String browserName) {

        if(StringUtils.containsIgnoreCase(browserName, "local")){
            if(StringUtils.containsIgnoreCase(browserName, "chrome")){
                return SupportedBrowsers.LOCAL_CROME;
            }
        } else if(StringUtils.containsIgnoreCase(browserName, "chrome")){
            return SupportedBrowsers.REMOTE_CHROME;
        }else if(StringUtils.containsIgnoreCase(browserName, "firefox")){
            return SupportedBrowsers.REMOTE_FIREFOX;
        }else{
            throw new NullPointerException();
        }
        return null;
    }
}
