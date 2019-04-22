package ApiTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hamcrest.Matcher;
import org.junit.Test;



import static io.restassured.RestAssured.*;
import static io.restassured.path.json.JsonPath.from;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

public class RegisterSuccessful {
    private String email;
    private String password;
    private Matcher<?> token;
    private byte[] request;

    @Test
    public void RegisterSuccessful(){


        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "https://reqres.in/";

        String response = given().log().all().contentType("application/json").body("{" +
                "    \"email\": \"sydney@fife\"," +
                "    \"password\": \"pistol\"" +
                "}").post("/api/register").then().assertThat().statusCode(201).log().ifError().extract().asString();
        System.out.println(response);





    }

    }


