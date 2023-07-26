package payload;

import lombok.Builder;
import lombok.Getter;

public class ToDoItemsPOJO {

    //member variables - json objects

    String iD;
    String description;
    boolean isCompleted;

    //getters and setters

    public String  getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
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
