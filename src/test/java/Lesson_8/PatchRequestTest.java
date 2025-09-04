package Lesson_8;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PatchRequestTest {
    @Test

    public void testPatchRequest(){
        RestAssured.baseURI = "https://postman-echo.com";
        String requestBody = "Added text";

        given()
                .contentType("text/plan")
                .body(requestBody)
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .body("args.isEmpty()",equalTo(true))
                .body("data", equalTo(requestBody))
                .body("files.isEmpty()",equalTo(true))
                .body("form.isEmpty()",equalTo(true))
                .body("headers['host']",equalTo("postman-echo.com"))
                .body("headers['x-request-start']",startsWith("t"))
                .body("headers['connection']",equalTo("close"))
                .body("headers['content-length']",equalTo(String.valueOf(requestBody.length())))
                .body("headers['x-forwarded-proto']",equalTo("https"))
                .body("headers['x-forwarded-port']",equalTo("443"))
                .body("headers['x-amzn-trace-id']",startsWith("Root"))
                .body("headers['content-type']",containsString("text/plan"))
                .body("headers['user-agent']", notNullValue())
                .body("headers['accept']",equalTo("*/*"))
                .body("headers['cache-control']",equalTo(null))
                .body("headers['postman-token']",equalTo(null))
                .body("headers['accept-encoding']",containsString("gzip,deflate"))
                .body("headers['cookie']",equalTo(null))
                .body("json",equalTo(null))
                .body("url",equalTo("https://postman-echo.com/patch"));
    }
}
