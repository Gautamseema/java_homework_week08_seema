package programme_20_pool_area;

public class Rectangle {
    double width;
    double length;
    //constructor
  public Rectangle(double width , double length ){
      // width and length not negative
      this.width = (width < 0 ) ? 0 : width;
      this.length = (length < 0 ) ? 0 : length ;
  }

    public double getWidth() {
        return width;
  }
  public double getLength (){
      return length ;
  }
  public double getArea(){
      return width * length ;
  }
}
