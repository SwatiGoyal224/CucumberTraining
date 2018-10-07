package com.trimble.Assignment;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Assignment {

    Response resp;

    @When("^user hit the get request$")
    public void user_hit_the_get_request() {

        // Response resp =
        resp = RestAssured.given().relaxedHTTPSValidation().when().get("https://ergast.com/api/f1/2017/circuits.json");

        // print response in string
        String respString = resp.asString();
        System.out.println(respString);

        // get all headers
        Headers heds = resp.getHeaders();
        System.out.println(heds);

    }


    @Then("^user checks at path \"([^\"]*)\" with the \"([^\"]*)\" value$")
    public void user_checks_at_path_with_the_value(String path, String expValue) {
        String actualCircuitValue = resp.getBody().jsonPath().getString(path);
        Assert.assertEquals(expValue, actualCircuitValue);
        System.out.println("actualCircuitValue  " + actualCircuitValue);
    }



}
