package elements;

public class Cercle extends Drawing {

    private double rayon;
    private Point center;

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

    public Cercle() {
    }

    public Cercle(double rayon, Point center) {
        this.rayon = rayon;
        this.center = center;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(String.format(", Rayon: %f, %s", rayon, center.toString()));

    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
