package test.design.patterns.creational.builder;

public interface Builder {
    void reset();
    void setName(String name);
    void setBrand(Brand brand);
    void setVin(String vin);
    void setAge(int age);
    void setNumberSeats(int numberSeats);
    Car getResult();
}
