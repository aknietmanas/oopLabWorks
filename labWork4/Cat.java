package labWork4;

public class Cat {
    private String name;

    public Cat() {
        this.name = "Bongo";
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println("Cat's name" + cat.getName());
    }
}
