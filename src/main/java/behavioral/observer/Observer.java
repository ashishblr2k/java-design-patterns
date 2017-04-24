package behavioral.observer;

/**
 * Created by agup101 on 4/24/2017.
 */
abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
