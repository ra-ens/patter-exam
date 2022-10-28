package elements;

import patterns.observer.Observable;
import patterns.observer.Observer;
import patterns.strategy.TraiterStrategy;

import java.io.*;

public abstract class Drawing implements Observer, Serializable {
    protected int borderWidth;
    protected String borderColor;
    protected String backgroundColor;
    protected TraiterStrategy traiterStrategy;
    protected int level;

    public abstract double perimetre();
    public abstract double surface();

    public void traiter() {
        if(traiterStrategy != null)
            this.traiterStrategy.traiter(this);
        else
            throw new RuntimeException("Strategy not initialized");
    }

    public void serialize() throws IOException {
        File file=new File("Drawing.bat");
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(this);
        objectOutputStream.close();
    };

    public void print() {
        System.out.print(String.format("BorderWith: %d, BorderColor: %s, BackgroundColor: %s", borderWidth, borderColor, backgroundColor));
    }

    @Override
    public void update(Observable observable) {
        Config config = (Config) observable;
        this.borderWidth = config.getBorderWidth();
        this.borderColor = config.getBorderColor();
        this.backgroundColor = config.getBackgroundColor();
    }

    protected String levelTabs(){
        String tabs = "";
        for (int i = 0; i <level ; i++) {
            tabs+="\t";
        }
        return tabs;
    }

    public void setTraiterStrategy(TraiterStrategy traiterStrategy) {
        this.traiterStrategy = traiterStrategy;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
