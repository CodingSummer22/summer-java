package animals;

public class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }

    public void sound() {
        System.out.println("Quack");
    }

    public String toString() {
        return name + ", the Duck";
    }
}
