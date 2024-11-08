import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptCookie() {
        WebElement cookieButton = driver.findElement(By.id("cookie-accept"));
        cookieButton.click();
    }

    public String getBlockTitle() {
        return driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2")).getText();
    }

    public String getLogoText(String
                                      logoText) {
        WebElement logo = driver.findElement(By.xpath("//img[@alt" + logoText + "]"));
        return logo.getAttribute("alt");
    }

    public void clickLink() {
        WebElement link = driver.findElement(By.xpath("//a[@href='/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/']"));
        link.click();
    }

    public void fillForm(String phone, String sum, String email) {
        driver.findElement(By.id("connection-phone"));
        driver.findElement(By.id("connection-sum"));
        driver.findElement(By.id("connection-email"));
    }

    public void submitForm() {
        WebElement submit = driver.findElement(By.xpath("//button[contains(@class, 'button') and contains(@class, 'button__default')]"));
        submit.click();
    }
}


