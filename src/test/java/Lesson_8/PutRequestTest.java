package Lesson_8;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PutRequestTest {
    @Test

    public void testPutRequest(){
        RestAssured.baseURI = "https://postman-echo.com";
        String requestbody = "Added text";

        given()
                .contentType("text/plan")
                .body(requestbody)
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .body("args.isEmpty()", equalTo(true))
                .body("data",equalTo(requestbody))
                .body("files.isEmpty()",equalTo(true))
                .body("form.isEmpty()",equalTo(true))
                .body("headers['host']",equalTo("postman-echo.com"))
                .body("headers['x-request-start']",startsWith("t"))
                .body("headers['connection']",equalTo("close"))
                .body("headers['content-lenqth']",equalTo(String.valueOf(requestbody.length())))
                .body("headers['x-forwarded-proto']",equalTo("https"))
                .body("headers['x-forwarded-port']",equalTo("443"))
                .body("headers['x-amzn-trace-id']", startsWith("Root"))
                .body("headers['content-type']",containsString("text/plan"))
                .body("headers['user-agent']",notNullValue())
                .body("headers['accept']",equalTo("*/*"))
                .body("headers['cache-control']",equalTo(null))
                .body("headers['postman-token']",equalTo(null))
                .body("headers['accept-encoding']",containsString("gzip,deflate"))
                .body("headers['cookie']",equalTo(null))
                .body("json",equalTo(null))
                .body("url",equalTo("https://postman-echo.com/put"));





    }

}
