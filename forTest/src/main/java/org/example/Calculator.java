package org.example;

public class Calculator {
    /**
     * Вычисление суммы двух чисел
     * @param a первое число
     * @param b второе число
     * @return сумма чисел
     */
    public int add(int a, int b){
        return a + b;
    }

    /**
     * Деление двух чисел
     * @param a первое число
     * @param b второе число
     * @return результат деления
     */
    public double div (int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception(" Div by 0");
        }
        return (double) a / b;
    }
}
