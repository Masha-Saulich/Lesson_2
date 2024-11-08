import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestClass {
    private WebDriver driver;
    private HomePage HomePage;

    @BeforeEach
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\.cache\\selenium\\chromedriver\\win64\\130.0.6723.116\\chromedriver.exe");
        driver = new ChromeDriver();
        HomePage  = new HomePage(driver);
        driver.get("https://www.mts.by/");
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement input = driver.findElement(By.id("cookie-agree"));
        input.click();

    }

    @Test
    @DisplayName("Проверка названия блока")
    public void getBlockTitle() {
        String actualTitle = HomePage.getBlockTitle();
        Assertions.assertEquals("Онлайн пополнение\nбез комиссии", actualTitle);

    }

    @Test
    @DisplayName("Проверка логотипа Visa")
    public void test() {
            String actualText = HomePage.getLogoText("Visa");
            Assertions.assertEquals("Visa", actualText);
    }

    @Test
    @DisplayName("Проверка логотипа Verified By Visa")
    public void test2 () {
        String actualText = HomePage.getLogoText("Verified By Visa");
        Assertions.assertEquals("Verified By Visa", actualText);
                }
    @Test
    @DisplayName("Проверка логотипа MasterCard")
    public void test3 () {
        String actualText = HomePage.getLogoText("MasterCard");
        Assertions.assertEquals("MasterCard", actualText);
    }

    @Test
    @DisplayName("Проверка логотипа MasterCard Secure Code")
    public void test4 () {
        String actualText = HomePage.getLogoText("MasterCard Secure Code");
        Assertions.assertEquals("MasterCard Secure Code", actualText);
    }

    @Test
    @DisplayName("Проверка логотипа Белкарт")
    public void test5 () {
        String actualText = HomePage.getLogoText("Белкарт");
        Assertions.assertEquals("Белкарт", actualText);
    }

    @Test
    @DisplayName("проверка ссылки Подробнее о сервисе")
    public void test6 () {
        HomePage.clickLink();

    }
    @Test
    @DisplayName("Заполнение полей")
    public void test7 () {
        HomePage.fillForm("297777777", "13", "test@example.com");
        HomePage.submitForm();

    }
        @AfterEach
        public void closeDriver () {
            driver.quit();
        }
    }