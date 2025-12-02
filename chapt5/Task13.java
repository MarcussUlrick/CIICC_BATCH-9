package chapt5;

class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int year, int numDoors){
        super(make, model, year);
        this.numDoors = numDoors;
    }

    public void dispDeets(){
        System.out.println("Car Details:");

        System.out.println("Make: " + getMake());
        System.out.println("MOdel:" + getModel());
        System.out.println("Year:" + getYear());
    }
}


public class Task13 {
    public static void main(String[] args) {
        Car mCar = new Car("Mitsubishi", "Mirage", 2023, 4);

        mCar.dispDeets();
    }
}
