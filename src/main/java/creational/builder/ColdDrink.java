package creational.builder;

/**
 * Created by agup101 on 4/24/2017.
 */
abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
