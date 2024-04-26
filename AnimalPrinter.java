package pkg1;

// PART D
public class AnimalPrinter<T extends Animal> {
    private T animal;
    public AnimalPrinter(T animal) {
        this.animal = animal;
    }

    public void print() {
        System.out.println(animal);
    }

    public String getDataType() {
        return this.animal.getClass().getSimpleName();
    }
}
