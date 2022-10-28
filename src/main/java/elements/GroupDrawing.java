package elements;

import patterns.observer.Observable;

import java.util.ArrayList;
import java.util.List;

public class GroupDrawing extends Drawing {

    private List<Drawing> drawingList = new ArrayList<>();

    @Override
    public double perimetre() {
        System.out.println("Not implemented");
        return 0;
    }

    @Override
    public double surface() {
        System.out.println("Not implemented");
        return 0;
    }

    @Override
    public void update(Observable observable) {
        super.update(observable);
        drawingList.forEach(drawing -> drawing.update(observable));
    }

    public void addDrawing(Drawing drawing) {
        drawing.setLevel(this.level + 1);
        drawingList.add(drawing);
    }

    public void removeDrawing(Drawing drawing) {
        drawingList.remove(drawing);
    }

    public void printAll() {
        drawingList.forEach(drawing -> {
            System.out.print(this.levelTabs() + "+ Group:\n" + this.levelTabs());
            drawing.print();
        });
    }

    public List<Drawing> getDrawingList() {
        return drawingList;
    }
}
