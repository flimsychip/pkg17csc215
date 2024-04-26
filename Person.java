package pkg1;

// PART A, B, C
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHiPerson() {
        System.out.println("hi i am a person");
    }
}
