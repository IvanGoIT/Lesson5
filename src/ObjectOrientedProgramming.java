import animal.Dog;
import com.sun.org.apache.xpath.internal.SourceTree;
import structure.Farm;
import vegetables.Potato;

public class ObjectOrientedProgramming {
    // ООП Объектно Ориентированное программирование

    public static void main(String[] args) {
        // Собаки
        Dog dogDefault = new Dog();
        dogDefault.showInfo();

        System.out.println();

        Dog dogSharik = new Dog("Шарик", 5);
        dogSharik.showInfo();


        // Картошка
        Potato p = new Potato();
        p.releaseDate = 95;
        p.outDate = 10;
        p.refreshParams(100);
        System.out.println("Готова ли картошка к употреблению? " + p.getReadyToEat());

        System.out.println();
        System.out.println();

        System.out.println("Ферма");
        Farm farm = new Farm();
        farm.dog[0].showInfo();
    }
}
