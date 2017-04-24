package creational.prototype;

/**
 * Created by agup101 on 4/24/2017.
 */
class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
