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

class Toy{
    String name;
    String brand;
    double price;
    int quantity;

    void setPrice(double price){
        this.price = price;
    }
     static public void main(String[] wdfwersdf) {
        Toy toy1 = new Toy();
        toy1.name ="Rage pink";
        toy1.brand = "Lab Vuvu";
        toy1.price = 4500;
        toy1.quantity = 12;
        toy1.setPrice((toy1.price*0.5));
        System.out.println(toy1.price);
    }
} 

class Man {

  public static void main(String[] args) {
     String[] copyFrom = {
            "Chocolate Cake", "Cheesecake", "Red Velvet Cake", "Vanilla Cake", "Sponge Cake","Pumpkin Spice Cake", "Strawberry Cake", "Carrot Cake", "Butter Cake", "Funfetti Cake", "Marble Cake","Pistachio Cake", "Cookie Cake" };
        
        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String cakes : copyTo) {
            System.out.print(cakes + ", ");           
        }
     
  }
}

class arr {
  public static void main(String[] args) {
    String[] copyFrom = {
        "Chocolate Cake", "Cheesecake", "Red Velvet Cake", "Vanilla Cake", "Sponge Cake", "Pumpkin Spice Cake",
        "Strawberry Cake", "Carrot Cake", "Butter Cake", "Funfetti Cake", "Marble Cake", "Pistachio Cake",
        "Cookie Cake" };

    String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
    for (String cakes : copyTo) {
      System.out.print(cakes + ", ");
    }
    // System.out.println(java.util.Arrays.toString(copyTo));
  }
}