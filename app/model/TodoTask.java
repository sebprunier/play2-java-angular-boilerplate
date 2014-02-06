package model;

public class TodoTask {

    private String title;

    private String description;

    public String getTitle() {
        return title;
    }

    public TodoTask withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public TodoTask withDescription(String description) {
        this.description = description;
        return this;
    }
}
