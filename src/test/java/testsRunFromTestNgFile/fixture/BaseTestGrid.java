package testsRunFromTestNgFile.fixture;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import webDriverProcessor.webDriverProcessFromTestngFile.WebDriverInstansiator;


public class BaseTestGrid {
    @Parameters({"browserName"})
    @BeforeClass
    public void setUp(@Optional("chrome") String browserName) {
        WebDriverInstansiator.setDriver(browserName);
    }

    @AfterClass
    public void tearDown() {
         WebDriverInstansiator.getDriver().quit();
    }
}
