package elements;

public class Rectangle extends Drawing {

    private double l;
    private double h;
    private Point topLeftPoint;

    @Override
    public double perimetre() {
        return 0;
    }

    @Override
    public double surface() {
        return 0;
    }

    @Override
    public void serialize() {

    }

    public Rectangle() {
    }

    public Rectangle(double l, double h, Point topLeftPoint) {
        this.l = l;
        this.h = h;
        this.topLeftPoint = topLeftPoint;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(String.format(", l: %f, h: %f, %s", l, h, topLeftPoint.toString()));
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }
}
