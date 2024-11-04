package adapter;
// import maths
import java.lang.Math;

public class SquarePegAdapter extends RoundPeg {

    public SquarePegAdapter(SquarePeg peg) {
        super(peg.getWidth() * Math.sqrt(2) / 2);
    }

}