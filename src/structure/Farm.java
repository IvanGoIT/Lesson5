package structure;

import animal.Dog;
import vegetables.Potato;

public class Farm {
    public Dog[] dog = new Dog[10];
    public Potato[] potato = new Potato[1000];

    public Farm() {
        for(int i = 0; i < dog.length; i++) {
            dog[i] = new Dog();
        }
        for(int i = 0; i < potato.length; i++) {
            potato[i] = new Potato();
        }
    }
}
