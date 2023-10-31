package programme_19_cylinder;

/**
 *  write a class name Circle .
 *  The class needs one field (instance variable) with name radius of type double .
 *  The class needs to have one constructor with parameter radius of type double and it needs to initialize
 *  the fields. in case the radius parameter is less than 0 it needs to set the radius field value to 0.
 *  write the following methods(instance methods).
 *  Method named getRadius without any parameters,
 *  it needs to return the value of the radius field. Method named getArea without any parameters,
 *  it needs to return the calculated area
 * (radius * radius * PI). For PI use Math.PI constant
 */

public class Circle {
    double radius;
    // circle
    public Circle (double radius){
        //Initialise radius, it's not negative
        this.radius = (radius < 0 ) ? 0 : radius ;
    }
    // Instance method
    public double getRadius ( ){
        return radius;
    }
    // get area method
    public double getArea(){
        return radius * radius * Math.PI ;
    }
}
