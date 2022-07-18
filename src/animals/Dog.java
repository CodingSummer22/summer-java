package animals;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void sound() {
        System.out.println("Woof");
    }

    public String toString() {
        return name + ", the Dog";
    }
}
