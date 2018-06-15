import org.openqa.selenium.By;
import org.openqa.selenium.Point;

public class AmazonPageObejcts {

    int locationX = 1237;
    int locationY = 126;
    private String amazonUrl = "https://www.amazon.com/";
    private By signInButton = By.xpath("//*[@id=\"nav-link-accountList\"]");
    private By tryPrimeButton = By.xpath("//*[@id=\"nav-link-prime\"]");
    private By menu = By.xpath("//*[@id=\"nav-xshop-container\"]");
    private By userMenu = By.xpath("//*[@id=\"nav-tools\"]");
    private Point primeLocationPoint = new Point(locationX,locationY);
    private String menuBackgroundColor = "#000000";
    private String fontFamily = "arial, sans-serif";

    public Point getPrimeLocationPoint() {
        return primeLocationPoint;
    }

    public String getAmazonUrl() {
        return amazonUrl;
    }

    public By getSignInButton() {
        return signInButton;
    }

    public By getTryPrimeButton() {
        return tryPrimeButton;
    }

    public String getMenuBackgroundColor() {
        return menuBackgroundColor;
    }

    public By getMenu() {
        return menu;
    }

    public By getUserMenu() {
        return userMenu;
    }


    public String getFontFamily() {
        return fontFamily;
    }

}

