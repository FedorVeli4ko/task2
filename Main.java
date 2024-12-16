public class Main {
    public static void main(String[] args) {
        try {
            Rectangle rect = new Rectangle(5, 10);
            System.out.println("Rectangle Area: " + rect.area());
            System.out.println("Rectangle Perimeter: " + rect.perimeter());

            Circle cir = new Circle(7);
            System.out.println("Circle Area: " + cir.area());
            System.out.println("Circle Perimeter: " + cir.perimeter());

            Triangle tr = new Triangle(3, 4, 5);
            System.out.println("Triangle Area: " + tr.area());
            System.out.println("Triangle Perimeter: " + tr.perimeter());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
