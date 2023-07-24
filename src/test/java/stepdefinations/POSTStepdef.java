package stepdefinations;

import com.github.javafaker.Faker;
import crudOperations.TodoItemsCRUD;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import payload.ToDoItemsPOJO;


public class POSTStepdef {

    ToDoItemsPOJO toDoItems;
    Response response;
    Faker faker;

    @Before
    public void setData(){

        faker = new Faker();
        toDoItems = new ToDoItemsPOJO();

        toDoItems.setDescription(String.valueOf(faker.name().hashCode()));

    }

    @Given("User is able to add an Item")
    public void userIsAbleToAddAnItem() {

        response = TodoItemsCRUD.createItem(toDoItems);
        response.then().log().all();

    }


    @Then("Verify response status code is {int}")
    public void verifyResponseStatusCodeIs(int statusCode) {

        Assert.assertEquals(response.getStatusCode(),statusCode);
    }
}
