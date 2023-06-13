import static io.restassured.RestAssured.get;

public class TimeAPI {
  static void cityTime(String city) {
    get("https://timeapi.io/api/Time/current/zone?timeZone=Europe/" + city).then().log().all();
  }
}
