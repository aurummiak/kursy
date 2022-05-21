package Lessons.lesson18.oopexampletask.model.logic;

import Lessons.lesson18.oopexampletask.model.entity.Flower;

public class ShopAssistance {
    public static final double LABOR_PERCENT = 0.1;

    public static double calculateTotalPrice(Flower[] flowers) {

        if (flowers == null || flowers.length == 0) {
            return 0;
        }

        double total = 0.0;

        for (Flower flower : flowers) {
            total += flower.getPrice();
        }

        return total + total * LABOR_PERCENT;
    }

    public static double calculateTotalWeight(Flower[] flowers) {

        if (flowers == null || flowers.length == 0) {
            return 0;
        }

        double total = 0.0;

        for (Flower flower : flowers) {
            total += flower.getWeight();
        }

        return total;
    }

    private static int getMaxLength(Flower[] flowers) {
        int max = flowers[0].getLength();
        for (Flower flower : flowers) {
            if (flower.getLength() > max) {
                max = flower.getLength();
            }
        }
        return max;
    }

    private static int countFlowersWithMaxLength(Flower[] flowers, int max) {
        int count = 0;

        for (Flower flower : flowers) {
            if (flower.getLength() == max) {
                count++;
            }
        }

        return count;
    }


    public static Flower[] findMaxLengthFlowers(Flower[] flowers) {

        int maxLength = getMaxLength(flowers);
        int count = countFlowersWithMaxLength(flowers, maxLength);

        Flower[] result = new Flower[count];

        int i = 0;
        for (Flower flower : flowers) {
            if (flower.getLength() == maxLength) {
                result[i] = flower;
                i++;
            }
        }

        return result;
    }

}
