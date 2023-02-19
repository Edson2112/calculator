package ua.edson.calculator;

public interface Calculator<T extends Number> {

    T sum(T a, T b);
    T minus(T a, T b);
    T multiply(T a, T b);
    T division(T a, T b);
}
