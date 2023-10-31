package java_programme_week08;

public class Programme_16_Point {
    int x;
    int y;
    public Programme_16_Point(){
        // no arg construtor
    }
    public Programme_16_Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY (int y){
        this.y =y;
    }
    public double distance(){
        return Math.sqrt(x * x + y * y);
    }
    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y -y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff );
    }
    public double distance(Programme_16_Point another){
        int xDiff = this.x - another. x;
        int yDiff = this.y - another .y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff );
    }

    public static void main(String[] args) {
        Programme_16_Point first = new Programme_16_Point(6, 5);
        Programme_16_Point second = new Programme_16_Point(3,1) ;
        System.out.println("distance(0,0) = " +  first.distance ());
        System.out.println("distance(second) = " +  first.distance(second));
        System.out.println("distance(2,2) = " +  first.distance (2,2));

        Programme_16_Point point = new Programme_16_Point();
        System.out.println("distance () = " + point.distance() );
    }
}
