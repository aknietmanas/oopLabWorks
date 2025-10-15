package labWork6;
// тестовый класс
public class TestPet {
    public static void main(String[] args) {
        //создание объекта cat с параметрами Bongo, 4
        Cat cat = new Cat("Bongo", 4);
        //создание объекта dog с параметрами Hank, 5
        Dog dog = new Dog("Hank", 5);

        //выводы
        System.out.println("Cat's name: " + cat.getName());
        System.out.println("Cat's age: " + cat.getAge());

        System.out.println("\nDog's name: " + dog.getName());
        System.out.println("Dog's age: " + dog.getAge());
    }
}
