import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
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


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import java.awt.*;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import static com.google.common.base.Predicates.equalTo;

public class ApiTest {

    @Test
    @DisplayName("GET Request")
    public void test() {
        given()
                .baseUri("https://postman-echo.com/")
                .contentType(ContentType.JSON)
                .when()
                .get("get")
                .then()
                .assertThat()
                .statusCode(200)
                .log().all();
    }

    @Test
    @DisplayName("POST Raw Text")
    public void test1() {
        given()
                .baseUri("https://postman-echo.com/")
                .contentType(ContentType.JSON)
                .when().body("{\n" +
                        "    \"test\": \"value\"\n" +
                        "}")
                .post("post")
                .then()
                .log().body()
                .body("data.test", Matchers.equalTo("value"));

    }

    @Test
    @DisplayName("POST Form Data")
            public void test2 () {
        HashMap<String, String> form = new HashMap<>();
        form.put("foo1", "bar1");
        form.put("foo2", "bar2");


                given()
                        .baseUri("https://postman-echo.com")
                        .contentType("application/json")
                        .body(form)
                        .when()
                        .post("/post")
                        .then()
                        .assertThat()
                        .statusCode(200)
                        .log().body()
                        .body("data.foo1", Matchers.equalTo("bar1"))
                        .body("data.foo2", Matchers.equalTo("bar2"));


            }
    @Test
    @DisplayName("PUT Request")
    public void test3() {
        given()
                .baseUri("https://postman-echo.com/")
               .contentType(ContentType.JSON)
               .when()
                .body("This is expected to be sent back as part of response body.")
               .put("put")
                .then().assertThat()
                .statusCode(200)
                .log().body()
                .body("data", Matchers.equalTo("This is expected to be sent back as part of response body."));
    }
    @Test
    @DisplayName("PATCH Request")
    public void test4() {
        given()
                .baseUri("https://postman-echo.com/")
                .contentType(ContentType.JSON)
                .when()
                .body("This is expected to be sent back as part of response body.")
                .patch("patch")
                .then().assertThat()
                .statusCode(200)
                .log().body()
                .body("data", Matchers.equalTo("This is expected to be sent back as part of response body."));
    }
    @Test
    @DisplayName("DELETE Request")
    public void test5() {
        given()
               .baseUri("https://postman-echo.com/")
                .contentType(ContentType.JSON)
               .when()
                .body("This is expected to be sent back as part of response body.")
               .delete("delete")
               .then().assertThat()
               .statusCode(200)
               .log().body()
                .body("data", Matchers.equalTo("This is expected to be sent back as part of response body."));

    }
          }
