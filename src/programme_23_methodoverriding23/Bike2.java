package programme_23_methodoverriding23;

/**
 * Creating a child class
 */

public class Bike2 {
    //defining the same method as in the parent class
    public void run(){
        System.out.println("Bike is running safely");

    }

    public static void main(String[] args) {
        Bike2 obj = new Bike2() ;
        obj.run() ; // calling metho
    }
}
