package lessons.lesson18.oopexampletask.model.logic;

import lessons.lesson18.oopexampletask.model.entity.Bouquet;
import lessons.lesson18.oopexampletask.model.entity.Flower;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShopAssistanceTest {


    @Test
    public void testCalculateTotalPricePositive() {
        Flower[] flowers = {
                new Flower("Rose", "red", 3.00, 100.00, 100),
                new Flower("Rose", "red", 3.00, 100.00, 100),
                new Flower("Rose", "red", 3.00, 100.00, 100),

        };
        Bouquet bouquet = new Bouquet(flowers);
        double expected = (ShopAssistance.LABOR_PERCENT + 1) * 9;

        double actual = ShopAssistance.calculateTotalPrice(bouquet);

        assertEquals(expected, actual, 0.01);

    }

    @Test
    public void testCalculateTotalPriceWithNull() {
        double expected = 0.0;
        double actual = ShopAssistance.calculateTotalPrice(null);
        assertEquals(expected, actual, 0.0);

    }

    @Test
    public void testCalculateTotalPriceWithEmpty() {
        Flower[] flowers = {};
        Bouquet bouquet = new Bouquet(flowers);

        double expected = 0.0;

        double actual = ShopAssistance.calculateTotalPrice(bouquet);

        assertEquals(expected, actual, 0.0);

    }


    @Test
    public void testCalculateTotalWeightPositive() {
        Flower[] flowers = {
                new Flower("Rose", "red", 3.00, 100.00, 100),
                new Flower("Rose", "red", 3.00, 100.00, 100),
                new Flower("Rose", "red", 3.00, 100.00, 100),

        };
        Bouquet bouquet = new Bouquet(flowers);

        double expected = 300.0;

        double actual = ShopAssistance.calculateTotalWeight(bouquet);

        assertEquals(expected, actual, 0.1);

    }


    @Test
    public void testCalculateTotalWeightWithNull() {
        double expected = 0.0;
        double actual = ShopAssistance.calculateTotalWeight(null);
        assertEquals(expected, actual, 0.0);

    }

    @Test
    public void testCalculateTotalWeightWithEmpty() {
        Flower[] flowers = {};
        Bouquet bouquet = new Bouquet(flowers);
        double expected = 0.0;

        double actual = ShopAssistance.calculateTotalWeight(bouquet);

        assertEquals(expected, actual, 0.0);

    }

    @Test
    public void testFirstFindFlowerWithMaxLengthPositive() {
        Flower[] flowers = {
                new Flower("Rose", "red", 3.00, 100.00, 100),
                new Flower("Rose", "red", 3.00, 100.00, 75),
                new Flower("Rose", "red", 3.00, 100.00, 50),

        };
        Bouquet bouquet = new Bouquet(flowers);
        Flower[] expected = {new Flower("Rose", "red", 3.00, 100.00, 100)};

        Flower[] actual = ShopAssistance.findMaxLengthFlower(bouquet);

        for (int i = 0; i < expected.length; i++) {
            if (expected[i].getLength() != actual[i].getLength() || expected[i].getWeight() != actual[i].getWeight() ||
                    expected[i].getPrice() != actual[i].getPrice() || !expected[i].getName().equals(actual[i].getName())
                    || !expected[i].getColor().equals(actual[i].getColor())) {
                fail();
            }
        }

//        assertArrayEquals(expected, actual);
    }


    @Test
    public void testSecondFindFlowerWithMaxLengthPositive() {
        Flower[] flowers = {
                new Flower("Rose", "red", 3.00, 100.00, 100),
                new Flower("Rose", "red", 3.00, 100.00, 100),

        };
        Bouquet bouquet = new Bouquet(flowers);
        Flower[] expected = {new Flower("Rose", "red", 3.00, 100.00, 100)};

        Flower[] actual = ShopAssistance.findMaxLengthFlower(bouquet);

        for (int i = 0; i < expected.length; i++) {
            if (expected[i].getLength() != actual[i].getLength() || expected[i].getWeight() != actual[i].getWeight() ||
                    expected[i].getPrice() != actual[i].getPrice() || !expected[i].getName().equals(actual[i].getName())
                    || !expected[i].getColor().equals(actual[i].getColor())) {
                fail();
            }
        }

    }
}
