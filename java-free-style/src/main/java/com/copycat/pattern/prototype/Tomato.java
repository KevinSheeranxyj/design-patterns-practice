package pattern.prototype;

public class Tomato extends Vega {

    public int price;

    public Tomato(String m) {
        name = m;
    }

    @Override
    protected Vega clone() {
        return super.clone();
    }
}
