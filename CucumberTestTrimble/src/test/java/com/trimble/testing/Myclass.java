package com.trimble.testing;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Myclass {

    Response resp;

    @Given("launching Google")
    public void launching_Google() {
        // TODO Auto-generated method stub
        System.out.println("Helloworld");
        resp = RestAssured.given().when().get("https://www.google.com/");


    }

    /*
     * @Given("^user start the rest asured test$") public void user_start_the_rest_asured_test() { //
     * Write code here that turns the phrase above into concrete actions
     * System.out.println("Starting og the GET req"); }
     */

    @Given("user checks (\\d+) the status code")
    public void user_checks_the_status_code(int expectedSc) {
        int i = resp.statusCode();
        Assert.assertTrue(expectedSc == i);
        System.out.println("Code = " + i);
    }



}
