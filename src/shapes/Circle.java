package shapes;

public class Circle {
    private double radius;

    private static int numOfCircles=0;

    public static int getNumOfCircles() {
        return numOfCircles;
    }

    public Circle(double radius) {
        this.radius = radius;
        Circle.numOfCircles ++;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    public double getCircumference(){
        return this.radius * 2 * Math.PI;
    }

}
