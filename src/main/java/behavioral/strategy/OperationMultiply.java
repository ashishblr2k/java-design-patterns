package behavioral.strategy;

/**
 * Created by agup101 on 4/24/2017.
 */
class OperationMultiply implements Strategy{

    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
