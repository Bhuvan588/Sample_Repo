package steps;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;

public class RobotSteps {

    @When("robot moves to location {string}")
    public void moveRobot(String location) {

        RestAssured.post("http://dummy-api/robot/move");
    }

    @And("robot lifts container with weight {int}")
    public void liftContainer(int weight) {

        RestAssured.post("http://dummy-api/robot/lift");
    }

    @Then("robot should deliver container to station")
    public void deliverContainer() {

        RestAssured.post("http://dummy-api/robot/deliver");
    }
}