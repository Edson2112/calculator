package ua.edson.calculator;

public class IntegerCalculator implements Calculator<Integer> {

    @Override
    public Integer sum(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer minus(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public Integer division(Integer a, Integer b) {
        return a / b;
    }
}
