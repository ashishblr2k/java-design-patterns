package creational.prototype;

/**
 * Created by agup101 on 4/24/2017.
 */
class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
