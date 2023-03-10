import com.iexceed.uiframework.core.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class GridRunner extends TestBase{

    public WebDriver driver;


    public void chrome() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName(BrowserType.CHROME);
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
            driver.get("http://www.google.com");
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
    public void invokeChrome() throws Exception {
        Thread.sleep(4000);
        TestBase.initialization("chrome");
        TestBase.getDriver().get("http://www.google.com");
        Thread.sleep(20000);
        TestBase.getDriver().quit();
    }

    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("docker-compose -f docker-compose-v3-video.yml up");
    }



}