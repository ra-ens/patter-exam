import elements.*;

public class Main {
    public static void main(String[] args) {

        GroupDrawing groupDrawing = new GroupDrawing();

        Cercle cercle = new Cercle(1.5, new Point(1, 2));
        Rectangle rectangle = new Rectangle(5, 2, new Point(3, 3));

        groupDrawing.addDrawing(cercle);
        groupDrawing.addDrawing(rectangle);

        GroupDrawing groupDrawing2 = new GroupDrawing();
        groupDrawing2.addDrawing(rectangle);
        groupDrawing2.addDrawing(cercle);
        groupDrawing.addDrawing(groupDrawing2);

        Config config = new Config();
        config.subscribe(groupDrawing);

        config.setBorderWidth(5);
        config.setBorderColor("Black");
        config.setBackgroundColor("Red");

        groupDrawing.printAll();
    }
}
