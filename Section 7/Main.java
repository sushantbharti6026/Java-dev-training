import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
       Car[] cars = new Car[]{
            new Car("nissan",5000,2020,"red",new String[] {"tires", "keys"}),
            new Car("Dodge",8500,2019,"blue",new String[] {"tires", "keys"}),
            new Car("Nissan",5000,2017 ,"Yellow",new String[] {"tires", "filter"}),

        };
        Dealership dealership = new Dealership();
        for (int i = 0; i < cars.length; i++) {
            dealership.setCar(cars[i],i);
        }
        //Car newCar = dealership.getCar(0);
        //newCar.setColor("blue");
        //System.out.println(dealership.getCar(0));
        //dealership.sell(2);
        //dealership.setCar(nissan, 0);
        //System.out.println(dealership);
    }
}