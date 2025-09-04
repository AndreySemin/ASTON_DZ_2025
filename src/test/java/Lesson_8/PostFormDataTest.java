package Lesson_8;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class PostFormDataTest {

    @Test

    public void testPostFromDate(){
        RestAssured.baseURI = "https://postman-echo.com";

        String foo1 = "bar1";
        String foo2 = "bar2";

        given()
                .contentType(ContentType.URLENC.withCharset("UTF-8"))
                .formParam("foo1",foo1)
                .formParam("foo2",foo2)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("args.isEmpty()", equalTo(true))
                .body("data.isEmpty()", equalTo(true))
                .body("files.isEmpty()", equalTo(true))
                .body("form.foo1", equalTo(foo1))
                .body("form.foo2", equalTo(foo2))
                .body("headers.host",equalTo("postman-echo.com"))
                .body("headers['x-request-start']",startsWith("t"))
                .body("headers['connection']",equalTo("close"))
                .body("headers['content-length']",equalTo("19"))
                .body("headers['x-forwarded-proto']", equalTo("https"))
                .body("headers['x-forwarded-port']",equalTo("443"))
                .body("headers['x-amzn-trace-id']",startsWith("Root"))
                .body("headers['content-type']",equalTo("application/x-www-form-urlencoded; charset=UTF-8"))
                .body("headers['user-agent']",notNullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("headers['cache-control']", equalTo(null))
                .body("headers.accept-encoding", matchesPattern("gzip\\s*,\\s*deflate"))
                .body("json.foo1", equalTo("bar1"))
                .body("json.foo2",equalTo("bar2"))
                .body("url", equalTo("https://postman-echo.com/post"));





    }
}
