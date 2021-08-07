package org.ara.betting.rest;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.MediaType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class BettingTipsResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .when()
                .get("/betting/random-numbers/1/34/7")
                .then()
                .statusCode(200);
    }

}