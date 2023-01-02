import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridRunner {

    public static WebDriver driver;
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName(BrowserType.CHROME);
        try {
             driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
            driver.get("http://www.google.com");
            Thread.sleep(30000);
            driver.manage().window().fullscreen();
            System.out.println(" From Remote " + driver.getTitle());
        }catch (Exception e){
            System.out.println(e);
        }finally {
            driver.quit();
        }
    }
}