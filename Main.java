package pkg1;

public class Main {
    public static void main(String[] args) {
        // PART A
        Teacher t1 = new Teacher("alice", "philosophy");
        t1.sayHiPerson();
        t1.sayHiTeacher();

        Person p1 = new Teacher("bob", "archaeology");
        p1.sayHiPerson();
        System.out.print(p1.getName());
        // p1.sayHiInstructor(); // ERROR
        // System.out.print(p1.getSubject()); // ERROR
        System.out.println();

        // Teacher t2 = new Person(); // ERROR


        // PART B
        Person p2 = new Person();
        // Teacher t2 = (Teacher) p2; // ERROR

        Person p3 = new Teacher();
        Teacher t3 = (Teacher) p3;


        // PART C
        Teacher t4 = new Teacher("charlie", "forensics");
        Teacher t5 = new Teacher("danny", "forensics");
        Teacher t6 = new Teacher("charlie", "computer science");
        Teacher t7 = new Teacher("charlie", "forensics");
        Person p4 = new Person("charlie");
        t4.equals(t5); // false bc different person/name
        t4.equals(t6); // false bc different subjects
        t4.equals(t7); // true bc same person/name and subject
        t4.equals(p4); // false bc not a teacher

        Teacher t8 = new Teacher("eliza", "history", 70000);
        Teacher t9 = new Teacher("frank", "criminal justice", 70000);
        Teacher t10 = new Teacher("gary", "marine biology", 80000);
        System.out.println(t8.compareTo(t9)); // 0
        System.out.println(t8.compareTo(t10)); // -10000
        System.out.println(t8.compareTo(p4)); // 404


        // PART D
        Hamster h1 = new Hamster("hammy");
        Cat c1 = new Cat("felix");
        Dog d1 = new Dog("pudge");
        AnimalPrinter<Hamster> hamPrinter = new AnimalPrinter<>(h1);
        System.out.print("printing description for a " + hamPrinter.getDataType() + ": ");
        hamPrinter.print();
        AnimalPrinter<Cat> catPrinter = new AnimalPrinter<>(c1);
        System.out.print("printing description for a " + catPrinter.getDataType() + ": ");
        catPrinter.print();
        AnimalPrinter<Dog> dogPrinter = new AnimalPrinter<>(d1);
        System.out.print("printing description for a " + dogPrinter.getDataType() + ": ");
        dogPrinter.print();
    }
}
