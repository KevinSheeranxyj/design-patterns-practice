package pattern.prototype;

public class Carrot extends Vega {

    public Carrot(String m) {
        name = m;
    }

    @Override
    protected Vega clone() {
        return super.clone();
    }
}
