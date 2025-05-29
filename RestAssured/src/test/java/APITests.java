import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class APITests {

    @Test
    public void test1(){

        Response response = get("https://reqres.in/api/users?page=2");

        System.out.println("Response :" +response.asString());
        System.out.println("Status code :" +response.getStatusCode());
        System.out.println("Body :" +response.getBody().asString());
        System.out.println("Time taken :" +response.getTime());

        //Assertion
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void test2(){
        given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
    }

    @Test
    public void updateData(){

        HashMap data = new HashMap<>();

        data.put("name", "Malebo");
        data.put("job", "Automation Engineer");

        given().
                contentType("application/json").
                body(data).
        when().
                put("https://reqres.in/api/users/2").
        then().
                statusCode(200).
                log().body().               // logging the body to return the body
                extract().response();       //return the response
    }


    @Test
    public void addData(){

        HashMap data = new HashMap<>();

        data.put("name", "Malebo");
        data.put("job", "Automation Engineer");

        given().
                contentType("application/json").
                body(data).
                when().
                post("https://reqres.in/api/users").
                then().
                statusCode(201).
                log().body().               // logging the body to return the body
                extract().response();       //return the response
    }


    @Test
    public void deleteData(){

        Response res =
        given().
        when().
                delete("https://reqres.in/api/users/2").
        then().statusCode(204).
                log().body().
                extract().response();

        String jsonString = res.asString();
        Assert.assertEquals(jsonString.contains("204"), false);

    }
    



}

