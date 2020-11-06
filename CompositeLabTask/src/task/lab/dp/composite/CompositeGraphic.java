package task.lab.dp.composite;

import java.util.ArrayList;

public class CompositeGraphic implements Graphic {
    private final ArrayList<Graphic> childGraphics = new ArrayList<>();

    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }
    
    @Override
    public void draw() {
        for (Graphic graphic : childGraphics) {
            graphic.draw();
        }
    }
}
