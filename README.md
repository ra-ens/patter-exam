# Design patterns

Ce projet est développé à l'aide de design patterns (composite, observer et stratégie). ci-dessous le diagramme de classe

![image](https://user-images.githubusercontent.com/96893314/198715254-29d17210-0ad3-4f50-910f-62a619c0c014.png)


## Structure de projet
- patterns
  - strategy
    - ITraiterStrategy (interface)
    - TraiterStrategyImpl1
    - TraiterStrategyImpl2
  - observer
    - IObserver (interface)
    - IObservable (interface)
- elements
  - Config
  - Drawing (abstract)
  - DrawingGroup
  - Cercle
  - Rectangle
  - Point

## Test
Ci-dessous est un test de notre solution

```java
  public class TestDessin {
    public static void main(String[] args) throws Exception {
        DrawingGroup root = new DrawingGroup();
        root.add(new Cercle(10, new Point(5,2)));
        root.add(new Cercle(5, new Point(4,10)));
        root.add(new Rectangle(10, 15, new Point(15,8)));
        DrawingGroup dg2 = new DrawingGroup();
        root.add(dg2);
        dg2.addFigure(new Rectangle(2, 5, new Point(1,1)));
        dg2.addFigure(new Cercle(8, new Point(0,0)));
        root.printAll();
        Config config = new Config();
        config.add(root);
        config.setBorderWidth(1);
        config.setBorderColor("Black");
        config.setBackgroundColor("Red");
        root.serialize();
    }
  }
```
