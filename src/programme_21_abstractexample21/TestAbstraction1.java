package programme_21_abstractexample21;

public class TestAbstraction1 {
    public static void main(String[] args) {
        Shape s = new Circle() {};// In a real scenario, object is provided through method, e.g.,getShape
        s.draw() ;
    }
}
