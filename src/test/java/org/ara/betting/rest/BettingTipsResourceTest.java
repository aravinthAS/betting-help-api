package org.ara.betting.rest;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class BettingTipsResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/betting")
          .then()
             .statusCode(200)
             .body(is("Welcome to betting help"));
    }

}