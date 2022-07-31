import java.util.Arrays;

public class Dealership {
    private Car[] cars;
    // Sell car action

    public void sell(int index){
        this.cars[index].drive();
        this.cars[index] = null;
    }

    public String search(String make, int budget){
        for (int i = 0; i < this.cars.length; i++) {
            if(this.cars[i] == null){
                continue;
            }
            else if(this.cars[i].getMake().equals(make) && this.cars[i].getPrice()<=budget){
                return "\n We found one in spot "+i+ "\n" + this.cars[i].toString() + "\nAre you interested.";
            }
        }
        return "Sorry we can't find any cars.";
    }
    // 1. Constructor
    public Dealership(){
        this.cars = new Car[3];
        //System.out.println(Arrays.toString(this.cars));
    }
    // 2. Setter (one field hence one setter)
    // the setter only updates one object at a time.
    // the setter lets the user choose which one.
    // hence parameter is 'Car car, int index' and not Car[] cars.
    public void setCar(Car car, int index){
        this.cars[index] = new Car(car);
    }
    //3. Getter
    // returns one object 
    // at an index of your choice
    public Car getCar(int index){
        return new Car(this.cars[index]);
    }
    public String toString(){
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            if(this.cars[i]==null){
                temp += "Empty\n";
            }else{
            temp += "Parking Spot: "+i+ "\n";
            temp += this.cars[i].toString()+"\n" ;
        }
    }
        return temp;
    }

}

