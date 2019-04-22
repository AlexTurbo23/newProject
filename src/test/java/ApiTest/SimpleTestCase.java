package ApiTest;

import io.restassured.RestAssured;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import java.util.List;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.get;
import static io.restassured.path.json.JsonPath.from;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.hasItems;


public class SimpleTestCase {

    @Test
    public void InfoResponce() {


        // Specify the base URL to the RESTful web service

        RestAssured.baseURI = "https://reqres.in/";

        // Example with JsonPath
        String json = get("api/users?page=2").asString();
        List<String> listUsersId = from(json).get("data.id");
        System.out.println(listUsersId);


        List<String> listUsersFirstName = from(json).get("data.first_name");
        System.out.println(listUsersFirstName);


        List<String> listUsersLastName = from(json).get("data.last_name");
        System.out.println(listUsersLastName);


        System.out.println(json);

        expect().body("page", equalTo(2)).when().get("/api/users?page=2");
        expect().body("per_page", equalTo(3)).when().get("/api/users?page=2");
        expect().body("total", equalTo(12)).when().get("/api/users?page=2");
        expect().body("total_pages", equalTo(4)).when().get("/api/users?page=2");
        expect().body("data.id", hasItems(4, 5, 6)).when().get("/api/users?page=2");
        expect().body("data.first_name", hasItems("Eve","Charles" ,"Tracey")).when().get("/api/users?page=2");
        expect().body("data.last_name", hasItems("Holt","Morris" ,"Ramos")).when().get("/api/users?page=2");
        get("/api/users?page=2").then().assertThat().statusCode(200);

        {


        }
    }

}