package com.liang.typeinfo;

public class Position {
    private String title;
    private Person person;

    public Position(String jobTitle, Person employee) {
        this.title = jobTitle;
        person = employee;
        if (person == null) {
            person = Person.NULL;
        }
    }

    public Position(String jobTitle) {
        this.title = jobTitle;
        person = Person.NULL;
    }

    public String getTitle() {
        return title;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person newPerson) {
        person = newPerson;
        if (person == null) {
            person = Person.NULL;
        }
    }

    public String toString() {
        return "Position: " + title + " " + person;
    }
}
