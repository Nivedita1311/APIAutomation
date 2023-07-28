package payload;

public class ToDoItemsPOJO {

    //member variables - json objects

    private String id;
    private String description;
    private boolean isCompleted;

    //getters and setters

    public String  getId() {
        return id;
    }

    public void setId(String iD) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int isCompleted(int isCompleted) {
        return isCompleted;
    }

    public void setCompleted() {
        isCompleted = true;
    }

}
