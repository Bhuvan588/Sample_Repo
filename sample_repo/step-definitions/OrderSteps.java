package steps;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;

public class OrderSteps {

    @Given("warehouse receives order {string}")
    public void receiveOrder(String orderId) {

        RestAssured
            .given()
            .body("{\"orderId\":\""+orderId+"\"}")
            .post("http://dummy-api/orders");
    }

    @When("system allocates container")
    public void allocateContainer() {

        RestAssured
            .given()
            .post("http://dummy-api/container/allocate");
    }

    @And("robot retrieves container")
    public void robotRetrieveContainer() {

        RestAssured
            .given()
            .post("http://dummy-api/robot/retrieve");
    }

    @Then("order should move to packing station")
    public void moveOrderToPacking() {

        RestAssured
            .given()
            .post("http://dummy-api/orders/pack");
    }
}