package labWork6;

//пример интерфейса и инкапсуляции
//класс dog который реализует интерфейс Pet
public class Dog implements Pet {
    //приватные переменные
    private String name;
    private int age;

    //конструктор
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //методы getName и getAge (геттеры)
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
