package API;

import io.restassured.RestAssured;

public class WeatherAPIChecks {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://www.weatherbit.io/api/weather-forecast-16-day";
		given().queryParam("key","").header("content-type", "application/json").body().
		then(.assertThat().statusCode(200).body().header().extract().response.asString();
		

	}

}
