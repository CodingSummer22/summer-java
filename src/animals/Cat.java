package animals;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void sound() {
        System.out.println("Meow");
    }

    public String toString() {
        return name + ", the Cat";
    }
}
