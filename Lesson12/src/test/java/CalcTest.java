import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {
    @Test
    public void testSumm(){
        Assert.assertEquals(Calculator.summ(10, 5), 15);
    }

    @Test
    public void testSubtract(){
        Assert.assertEquals(Calculator.subtract(10, 5), 5);
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(Calculator.multiply(2, 5), 10);
    }

    @Test
    public void testDivision(){
        Assert.assertEquals(Calculator.divide(10, 5), 2);
    }

    @Test
    public void testException(){
        Calculator.divide(10, 0);
    }
}
