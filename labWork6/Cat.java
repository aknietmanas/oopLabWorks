package labWork6;

//пример интерфейса и инкапсуляции
//класс Cat который реализует интерфейс Pet
public class Cat implements Pet {
    //приватные переменные name и age
    private String name;
    private int age;

    //конструктор
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //реализация методов getNmae и getAge
    @Override
    public String getName() {
         return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
