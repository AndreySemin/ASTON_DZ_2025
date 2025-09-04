package Lesson_8;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class PostRawTextTest {
    @Test
    public void testPostRawText() {
        RestAssured.baseURI = "https://postman-echo.com";
        String requestBody = "Added text";



            given()

                    .contentType("text/plain")
                .body(requestBody)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("args.isEmpty()", equalTo(true))
                .body("data", equalTo(requestBody))
                .body("files.isEmpty()", equalTo(true))
                .body("form.isEmpty()", equalTo(true))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers['x-request-start']", startsWith("t"))
                .body("headers['content-length']", equalTo(String.valueOf(requestBody.length())))
                .body("headers['x-forwarded-proto']", equalTo("https"))
                .body("headers['x-forwarded-port']", equalTo("443"))
                .body("headers['x-amzn-trace-id']", startsWith("Root"))
                .body("headers['content-type']", containsString("text/plain"))
                .body("headers['user-agent']", notNullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("headers.accept-encoding", matchesPattern("gzip\\s*,\\s*deflate"))
                .body("json", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/post"));
    }

}




