package steps;

import io.cucumber.java.en.*;

public class BulkSteps {

    @When("containers are bulk created")
    public void bulkCreate(io.cucumber.datatable.DataTable table) {

        table.asMaps().forEach(row -> {

            System.out.println(row.get("containerId"));

        });
    }

}