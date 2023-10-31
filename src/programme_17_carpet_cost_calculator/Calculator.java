package programme_17_carpet_cost_calculator;

/**
 *  Write a class with the name Calculator.
 * The class needs two fields (instance variables) with name
 * floor of type Floor and carpet of type carpet.
 * The class needs to have one constructor with parameters floor of type floor and carpet type of
 * carpet and it needs to initialize the fields.
 * Write the following methods (instance method ) Method named getTotalCost without any parameters,
 * it needs to return the calculated total cost to cover the floor with a carpet
 */

public class Calculator {
    // Instance variable
     Floor floor ;
     Carpet carpet;
  public Calculator (Floor floor , Carpet carpet ){
      this.floor = floor ;
      this.carpet = carpet;
  }
  public double getTotalCost(){
      return floor.getArea() * carpet.getCost();
  }
}
