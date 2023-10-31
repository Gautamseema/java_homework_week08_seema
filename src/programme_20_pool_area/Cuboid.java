package programme_20_pool_area;

public class Cuboid extends Rectangle {
    double height;
    //Constructor
    public Cuboid (double width, double length, double height){
     // call the parent class
        super(width, length);
        this.height = (height < 0 ) ? 0 : height ;
    }
     public double getHeight ( ){
        return height;
     }
     public double getVolume( ){
        return getWidth() * getLength() * height;
     }
}
