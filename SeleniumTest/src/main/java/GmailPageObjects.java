import org.openqa.selenium.By;

public class GmailPageObjects {

    private String gmailUrl = "https://www.google.com/gmail/about/";
    //Element using xpath and full path
    private By signInButton = By.xpath("/html/body/nav/div/a[2]");
    //Element using relative xpath
    private By emailFeild = By.xpath("//*[@id=\"identifierId\"]");
    //Element using xpath and full path
    private By nextButton = By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content");
    private By passwordField = By.name("password");
    //Element using xpath and full path
    private By wrongPasswordText = By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/content/form/div[1]/div/div[2]/div[2]");

    public String getGmailUrl() { return gmailUrl; }

    public By getSignInButton() {
        return signInButton;
    }

    public By getEmailFeild() {
        return emailFeild;
    }

    public By getNextButton() {
        return nextButton;
    }

    public By getPasswordField() {
        return passwordField;
    }

    public By getWrongPasswordText() { return wrongPasswordText; }


}
