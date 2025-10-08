package labWork5;

public class Person {
    private String name;
    private int age;
    private String country;

    public Person() {
        this.name = "Niko";
        this.age = 27;
        this.country = "Moldova";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static void main(String[] args) {
        Person person = new Person();

        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's age: " + person.getAge());
        System.out.println("Person's country: " + person.getCountry());

        person.setName("Justin");
        System.out.println("\nPerson's name after changes: " + person.getName());

        person.setAge(23);
        System.out.println("Person's age after changes: " + person.getAge());

        person.setCountry("Germany");
        System.out.println("Person's country after changes: " + person.getCountry());
    }
}
