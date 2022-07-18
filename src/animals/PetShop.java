package animals;

public class PetShop {
    public static void main(String[] args) {

        Animal [] animals = new Animal[3];
        animals[0] = new Dog("Pluto");
        animals[1] = new Cat("Sylvester");
        animals[2] = new Duck("Donald");

        for(Animal a : animals) {
            System.out.println(a);
            a.sound();
        }

        for(Animal a : animals) {
            if(a instanceof Dog) {
                Dog d = (Dog)a;
                d.sound();
            }
            else if(a instanceof Cat) {
                Cat c = (Cat)a;
                c.sound();
            }
            else if(a instanceof Duck) {
                Duck d = (Duck)a;
                d.sound();
            }
        }
    }
}
