import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestClass {
    WebDriver driver = new ChromeDriver();


    @BeforeEach
    public void initDriver() {
        driver.get("https://www.mts.by/");
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement input = driver.findElement(By.id("cookie-agree"));
        input.click();

    }

    @Test
    @DisplayName("Проверка названия блока")
    public void test() {
        WebElement input = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2"));
        Assertions.assertEquals(input.getText(), "Онлайн пополнение\nбез комиссии");

    }

    @Test
    @DisplayName("Проверка логотипа Visa")
    public void test1() {
        WebElement input = driver.findElement(By.xpath("//img[@alt='Visa']"));
        String actualText = input.getAttribute("alt");
        String expectedText = "Visa";
        Assertions.assertEquals(actualText, expectedText);
    }

    @Test
    @DisplayName("Проверка логотипа Verified By Visa")
    public void test2 () {
            WebElement input = driver.findElement(By.xpath("//img[@alt='Verified By Visa']"));
            String actualText = input.getAttribute("alt");
            String expectedText = "Verified By Visa";
            Assertions.assertEquals(actualText, expectedText);
        }
    @Test
    @DisplayName("Проверка логотипа MasterCard")
    public void test3 () {
        WebElement input = driver.findElement(By.xpath("//img[@alt='MasterCard']"));
        String actualText = input.getAttribute("alt");
        String expectedText = "MasterCard";
        Assertions.assertEquals(actualText, expectedText);
    }

    @Test
    @DisplayName("Проверка логотипа MasterCard Secure Code")
    public void test4 () {
        WebElement input = driver.findElement(By.xpath("//img[@alt='MasterCard Secure Code']"));
        String actualText = input.getAttribute("alt");
        String expectedText = "MasterCard Secure Code";
        Assertions.assertEquals(actualText, expectedText);

    }

    @Test
    @DisplayName("Проверка логотипа Белкарт")
    public void test5 () {
        WebElement input = driver.findElement(By.xpath("//img[@alt='Белкарт']"));
        String actualText = input.getAttribute("alt");
        String expectedText = "Белкарт";
        Assertions.assertEquals(actualText, expectedText);
    }

    @Test
    @DisplayName("проверка ссылки Подробнее о сервисе")
    public void test6 () {
        WebElement input = driver.findElement(By.xpath("//a[@href='/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/']"));
        input.click();

    }
    @Test
    @DisplayName("Заполнение полей")
    public void test7 () {
        WebElement phone = driver.findElement(By.id("connection-phone"));
        phone.sendKeys("297777777");
        WebElement sum = driver.findElement(By.id("connection-sum"));
        sum.sendKeys("13");
        WebElement email = driver.findElement(By.id("connection-email"));
        email.sendKeys("test@example.com");
        WebElement submit = driver.findElement(By.xpath("//button[contains(@class, 'button') and contains(@class, 'button__default')]"));
        submit.click();

    }
        @AfterEach
        public void closeDriver () {
            driver.quit();
        }
    }