import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTests {

    AmazonPageObejcts amazonTestObjects = new AmazonPageObejcts();
    WebDriver driver = TestSetup.createFirefoxDriver();

    @Test(priority = 1)
    public void alignmentTest() throws InterruptedException {
        driver.get(amazonTestObjects.getAmazonUrl());
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //Location Test
        Point primePoint = driver.findElement(amazonTestObjects.getTryPrimeButton()).getLocation();
        Assert.assertEquals(primePoint,amazonTestObjects.getPrimeLocationPoint());
        Thread.sleep(3000);

    }
    @Test(priority = 2)
    public void colorTest(){
        String backgroundColor = Color.fromString(driver.findElement(amazonTestObjects.getMenu()).getCssValue("background-color")).asHex();
        //Color Test
        Assert.assertEquals(backgroundColor,amazonTestObjects.getMenuBackgroundColor());
    }

    @Test(priority = 3)
    public void fontTest(){
        String menuFontFamily = driver.findElement(amazonTestObjects.getUserMenu()).getCssValue("font-family");
        //Font Test
        Assert.assertEquals(menuFontFamily,amazonTestObjects.getFontFamily());

    }
}
