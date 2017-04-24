package creational.builder;

/**
 * Created by agup101 on 4/24/2017.
 */
class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    public String name() {
        return "Pepsi";
    }
}
