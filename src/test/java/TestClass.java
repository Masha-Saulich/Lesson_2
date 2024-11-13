import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import static com.google.common.base.Predicates.equalTo;
import static io.restassured.RestAssured.*;

public class TestClass {

    @Test
    @DisplayName("GET Request")
    public void test() {
        given()
                .baseUri("https://postman-echo.com/")
                .when()
                .get("get")
                .then()
                .assertThat()
                .log().all();
    }

    @Test
    @DisplayName("POST Raw Text")
    public void test1() {
        given()
                .baseUri("https://postman-echo.com/")
                .contentType(ContentType.TEXT)
                .when().body("{\n" +
                        "    \"test\": \"value\"\n" +
                        "}")
                .post("post")
                .then().log().body();

    }

    @Test
    @DisplayName("POST Form Data")
    public void test2() {
        HashMap <String, String> form = new HashMap<>();
        form.put("foo1", "bar1");
        form.put("foo2", "bar2");

        given()
                .baseUri("https://postman-echo.com/post")
                .contentType("application/x-www-form-urlencoded")
                .formParams(form)
                .when()
                .post()
                .then().assertThat()
                .statusCode(200)
                .log().body()
                .body("form.foo1", Matchers.equalTo("bar1"))
                .body("form.foo2", Matchers.equalTo("bar2"));

}
    }