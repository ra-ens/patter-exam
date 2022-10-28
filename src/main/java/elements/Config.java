package elements;

import patterns.observer.Observable;
import patterns.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Config implements Observable {

    private int borderWidth;
    private String borderColor;
    private String backgroundColor;

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> {observer.update(this);});
    }

    public Config() {
    }

    public Config(int borderWidth, String borderColor, String backgroundColor) {
        this.borderWidth = borderWidth;
        this.borderColor = borderColor;
        this.backgroundColor = backgroundColor;
        notifyObservers();
    }

    public int getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
        notifyObservers();
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
        notifyObservers();
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        notifyObservers();
    }
}
