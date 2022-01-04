package example

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class ExampleSimulation extends Simulation {

  val httpProtocol = http
    .baseUrl("https://example.com")
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
    .doNotTrackHeader("1")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")

  val scn = scenario("Scenario Name")
    .exec(
      http("get_request")
        .get("/")
    )
    .pause(1)
    .exec(
      http("post_request")
        .post("/")
        .formParam("name", "just example")
    )

  setUp(scn.inject(atOnceUsers(1)).protocols(httpProtocol))
}
