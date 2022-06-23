
import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class Parabank extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("http://automationpractice.com")
      .inferHtmlResources(AllowList(), DenyList())
      .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
      .acceptEncodingHeader("gzip, deflate")
      .acceptLanguageHeader("en-GB,en-US;q=0.9,en;q=0.8")
      .userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36");
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("Cache-Control", "max-age=0");
    headers_0.put("Proxy-Connection", "keep-alive");
    headers_0.put("Upgrade-Insecure-Requests", "1");
    
    Map<CharSequence, String> headers_1 = new HashMap<>();
    headers_1.put("Accept", "application/json, text/javascript, */*; q=0.01");
    headers_1.put("Proxy-Connection", "keep-alive");
    headers_1.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_2 = new HashMap<>();
    headers_2.put("Proxy-Connection", "keep-alive");
    headers_2.put("Upgrade-Insecure-Requests", "1");
    
    Map<CharSequence, String> headers_3 = new HashMap<>();
    headers_3.put("Accept", "application/json, text/javascript, */*; q=0.01");
    headers_3.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    headers_3.put("Origin", "http://automationpractice.com");
    headers_3.put("Proxy-Connection", "keep-alive");
    headers_3.put("X-Requested-With", "XMLHttpRequest");


    ScenarioBuilder scn = scenario("Parabank")
      .exec(
        http("App_URL_REQUEST")
          .get("/index.php")
          .headers(headers_0)
      )
      .pause(3)
      .exec(
        http("SEARCHING_DRESS_ON_SEARCH_BUTTON")
          .get("/index.php?controller=search&q=dress&limit=10&timestamp=1646718572840&ajaxSearch=1&id_lang=1")
          .headers(headers_1)
      )
      .pause(2)
      .exec(
        http("request_2")
          .get("/index.php?id_product=4&controller=product")
          .headers(headers_2)
      )
      .pause(2)
      .exec(
        http("ADD_TO_CART_REQUEST")
          .post("/index.php?rand=1646718581225")
          .headers(headers_3)
          .formParam("controller", "cart")
          .formParam("add", "1")
          .formParam("ajax", "true")
          .formParam("qty", "1")
          .formParam("id_product", "4")
          .formParam("token", "e817bb0705dd58da8db074c69f729fd8")
          .formParam("ipa", "16")
      )
      .pause(1)
      .exec(
        http("request_4")
          .get("/index.php?controller=order")
          .headers(headers_2)
      );

	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
