public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Plant plant1 = new Plant();
        plant1.name="papaya"; //write
        plant1.setBranch(100);
        System.out.println(plant1.name); //read
        System.out.println(plant1.getBranch());
    }
}

/**
 * Plant class creates a Plant object
 * that has a property branch,name, and leaves
 */
class Plant{
    int branch;
    String name;
    int leaves;
    /**
     * setBranch modifies the number of leaves
     */
    void setBranch(int leaves){
        this.leaves=leaves;
    }
    int getBranch() {
        return branch;
    }
}

class Toy {
    String name;
    String brand;
    double price;
    int qty;

    void setPrice (double price) {
            this.price = price;
    }

    public static void main(String[] args) {
        Toy toy1 = new Toy();

        toy1.name = "Car";
        toy1.brand = "mitsu";
        toy1.price = 5000;
        toy1.qty = 3;
        toy1.setPrice((toy1.price*0.5));

        System.out.println(());

    }
}