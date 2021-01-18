package webDriverProcessor.webDriverProcess_fromPropertyFile.propertyFileProcesor.converter;

import org.aeonbits.owner.Converter;
import supportBrowser.SupportedBrowsers;
import webDriverProcessor.webDriverProcess_fromPropertyFile.WebDriverFactory;

import java.lang.reflect.Method;

public class BrowserDriverInfoConverter implements Converter {
    
    public SupportedBrowsers convert(Method methoddriverName, String s) {

        return new WebDriverFactory().getWebDriver(s);
    }
}
