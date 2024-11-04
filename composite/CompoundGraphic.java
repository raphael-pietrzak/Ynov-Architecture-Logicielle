package composite;

import java.util.ArrayList;

public class CompoundGraphic implements Graphic{

    private int x;
    private int y;
    private ArrayList<Graphic> children = new ArrayList<Graphic>();


    public CompoundGraphic(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        for (Graphic child : children) {
            child.move(x, y);
        }
    }

    public void draw() {
        for (Graphic child : children) {
            child.draw();
        }
    }

    public void add(Graphic child) {
        children.add(child);
    }

    public void remove(Graphic child) {
        children.remove(child);
    }

    
}
