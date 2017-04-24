package creational.builder;

/**
 * Created by agup101 on 4/24/2017.
 */
class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    public String name() {
        return "Chicken Burger";
    }
}
