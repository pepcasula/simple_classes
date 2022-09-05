import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(15, calculator.add(7, 8));
    }

    @Test
    public void canSubtract(){
        assertEquals(7, calculator.subtract(15, 8));
        
    }

    @Test
    public void canMultiply(){
        assertEquals(56, calculator.multiply(7, 8));
    }

    @Test
    public void canDivide(){
        assertEquals(3.75, calculator.divide(15.0, 4.0), 0.0);
    }
}
