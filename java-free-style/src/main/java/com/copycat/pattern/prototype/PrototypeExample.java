package pattern.prototype;

public class PrototypeExample {
    public static void main(String[] args) {
        Vega carrot = new Carrot("Red Carrot");
        Vega tomato = new Tomato("Small Tomato");
        Vega vega;
        vega = carrot.clone();
        System.out.println(vega.name);
    }
}
