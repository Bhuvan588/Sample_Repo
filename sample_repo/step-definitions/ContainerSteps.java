package steps;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;

public class ContainerSteps {

    @When("user creates container {string}")
    public void createContainer(String containerId) {

        RestAssured
            .given()
            .body("{\"containerId\":\""+containerId+"\"}")
            .post("http://dummy-api/containers");
    }

    @And("container is assigned to location {string}")
    public void assignLocation(String location) {

        RestAssured
            .given()
            .body("{\"location\":\""+location+"\"}")
            .post("http://dummy-api/container/location");
    }

    @Then("container should exist in inventory")
    public void checkInventory() {

        RestAssured
            .get("http://dummy-api/inventory/check");
    }
}