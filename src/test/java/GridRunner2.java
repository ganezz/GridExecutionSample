import com.iexceed.uiframework.core.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class GridRunner2 extends TestBase {

    public WebDriver driver;


    public  void edge() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName(BrowserType.EDGE);
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
            driver.get("http://www.facebook.com");
            Thread.sleep(20000);
            driver.manage().window().fullscreen();
            System.out.println(" From Remote " + driver.getTitle());
        }catch (Exception e){
            System.out.println(e);
        }finally {
            driver.quit();
        }
    }

    @Test
    public void invokeIE() throws Exception {
        TestBase.initialization("ie");
        TestBase.getDriver().get("http://www.facebook.com");
        Thread.sleep(20000);
        TestBase.getDriver().quit();
    }

}