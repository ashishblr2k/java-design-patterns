package creational.prototype;

/**
 * Created by agup101 on 4/24/2017.
 */
class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

