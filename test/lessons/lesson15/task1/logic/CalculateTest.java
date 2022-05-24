package lessons.lesson15.task1.logic;

import org.junit.Assert;
import org.junit.Test;

public class CalculateTest {
    @Test
    public void testSum() {
        //arrange
        int a = 10;
        int b = 3;
        int expected = 13;

        //action
        int actial = Calculate.sum(a, b);

        //assert
        if (expected != actial) {
            Assert.fail();
        }
    }


    @Test
    public void testSub() {
        //arrange
        int a = 10;
        int b = 3;
        int expected = 7;

        //action
        int actial = Calculate.sub(a, b);

        //assert
        if (expected != actial) {
            Assert.fail();
        }
    }

    @Test
    public void testMul() {
        //arrange
        int a = 10;
        int b = 3;
        int expected = 30;

        //action
        int actial = Calculate.multi(a, b);

        //assert
        if (expected != actial) {
            Assert.fail();
        }
    }


    @Test
    public void testDiv() {
        //arrange
        int a = 10;
        int b = 3;
        int expected = 3;

        //action
        int actial = Calculate.div(a, b);

        //assert
        if (expected != actial) {
            Assert.fail();
        }
    }


    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {
        //arrange
        int a = 10;
        int b = 0;

        //action
        Calculate.div(a, b);

        //assert

    }


    @Test(timeout = 2000)
    public void testMulByTimeout() {
        //arrange
        int a = 10;
        int b = 3;

        //action
        Calculate.div(a, b);

        //assert

    }

}
