package chapt6;

// 1. Define the Animal interface
interface Animal {
    /**
     * Attempts to feed the animal.
     * @param timeToEat boolean indicating if it is the animal's scheduled meal time.
     * @return true if the animal was successfully fed, false otherwise.
     */
    boolean feed(boolean timeToEat);
    
    /**
     * Performs grooming actions on the animal.
     */
    void groom();
    
    /**
     * Attempts to interact with the animal by petting.
     */
    void pet();
}

// 2. Create the Gorilla class which implements the Animal interface
class Gorilla implements Animal {
    
    /**
     * Implementation of the feed method.
     */
    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("Feeding the gorilla.");
            // put gorilla food into cage
            System.out.println("// put gorilla food into cage");
            return true;
        } else {
            System.out.println("It's not time to eat.");
            return false;
        }
    }

    /**
     * Implementation of the groom method.
     */
    @Override
    public void groom() {
        System.out.println("Grooming the gorilla.");
        // lather, rinse, repeat
        System.out.println("// lather, rinse, repeat");
    }

    /**
     * Implementation of the pet method.
     */
    @Override
    public void pet() {
        System.out.println("Attempting to pet the gorilla.");
        // pet at your own risk
        System.out.println("// pet at your own risk");
    }
}

public class Task16 {
    public static void main(String args[]) {
        Gorilla koko = new Gorilla();
        
        System.out.println("--- Gorilla Actions ---");
        koko.feed(true);
        koko.groom();
        koko.pet();
        System.out.println("-----------------------");
        koko.feed(false);
    }
}