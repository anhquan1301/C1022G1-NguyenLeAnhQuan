package model;

public class Class {
    private int id;
    private String name;

    public Class() {
    }

    public Class(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Class(String nameClass) {
        this.name = nameClass;
    }

    public Class(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
