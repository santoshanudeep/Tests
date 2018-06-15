import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestSetup {

    public static ChromeDriver createChromeDriver(){
        WebDriver driverObject;
        driverObject = new ChromeDriver();
        return (ChromeDriver) driverObject;
        }
    public static FirefoxDriver createFirefoxDriver(){
        WebDriver driverObject;
        driverObject = new FirefoxDriver();
        return (FirefoxDriver) driverObject;
        }
    public static InternetExplorerDriver InternetExplorerDriver(){
        WebDriver driverObject;
        driverObject = new InternetExplorerDriver();
        return (InternetExplorerDriver) driverObject;
    }
    }

