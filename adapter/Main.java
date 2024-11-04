
// main.java
package adapter;

public class Main {
    public static void main(String[] args) {
        RoundPeg rp = new RoundPeg(5);
        RoundHole rh = new RoundHole(5);
        SquarePeg sp = new SquarePeg(9);
        SquarePegAdapter spa = new SquarePegAdapter(sp);

        System.out.println(rp.toString());
        System.out.println(rh.toString());
        System.out.println(sp.toString());
        System.out.println(spa.toString());

        System.out.println(rh.fits(rp));
        System.out.println(rh.fits(spa));

    }

}

//  run bash : 
//  javac main/Main.java