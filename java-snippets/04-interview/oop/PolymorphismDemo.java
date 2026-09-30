public class PolymorphismDemo {
    static class Shape {
        double area(){ return 0; }
        String name(){ return "Shape"; }
    }

    static class Circle extends Shape {
        double r;
        Circle(double r){ this.r = r; }
        double area(){ return Math.PI * r * r; }
        String name(){ return "Circle"; }
    }

    static class Rectangle extends Shape {
        double l, w;
        Rectangle(double l, double w){ this.l = l; this.w = w; }
        double area(){ return l * w; }
        String name(){ return "Rectangle"; }
    }

    public static void main(String[] args){
        Shape[] shapes = { new Circle(2), new Rectangle(3, 4) };

        for(Shape s : shapes){
            System.out.println(s.name() + " area = " + String.format("%.2f", s.area()));
        }

        System.out.println("Same method call, different implementation -> runtime (dynamic) polymorphism");
        System.out.println("Overloading = compile time (different params), Overriding = runtime (same signature)");
    }
}
