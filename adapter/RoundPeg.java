package adapter;


class RoundPeg {
    private double radius;
    
    public RoundPeg(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public String toString() {
        return "RoundPeg: radius = " + radius;
    }
}