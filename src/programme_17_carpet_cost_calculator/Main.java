package programme_17_carpet_cost_calculator;

public class Main {
    //main method
    public static void main(String[] args) {
        // create object
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor,carpet);
        // print method
        System.out.println("total = " + calculator.getTotalCost() );
        // call other method in main method
        carpet = new Carpet(1.5);
        floor = new Floor(5.4,4.5);
        calculator = new Calculator(floor, carpet );
        System.out.println("total= " + calculator.getTotalCost() );
    }
}
