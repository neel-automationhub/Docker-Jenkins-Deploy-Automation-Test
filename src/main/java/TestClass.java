import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class TestClass {
    public static void main(String args[]) throws MalformedURLException {

        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        URL url = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, capabilities);
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
    }
}
