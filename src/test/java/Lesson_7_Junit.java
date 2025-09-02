import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static Lesson_7_Junit.Lesson_7_Junit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class Lesson_7_Junit {
    @DisplayName("Факториал числа")
@Test
    void testFactorialZero(){
    assertEquals(BigInteger.valueOf(1), Factorial(0));
}

@Test
    void testFactorialOne(){
    assertEquals(BigInteger.valueOf(1),Factorial(1));
}
@Test
    void testFactorialNegative(){
    assertThrows(IllegalAccessError.class,()->Factorial(-1));
}

@DisplayName("Площадь треугольника")

@Test
void testArea(){
        assertEquals(25,Area(10,5) );
    }

@DisplayName("Остаток от деление")
@Test
void testDivision(){
        assertEquals(BigInteger.valueOf(0),ArithmeticOperations.Division(100,50));
}
@DisplayName("Сложение")
    @Test
    void testSum(){
        assertEquals(BigInteger.valueOf(150),ArithmeticOperations.SumТumbers(100,50));
    }

    @DisplayName("Умножение")
    @Test
    void testMulti(){
        assertEquals(BigInteger.valueOf(4),ArithmeticOperations.Multiplication(2,2));
    }
@DisplayName("Вычитание")
    @Test
    void testCalculation(){
        assertEquals(BigInteger.valueOf(0),ArithmeticOperations.Calculation(50,50));
}
@DisplayName("Сравнение")
@Test

    void test(){
    Assertions.assertFalse(FirstSecondNimber(5,5));
}


}






