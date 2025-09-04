import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class GetRequestTest {
    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = "https://postman-echo.com";
    }


    @Test
    public void GetRequestTest() {
        given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", startsWith("Root="))
                .body("headers.accept", equalTo("*/*"))
                .body("headers['user-agent']", notNullValue())
                .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));


    }
}








