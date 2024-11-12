import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class TestClass {
    private WebDriver driver;
    private HomePage HomePage;
    private WebDriverWait wait;

    @BeforeEach
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\.cache\\selenium\\chromedriver\\win64\\130.0.6723.116\\chromedriver.exe");
        driver = new ChromeDriver();
        HomePage = new HomePage(driver);
        driver.get("https://www.mts.by/");
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        HomePage.acceptCookie();

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
    public void test2() {
        String actualText = HomePage.getLogoText("Verified By Visa");
        Assertions.assertEquals("Verified By Visa", actualText);
    }

    @Test
    @DisplayName("Проверка логотипа MasterCard")
    public void test3() {
        String actualText = HomePage.getLogoText("MasterCard");
        Assertions.assertEquals("MasterCard", actualText);
    }

    @Test
    @DisplayName("Проверка логотипа MasterCard Secure Code")
    public void test4() {
        String actualText = HomePage.getLogoText("MasterCard Secure Code");
        Assertions.assertEquals("MasterCard Secure Code", actualText);
    }

    @Test
    @DisplayName("Проверка логотипа Белкарт")
    public void test5() {
        String actualText = HomePage.getLogoText("Белкарт");
        Assertions.assertEquals("Белкарт", actualText);
    }

    @Test
    @DisplayName("проверка ссылки Подробнее о сервисе")
    public void test6() {
        HomePage.clickLink();

    }

    @Test
    @DisplayName("Заполнение полей")
    public void test7() {
        HomePage.fillForm("297777777", "13", "test@example.com");
        HomePage.submitForm();

    }

    @Test
    @DisplayName("Услуги связи: проверка плейсхолдера поля Номер телефона")
    public void test8() {
        String actualText = HomePage.getPlaceholderByID("connection-phone");
        String expectedText = "Номер телефона";
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    @DisplayName("Услуги связи: проверка плейсхолдера поля Сумма")
    public void test9() {
        String actualText = HomePage.getPlaceholderByID("connection-sum");
        String expectedText = "Сумма";
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    @DisplayName("Услуги связи: проверка плейсхолдера поля email")
    public void test10() {
        String actualText = HomePage.getPlaceholderByID("connection-email");
        String expectedText = "E-mail для отправки чека";
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    @DisplayName("Выбрать опцию: Домашний интерет")
    public void test11() {
        HomePage.selectOptionFromDropdown("select__wrapper", "Домашний интернет");

    }

    @Test
    @DisplayName("Домашний интернет: проверка плейсхолдера поля Номер абонента")
    public void test12() {
        HomePage.selectOptionFromDropdown("select__wrapper", "Домашний интернет");
        String actualText = HomePage.getPlaceholderByID("internet-phone");
        String expectedText = "Номер абонента";
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    @DisplayName("Домашний интернет: проверка плейсхолдера поля Сумма")
    public void test13() {
        HomePage.selectOptionFromDropdown("select__wrapper", "Домашний интернет");
        String actualText = HomePage.getPlaceholderByID("internet-sum");
        String expectedText = "Сумма";
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    @DisplayName("Домашний интернет: проверка плейсхолдера поля email")
    public void test14() {
        HomePage.selectOptionFromDropdown("select__wrapper", "Домашний интернет");
        String actualText = HomePage.getPlaceholderByID("internet-email");
        String expectedText = "E-mail для отправки чека";
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    @DisplayName("Выбрать опцию: Рассрочка")
    public void test15() {
        HomePage.selectOptionFromDropdown("select__wrapper", "Рассрочка");

    }

    @Test
    @DisplayName("Рассрочка: проверка плейсхолдера поля Номер счета на 44")
    public void test16() {
        HomePage.selectOptionFromDropdown("select__wrapper", "Рассрочка");
        String actualText = HomePage.getPlaceholderByID("score-instalment");
        String expectedText = "Номер счета на 44";
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    @DisplayName("Рассрочка: проверка плейсхолдера поля Сумма")
    public void test17() {
        HomePage.selectOptionFromDropdown("select__wrapper", "Рассрочка");
        String actualText = HomePage.getPlaceholderByID("instalment-sum");
        String expectedText = "Сумма";
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    @DisplayName("Рассрочка: проверка плейсхолдера поля E-mail для отправки чека")
    public void test18() {
        HomePage.selectOptionFromDropdown("select__wrapper", "Рассрочка");
        ;
        String actualText = HomePage.getPlaceholderByID("instalment-email");
        String expectedText = "E-mail для отправки чека";
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    @DisplayName("Выбрать опцию: Задолженность")
    public void test19() {
        HomePage.selectOptionFromDropdown("select__wrapper", "Задолженность");

    }

    @Test
    @DisplayName("Задолженность: проверка плейсхолдера поля Номер счета на 2073")
    public void test20() {
        HomePage.selectOptionFromDropdown("select__wrapper", "Задолженность");
        String actualText = HomePage.getPlaceholderByID("score-arrears");
        String expectedText = "Номер счета на 2073";
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    @DisplayName("Задолженность: проверка плейсхолдера поля Сумма")
    public void test21() {
        HomePage.selectOptionFromDropdown("select__wrapper", "Задолженность");
        String actualText = HomePage.getPlaceholderByID("arrears-sum");
        String expectedText = "Сумма";
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    @DisplayName("Задолженность: проверка плейсхолдера поля E-mail для отправки чека")
    public void test22() {
        HomePage.selectOptionFromDropdown("select__wrapper", "Задолженность");
        String actualText = HomePage.getPlaceholderByID("arrears-email");
        String expectedText = "E-mail для отправки чека";
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    @DisplayName("Проверка корректности отображения суммы")
    public void test23() {
        HomePage.fillForm("297777777", "13", "test@example.com");
        HomePage.submitForm();
        HomePage.checkPaymentSum("//div[@class='pay-description__cost']", "BYN");
    }
    @Test
    @DisplayName("Проверка суммы на кнопке")
    public void test24() {
        HomePage.fillForm("297777777", "13", "test@example.com");
        HomePage.submitForm();
        HomePage.checkPaymentSum("//button[@type='submit']","Оплатить", "BYN");
    }
    @Test
    @DisplayName("Проверка отображения номера телефона")
    public void test25() {
        HomePage.fillForm("297777777", "13", "test@example.com");
        HomePage.submitForm();
        HomePage.checkPhone("//div[@class='pay-description__text']", "Оплата: Услуги связи Номер:");

    }
    @Test
    @DisplayName("Проверка наличия надписи Номер карты")
    public void test26(){
        HomePage.fillForm("297777777", "13", "test@example.com");
        HomePage.submitForm();
        HomePage.getLabelName("Номер карты");

    }
    @Test
    @DisplayName("Проверка наличия надписи Срок действия")
    public void test27(){
        HomePage.fillForm("297777777", "13", "test@example.com");
        HomePage.submitForm();
        HomePage.getLabelName("Срок действия");
    }
    @Test
    @DisplayName("Проверка наличия надписи CVC")
    public void test28(){
        HomePage.fillForm("297777777", "13", "test@example.com");
        HomePage.submitForm();
        HomePage.getLabelName("CVC");
    }
    @Test
    @DisplayName("Проверка наличия надписи Имя держателя(как на карте)")
    public void test29(){
        HomePage.fillForm("297777777", "13", "test@example.com");
        HomePage.submitForm();
        HomePage.getLabelName("Имя держателя (как на карте)");
    }
    @Test
    @DisplayName("Проверка наличия логотипа Visa")
    public void test30(){
        HomePage.fillForm("297777777", "13", "test@example.com");
        HomePage.submitForm();
        HomePage.getLogoCard("visa-system.svg");

    }
    @Test
    @DisplayName("Проверка наличия логотипа MasterCard")
    public void test31(){
        HomePage.fillForm("297777777", "13", "test@example.com");
        HomePage.submitForm();
        HomePage.getLogoCard("mastercard-system.svg");
    }
    @Test
    @DisplayName("Проверка наличия логотипа Белкарт")
    public void test32(){
        HomePage.fillForm("297777777", "13", "test@example.com");
        HomePage.submitForm();
        HomePage.getLogoCard("belkart-system.svg");
    }
    @Test
    @DisplayName("Проверка наличия логотипа Maestro")
    public void test33(){
        HomePage.fillForm("297777777", "13", "test@example.com");
        HomePage.submitForm();
        HomePage.getLogoCard("maestro-system.svg");
    }
    @Test
    @DisplayName("Проверка наличия логотипа Мир")
    public void test34(){
        HomePage.fillForm("297777777", "13", "test@example.com");
        HomePage.submitForm();
        HomePage.getLogoCard("mir-system-ru.svg");
    }

    @AfterEach
    public void closeDriver() {
        driver.quit();
    }
}