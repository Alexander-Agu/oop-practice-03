package model;

public abstract class Person {
    private static int count = 0;
    private String id;
    private String name;

    public Person(String name){
        count++;
        id = "" + count;
        this.name = name;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }


}
