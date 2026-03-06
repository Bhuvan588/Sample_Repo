package steps;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;

public class LookupSteps {

    @When("system fetches container {string}")
    public void fetchContainer(String containerId) {

        RestAssured
            .given()
            .queryParam("containerId", containerId)
            .get("http://dummy-api/containers");
    }

    @Then("container details should be returned")
    public void verifyContainerDetails() {

        RestAssured
            .given()
            .get("http://dummy-api/containers/verify");
    }
}