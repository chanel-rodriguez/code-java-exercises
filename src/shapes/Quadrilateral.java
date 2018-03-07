package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;

    protected int width;

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }


    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public abstract void setWidth(int width);

    public abstract void setLength(int length);

    @Override
    public int getPerimeter() {
        return 2*(length + width);
    }

    @Override
    public int getArea() {
        return length* width;
    }
}
