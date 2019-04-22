package ApiTest;

import io.restassured.RestAssured;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import static io.restassured.RestAssured.*;


public class LoginSuccessful {
    @Test
    public void loginSuccessful(){



        // Specify the base URL to the RESTful web service

        RestAssured.baseURI = "https://reqres.in/";

        String response = given().log().all().contentType("application/json").body("{" +
                "    \"email\": \"peter@klaven\",\n" +
                "    \"password\": \"cityslicka\"" +
                "}").post("/api/login").then().assertThat().statusCode(200).log().ifError().extract().asString();
        System.out.println(response);








    }
}
