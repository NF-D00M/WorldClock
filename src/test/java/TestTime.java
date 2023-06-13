import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class Main {
  public static void main(String[] args) {
    timeQuote();
    restAssured();
  }

  static void timeQuote() {
    System.out.println("Thought is the arrow of time!");
  }

  static void restAssured() {
    given().when().get("https://timeapi.io/api/Time/current/zone?timeZone=Europe/Amsterdam").then().log().all();
  }
}
