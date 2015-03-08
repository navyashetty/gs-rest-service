package hello;

public class Adder {

    private final long x;
    private final long y;
    private final long sum;

    public Adder(long x, long y) {
        this.x = x  ;
        this.y = y  ;
        this.sum = this.x + this.y  ;
    }

    public long getX() {
        return x ;
    }

    public long getY() {
        return y ;
    }

    public long getSum() {
        return sum ;
    }
}
