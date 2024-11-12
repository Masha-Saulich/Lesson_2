import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static java.awt.SystemColor.text;


public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void acceptCookie() {
        WebElement cookieButton = driver.findElement(By.id("cookie-agree"));
        cookieButton.click();
    }

    public String getBlockTitle() {
        return driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2")).getText();
    }

    public String getLogoText(String altText) {
        WebElement logo = driver.findElement(By.xpath("//img[@alt='" + altText + "']"));
        return logo.getAttribute("alt");
    }

    public void clickLink() {
        WebElement link = driver.findElement(By.xpath("//a[@href='/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/']"));
        link.click();
    }

    public void fillForm(String phone, String sum, String email) {
        driver.findElement(By.id("connection-phone")).sendKeys(phone);
        driver.findElement(By.id("connection-sum")).sendKeys(sum);
        driver.findElement(By.id("connection-email")).sendKeys(email);
    }

    public void submitForm() {
        WebElement submit = driver.findElement(By.xpath("//button[contains(@class, 'button') and contains(@class, 'button__default')]"));
        submit.click();
    }

    public String getPlaceholderByID(String elementID) {
        WebElement input = driver.findElement(By.id(elementID));
        return input.getAttribute("placeholder");
    }

    public void selectOptionFromDropdown(String selectClass, String optionText) {
        WebElement input = driver.findElement(By.className(selectClass));
        input.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement option = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//p[@class='select__option' and text()='" + optionText + "']")));
        option.click();

    }

    public void switchToIframe() {
        WebElement iframe = driver.findElement(By.className("bepaid-iframe"));
        driver.switchTo().frame(iframe);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("app-wrapper__content")));
    }

    public static String cleanText(WebElement element, String... toRemove) {
        String text = element.getText();
        for (String removeText : toRemove) {
            text = text.replace(removeText, "");
        }
        return text.trim();
    }

    public void getLabelName(String labelText) {
        switchToIframe();
        WebElement label = driver.findElement(By.xpath("//label[text()='" + labelText + "']"));
        String actualText = label.getText().trim();
        Assertions.assertEquals(actualText, labelText);
    }
    public void getLogoCard (String logoName) {
        switchToIframe();
        List<WebElement> logoList = driver.findElements(By.xpath("//img[contains(@src, '" + logoName + "')]"));
        // Проверка, что список логотип не пуст
        Assertions.assertFalse(logoList.isEmpty(), "Логотип " + logoName + " не найден на странице!");
    }
    public void checkPaymentSum(String elementLocator, String...toRemove) {
        switchToIframe();
        WebElement sum = driver.findElement(By.xpath(elementLocator));
        String actualText = HomePage.cleanText(sum, toRemove);
        double actualSum = Double.parseDouble(actualText);
        double expectedSum = 13.00;
        Assertions.assertEquals(actualSum, expectedSum, "Ожидаемая сумма платежа не совпадает с реальной!");
    }
    public void checkPhone(String elementLocator, String...toRemove) {
        switchToIframe();
        WebElement phone = driver.findElement(By.xpath(elementLocator));
        String actualText = HomePage.cleanText(phone, toRemove);
        String expectedText = "375297777777";
        Assertions.assertEquals(actualText, expectedText, "Ожидаемый номер телефона не совпадает с реальным!");
    }
}