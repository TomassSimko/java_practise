package oop_basics.assign5.models;

public abstract class Person {
    private int id;
    private String name;
    private String email;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person) obj;
        return p.getId() == this.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.email;
    }
}
