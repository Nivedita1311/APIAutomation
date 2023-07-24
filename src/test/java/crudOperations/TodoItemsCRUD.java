package crudOperations;

//this class will have CRUD operations on a single API module

import api.Urls.ApiUrls;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import payload.ToDoItemsPOJO;

public class TodoItemsCRUD {

    static Response response;

    public static Response createItem(ToDoItemsPOJO payload)
    {
        response =

                RestAssured.given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post(ApiUrls.post_Url);

        return response;

    }

    public static Response updateItem(String identity, ToDoItemsPOJO payload)
    {
        response =

                RestAssured.given()
                        .contentType(ContentType.JSON)
                        .pathParam("id", identity)
                        .body(payload)
                        .when()
                        .put(ApiUrls.put_Url);

        return response;

    }

    public static Response retrieveItem(ToDoItemsPOJO identity)
    {
        response =

                RestAssured.given()
                        .pathParam("id", identity)
                        .when()
                        .get(ApiUrls.get_Url);

        return response;

    }


}
