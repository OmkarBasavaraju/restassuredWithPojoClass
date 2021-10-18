package API;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Date;

import org.json.JSONObject;
import org.junit.Assert;

import Base.base;
import PojoJSONObject.Root;
import PojoJSONObject.purchase_units;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateUserApi extends base {

	public static String accessToken;
	public static Response resp;

	public void getAccessToken() {
		Date d = new Date();
		System.out.println(d);
		System.out.println(prop.getProperty("anbc"));
		System.out.println(prop.getProperty("UserName"));
		System.out.println(prop.getProperty("Password"));
		
		Response resp = given().param("grant_type", "client_credentials").auth().preemptive()
				.basic(prop.getProperty("UserName"), prop.getProperty("Password")).post("/v1/oauth2/token");
		resp.prettyPrint();
		JSONObject jon = new JSONObject(resp.asString());
		accessToken = jon.get("access_token").toString();
		System.out.println(accessToken);
	}

	public void createUser() {
		System.out.println(accessToken);
		ArrayList<purchase_units> al = new ArrayList<purchase_units>();
		al.add(new purchase_units("USD", "100.00"));
		Root root = new Root("CAPTURE", al);
		resp = given().contentType(ContentType.JSON).header("Authorization", "Bearer " + accessToken).body(root)
				.post("/v2/checkout/orders");
		resp.prettyPrint();
	}
	
	public void VerificationOfCreateUser() {
		JSONObject json = new JSONObject(resp.asString());
		Assert.assertEquals(json.get("status").toString(), "CREATED");
		Assert.assertTrue(true);
	}
	
}
