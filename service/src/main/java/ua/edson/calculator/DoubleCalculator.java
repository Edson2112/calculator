package ua.edson.calculator;

public class DoubleCalculator implements Calculator<Double> {

    @Override
    public Double sum(Double a, Double b) {
        return a + b;
    }

    @Override
    public Double minus(Double a, Double b) {
        return a - b;
    }

    @Override
    public Double multiply(Double a, Double b) {
        return a * b;
    }

    @Override
    public Double division(Double a, Double b) {
        return a / b;
    }
}
