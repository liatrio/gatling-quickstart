// Scenario: Submit a contact form
// Step 1: Navigate to Liatrio's dev URL
// Step 2: Submit form

package performancetests

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class SubmitForm extends Simulation {

  val devUrl = "http://dev.timshort.liatr.io/personal-banking/"

  val httpProtocol = http.baseUrl(devUrl)

  val scn = scenario("Submit a contact form")
    .exec(http("GetHomePage").get("/"))
    .pause(5)
    .exec(http("PostForm") // Submit form
      .post("#")
      .formParam("""name""", """John Adams""")
      .formParam("""email""", """johnadams@test.liatr.io""")
      .formParam("""message""", """I would like to buy all your products""")
      )
    
  setUp(scn.inject(
      atOnceUsers(1)
      )
    .protocols(httpProtocol))
  
}
