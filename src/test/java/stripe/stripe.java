package stripe;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;

import org.apache.http.entity.ContentType;

import io.restassured.response.Response;

public class stripe {
	
	public static void main(String[] args) {
//		Response resp = given().param("limit", 3).auth().basic("sk_test_51JH14vBJA2yq5wF5tQHAmsDf49eJoNikFxt6mQgAGn2g1rG8eTlsIrfxBytLmU0Oe9UfFXRxGFpV3HzylmT7IMo400ssKLZZqU", "").get("https://api.stripe.com/v1/customers");
//		resp.prettyPrint();
//		String r = resp.toString();
//		System.out.println(r);
//		System.out.println(resp.statusCode());
//		
//		Response re = given().auth().basic("sk_test_51JH14vBJA2yq5wF5tQHAmsDf49eJoNikFxt6mQgAGn2g1rG8eTlsIrfxBytLmU0Oe9UfFXRxGFpV3HzylmT7IMo400ssKLZZqU", "").formParam("name", "testbro").formParam("email", "tesfdtc@tets.com").post("https://api.stripe.com/v1/customers");
//		re.prettyPrint();
//		System.out.println(re.statusCode());
		
//		HashMap<String,String> map = new HashMap<String,String>();
//		map.put("email", "eve.holt@reqres.in");
//		map.put("password", "pistol");
		Response re = given().contentType(io.restassured.http.ContentType.JSON).body(new File("./data.json")).post("https://reqres.in/api/register");
		re.prettyPrint();
		System.out.println(re.statusCode());
	}
}
