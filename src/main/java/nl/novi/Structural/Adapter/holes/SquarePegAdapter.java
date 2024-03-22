package nl.novi.Structural.Adapter.holes;

public class SquarePegAdapter extends RoundPeg{
    public SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(0); // wat je hier invult is niet belangrijk
        this.peg = peg;
    }

    public int getRadius(){
        return (int) (peg.getWidth() * Math.sqrt(2)/2);
    }
}
