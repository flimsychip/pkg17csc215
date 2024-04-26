package pkg1;

// PART D
public class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
}

class Hamster extends Animal {
    public Hamster(String name) {
        super(name);
    }
    public String toString() {
        return "hello i am a hamster named " + this.name + ". squeak";
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    public String toString() {
        return "hello i am a cat named " + this.name + ". meow meow";
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public String toString() {
        return "hello i am a dog named " + this.name + ". woof woof";
    }
}