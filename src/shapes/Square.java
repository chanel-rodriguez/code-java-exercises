package shapes;

public class Square extends Quadrilateral {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public void setLength(int length) {
        setWidth(length);
    }

    public Square(int length) {
        super(length, length);
    }

    public void printHello(){
        System.out.println("Hello");
    }
}
