package com.nakonechna;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import utils.Constants;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class Api {
    public static String url = Constants.baseURI;

    public static void main(String[] args) {
        getResponseLog(url);
    }

    public static void getResponseLog(String url) {
        given().when().get(url).then().log().all();
    }

    public static int getResponseCode(String url) {
        return given().when().get(url).getStatusCode();
    }

    public static void assureThatResponseCodeIs200(String url) {
        given().when().get(url).then().assertThat().statusCode(Constants.RESPONSE_STATUS_CODE_201);
    }

    public static String getResponseValue(String JsonKey, String url) {
        ArrayList<String> results = given().when().get(url).then().extract()
                .path(JsonKey);
        for (String s : results) {
            if (!results.contains(null) && !s.equalsIgnoreCase(" ")) {
                return s;
            }
        }
        return ("No results");
    }

    public static void sendDeleteRequest(String url, String id) {
        RequestSpecification request = RestAssured.given();
        request.put(url + id).then().assertThat().statusCode(Constants.RESPONSE_STATUS_CODE_200);
    }
}
