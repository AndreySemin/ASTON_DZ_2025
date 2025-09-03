package Lesson_7_TestNg;

import java.math.BigInteger;

public class Lesson_7_TestNg {
    //1. Фокториал числа

    public static BigInteger Factorial(int f) {
        if (f < 0) {
            throw new IllegalArgumentException("Факториал должен быть больше нуля");

        }
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= f; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    //2. Площадь треуголиника

    public static double Area(double h, double b) {
        double y = (h * b)/2;
        return y;

    }


    //3. Cовершающую арифметические действия с двумя целыми числами (сложение, вычитание, деление и умножение);

    public static class ArithmeticOperations {


        private int x;
        private int y;

        public static BigInteger Division(int x, int y) {
            if (x <= 0 | y <= 0) {
                throw new IllegalArgumentException("Делить на ноль нельзя");
            }
            BigInteger big1 = new BigInteger(String.valueOf(x));
            BigInteger big2 = new BigInteger(String.valueOf(y));
            BigInteger rem = big1.remainder(big2);
            return rem;
        }

        public static BigInteger SumТumbers(int x, int y) {
            BigInteger big1 = new BigInteger(String.valueOf(x));
            BigInteger big2 = new BigInteger(String.valueOf(y));
            BigInteger sum = big1.add(big2);
            return sum;
        }

        public static BigInteger Multiplication(int x, int y) {
            BigInteger big1 = new BigInteger(String.valueOf(x));
            BigInteger big2 = new BigInteger(String.valueOf(y));
            BigInteger multi = big1.multiply(big2);
            return multi;
        }

        public static BigInteger Calculation(int x, int y) {
            BigInteger big1 = new BigInteger(String.valueOf(x));
            BigInteger big2 = new BigInteger(String.valueOf(y));
            BigInteger mod = big1.mod(big2);
            return mod;
        }
    }

    public static boolean FirstSecondNimber (int x, int y){
        if (x != y){
            throw new IllegalArgumentException("Числа не равны ");}
        return false;
    }

}

