package programme_20_pool_area;

public class Main {
    public static void main(String[] args) {
        // create object
        Rectangle rectangle = new Rectangle(5,10);
        double width = rectangle.getWidth();
        System.out.println("rectangle.width = " + rectangle.getWidth());
        double length = rectangle.getLength();
        System.out.println("rectangle.length = " + rectangle.getLength());
        double Area = rectangle.getArea();
        System.out.println("rectangle.Area = " + rectangle.getArea());

         // create cuboid object
        Cuboid cuboid = new Cuboid(5,10,2);
        double height = cuboid.getHeight();
        double volume = cuboid.getVolume();
        //print statment
        System.out.println("cuboid.width = " + cuboid.getWidth() );
        System.out.println("cuboid.length = " + cuboid.getLength());
        System.out.println("cuboid.area = " + cuboid.getArea() );
        System.out.println("cuboid.height = " + cuboid.getHeight() );
        System.out.println("cuboid.volume = " + cuboid.getVolume() );

    }
}
