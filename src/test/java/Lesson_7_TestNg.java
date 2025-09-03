import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;

import static Lesson_7_TestNg.Lesson_7_TestNg.Area;
import static Lesson_7_TestNg.Lesson_7_TestNg.*;

public class Lesson_7_TestNg {
    @Description("Факториал цисла")
    @Test
    public void testFactorialZero(){
        Assert.assertEquals(BigInteger.valueOf(1),Factorial(0));
    }

    @Test
    public void testFactorialOne(){
        Assert.assertEquals(BigInteger.valueOf(1),Factorial(1));
    }
    @Test
    public void testFactorialNegative(){
        Assert.assertThrows(IllegalAccessError.class,()->Factorial(-1));
    }

    @Description("Площадь трейгольника")
    @Test
    public void testArea(){
        Assert.assertEquals(25,Area(5,10));
    }
    @Description("Остаток от деления")
    @Test
    public void testDivision(){
        Assert.assertEquals(BigInteger.valueOf(0), ArithmeticOperations.Division(100,50));
    }
    @Description("Сумма чисел")
    @Test
    public void sumNumbers(){
        Assert.assertEquals(BigInteger.valueOf(20),ArithmeticOperations.SumТumbers(10,10));
    }
    @Description("Умножение")
    @Test
    public void testMylti(){
        Assert.assertEquals(BigInteger.valueOf(4),ArithmeticOperations.Multiplication(2,2));
    }
    @Description("Сложение")
    @Test
    public void testAddition(){
        Assert.assertEquals(BigInteger.valueOf(0),ArithmeticOperations.Calculation(10,10));
    }
    @Description("Сравнение чисел")
    @Test
    public void test(){
        Assert.assertFalse(FirstSecondNimber(5,5));
    }





}
