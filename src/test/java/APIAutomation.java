import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class APIAutomation {
    //public static void main(String[] args) {

    @Test
    public void APITestng() {
        Response resp= RestAssured.get("https://reqres.in/");
        int code=resp.statusCode();

        Assert.assertEquals(204,code);
    }
}


