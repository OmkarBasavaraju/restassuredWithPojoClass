package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;

public class base {

	public static Properties prop;
	public static FileInputStream fi;

	public static void setup() throws IOException {
		System.out.println("base");
		prop = new Properties();
		try {
			System.out.println("base2");
			fi = new FileInputStream(
					"C:\\Users\\IGSA937002\\eclipse-workspace\\BDDRestAssured\\src\\test\\resources\\properties\\Config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop.load(fi);
		RestAssured.baseURI = prop.getProperty("BaseUri");
		System.out.println(prop.getProperty("BaseUri"));

	}
}
