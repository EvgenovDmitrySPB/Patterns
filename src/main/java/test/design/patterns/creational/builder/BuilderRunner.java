package test.design.patterns.creational.builder;

public class BuilderRunner {
    public static void main(String[] args) {
        System.out.println("******** pattern Builder ****************");
        CarBuilder builder = new CarBuilder();
        builder.reset();

        System.out.println(builder.getResult());

        builder.setAge(17);
        builder.setBrand(Brand.TOYOTA);
        builder.setVin("VMJLJLJK223LJJJLK4324");
        builder.setNumberSeats(4);

        Car car = builder.getResult();
        System.out.println(car);

        Director director = new Director(new CarBuilder());
        Car homeCar = director.constructHomeCar();
        Car sportCar = director.constructSportCar();

        System.out.println(homeCar);
        System.out.println(sportCar);

        System.out.println("******** end of pattern Builder ****************");
    }
}
