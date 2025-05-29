import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APITest2 {

    @Test
    public void GetRequest(){

        baseURI = "https://reqres.in/api";

        given().
                get("/users?page=2").
        then().
                statusCode(200).
                body("data[4].first_name", equalTo("George"));
                //body("data.first_name", hasItem("George"), "Rachel");
    }


    @Test
    public void test3(){
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("name","Malebo");
        map.put("job","Automation Engineer");

        System.out.println(map);

    }
}
