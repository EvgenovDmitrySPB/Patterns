package test.design.patterns.creational.builder;

public class CarBuilder implements Builder {

    private Car car;

    public void reset() {
        this.car = new Car();
    }

    public void setName(String name) {
        this.car.setName(name);
    }

    public void setBrand(Brand brand) {
        this.car.setBrand(brand);
    }

    public void setVin(String vin) {
        this.car.setVin(vin);
    }

    public void setAge(int age) {
        this.car.setAge(age);
    }

    public void setNumberSeats(int numberSeats) {
        this.car.setNumberSeats(numberSeats);
    }

    public Car getResult() {
        return this.car;
    }
}
