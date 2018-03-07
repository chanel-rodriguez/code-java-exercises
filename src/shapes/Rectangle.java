package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

}
