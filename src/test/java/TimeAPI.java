import static io.restassured.RestAssured.get;

public class RestAssured {
  static void cityTime() {
    String city = "Amsterdam";
    get("https://timeapi.io/api/Time/current/zone?timeZone=Europe/" + city).then().log().all();
  }
}
