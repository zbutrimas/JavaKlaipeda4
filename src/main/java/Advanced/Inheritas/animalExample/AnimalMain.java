package Advanced.Inheritas.animalExample;

import java.util.Arrays;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {

        Cat cat = new Cat(true, "miau","grey");
        Dog dog = new Dog(true, "whaf", "Doberman");

        System.out.println((cat.yieldVoice()));
        System.out.println((dog.yieldVoice()));
        
        List<Animal> animals = Arrays.asList(
                cat,
                dog,
                new Dog(true, "whaaafff", "Shepard"),
                new Cat(true, "miiaiaauuu", "ginger")
        );
        
        for(Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
            System.out.println(animal.yieldVoice());
        }
    }
}
