package com.trimble.TestPost1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;

import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestPost1 {

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



}
