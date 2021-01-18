package webDriverProcessor.webDriverProcess_fromPropertyFile;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import webDriverProcessor.webDriverProcess_fromPropertyFile.propertyFileProcesor.BrowsersInfo;

public class WebDriverInstansiator {
    private static InheritableThreadLocal<WebDriver> webDriver = new InheritableThreadLocal<WebDriver>();

    public WebDriver newWebDriver(){
       return ConfigFactory.create(BrowsersInfo.class).selectedBrowser().getWebDriver();
    }
}
