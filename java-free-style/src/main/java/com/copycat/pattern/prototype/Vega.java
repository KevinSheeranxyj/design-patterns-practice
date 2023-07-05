package pattern.prototype;

public class Vega implements Cloneable {

    private int price;

    public String name;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    protected Vega clone() {
        try {
            Vega clone = (Vega) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
