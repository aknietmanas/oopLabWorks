package labWork6;

//пример абстрактного класса
// тестовый класс для AbstractPet
public class TestAbstractPet {
    public static void main(String[] args) {
        //создание объекта cat и ссылка на AbstractCat
        AbstractPet cat = new AbstractCat();
        //вызов метода для cat
        cat.sound();

        //создание объекта dog и ссылка на AbstractDog
        AbstractPet dog = new AbstractDog();
        //вызов метода для dog
        dog.sound();
    }
}
