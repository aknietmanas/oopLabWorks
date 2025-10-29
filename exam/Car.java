package exam;

public class Car {
    String brand;
    int year;

    Car(String brand) {
        this.brand = brand;
    }

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getName() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}

