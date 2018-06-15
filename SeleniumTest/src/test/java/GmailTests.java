
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailTests {


    GmailPageObjects gmailTestObjects = new GmailPageObjects();
    WebDriver driver = TestSetup.createFirefoxDriver();

    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        driver.get(gmailTestObjects.getGmailUrl());
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //Using absolute xpath
        driver.findElement(gmailTestObjects.getSignInButton()).click();
        //Using relative xpath
        driver.findElement(gmailTestObjects.getEmailFeild()).click();
        driver.findElement(gmailTestObjects.getEmailFeild()).sendKeys("santosh.anudeep");
        //Using absolute xpath
        driver.findElement(gmailTestObjects.getNextButton()).click();
        Thread.sleep(3000);
        driver.findElement(gmailTestObjects.getPasswordField()).click();
        driver.findElement(gmailTestObjects.getPasswordField()).sendKeys("asdfasdf");
        driver.findElement(gmailTestObjects.getNextButton()).click();
        //Using absolute xpath
        Assert.assertTrue(driver.findElement(gmailTestObjects.getWrongPasswordText()).getText().equalsIgnoreCase("Wrong password. Try again or click Forgot password to reset it."));
    }


}




