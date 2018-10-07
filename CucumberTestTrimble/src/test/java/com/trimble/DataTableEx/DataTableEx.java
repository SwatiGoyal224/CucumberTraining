package com.trimble.DataTableEx;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.json.JSONObject;
import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DataTableEx {

    Response resp;

    @Given("^user hit the post request with \"([^\"]*)\" name$")
    public void user_hit_the_post_request_with_json_data(String username) throws IOException {

        // Read data from file
        String data = "";
        data = new String(
                Files.readAllBytes(
                        Paths.get("D:\\git\\qa-automation\\CucumberTestTrimble\\src\\test\\resources\\com\\trimble\\PostFiles\\Postjson.json")));
        System.out.println("json in String ==== " + data);

        // Update the data
        JSONObject object = new JSONObject(data);
        object.put("name", "Anil");
        String newJsonStr = object.toString();
        System.out.println("json in String ==== " + newJsonStr);

        // Do POST request
        resp = RestAssured.given().accept(ContentType.JSON).relaxedHTTPSValidation().when().body(newJsonStr).post("https://reqres.in/api/users");



    }

    @Then("^user validate followind data$")
    public void user_validate_followind_data(DataTable table) {



        List<List<String>> data = table.raw();
        System.out.println("List is :" + data);
        // int i = data.size();
        // int j = data.get(0).size();

        // row 1

        String values1 = data.get(0).get(0);
        String values2 = data.get(0).get(1);

        // row 2 String values3 = data.get(1).get(0); String values4 = data.get(1).get(1);

        String values5 = data.get(2).get(0);
        String values6 = data.get(2).get(1);



        int statusCode = resp.getStatusCode();
        System.out.println("Status code " + statusCode);
        int expStatusCode = Integer.parseInt(values6);

        Assert.assertTrue(expStatusCode == statusCode);

        // check id is greater than zero
        String idValue = resp.getBody().jsonPath().get("id");
        int idInt = Integer.parseInt(idValue);
        Assert.assertTrue(idInt > 0);

    }

}
