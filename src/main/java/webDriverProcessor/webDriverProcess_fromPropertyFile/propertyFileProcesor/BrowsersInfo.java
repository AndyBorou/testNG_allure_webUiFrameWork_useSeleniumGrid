package webDriverProcessor.webDriverProcess_fromPropertyFile.propertyFileProcesor;

import org.aeonbits.owner.Config;
import supportBrowser.SupportedBrowsers;
import webDriverProcessor.webDriverProcess_fromPropertyFile.propertyFileProcesor.converter.BrowserDriverInfoConverter;


@Config.Sources("classpath:browser.properties")
public interface BrowsersInfo extends Config {

    @Key("SELECTED.BROWSER")
    @ConverterClass(BrowserDriverInfoConverter.class)
    SupportedBrowsers selectedBrowser();

    @Key("SELECTED.BROWSER")
    String selectedBrowser2();
}
