package creational.abstractfactory;

/**
 * Created by agup101 on 4/24/2017.
 */
abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}