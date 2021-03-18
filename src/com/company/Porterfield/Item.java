package com.company.Porterfield;

public class Item {
    private String title;
    private String description;
    private int priority;
    static int numItems = 0;

    public Item() {
        numItems++;
    }

    public Item(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        numItems++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Name: " + title + ", Description: " + description + ", Priority: " + priority + "\n";
    }

    public void display() {
        System.out.printf("Title: " + title + " | Description: " + description + " | Priority: " + priority);
    }
}
