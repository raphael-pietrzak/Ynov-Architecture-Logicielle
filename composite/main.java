package composite;

public class main {
    public static void main(String[] args) {
        CompoundGraphic all = new CompoundGraphic(1, 2);
        all.add(new Dot(1, 2));
        all.add(new Circle(5, 3, 10));
        CompoundGraphic comp = new CompoundGraphic(3, 4);
        comp.add(new Dot(2, 3));
        comp.add(new Circle(4, 4, 2));
        all.add(comp);
        all.draw();

        all.move(10, 10);

        all.draw();
    }
}
