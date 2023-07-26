package stepdefinations;

import com.github.javafaker.Faker;
import com.github.javafaker.service.RandomService;
import crudOperations.TodoItemsCRUD;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import payload.ToDoItemsPOJO;

import java.util.Locale;


public class POSTStepdef {

    Response response;
    ToDoItemsPOJO toDoItems;

    @Before
    public void setData(){

        Faker faker = new Faker(new Locale("en-GB"), new RandomService());
        toDoItems= new ToDoItemsPOJO();
        toDoItems.setDescription(String.valueOf(faker.regexify("[a-z1-9]{10}").hashCode()));

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
