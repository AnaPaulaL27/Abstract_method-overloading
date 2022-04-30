package tasks;

public class Task {

    //defining Task- needs description

    String description;
    boolean isComplete;

    //in constructor
    Task(String description) {
        this.description = description;
        this.isComplete = false;
    }
    //getters
    public String getDescription() {
        return this.description;
    }

    public boolean getIsComplete(){
        return this.isComplete;
    }

    //setter
    //finished task

    public void setIsComplete(boolean complete){
        this.isComplete = complete;

    }
}
