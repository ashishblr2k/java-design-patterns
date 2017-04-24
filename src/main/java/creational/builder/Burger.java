package creational.builder;

/**
 * Created by agup101 on 4/24/2017.
 */
abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
