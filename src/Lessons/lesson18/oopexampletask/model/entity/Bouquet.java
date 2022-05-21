package Lessons.lesson18.oopexampletask.model.entity;

public class Bouquet {
    private Flower[] flowers;

    // add
    // remove
    // size
    // get
    // toString

    public Bouquet() {
        flowers = new Flower[0];
    }

    public Bouquet(Flower[] flowers) {
        if (flowers != null) {
            this.flowers = flowers;
        } else {
            flowers = new Flower[0];
        }

    }

    public int size() {
        return flowers.length;
    }

    public Flower get(int index) {
        if (index >= 0 && index < flowers.length) {
            return flowers[index];
        } else {
            return null;
        }
    }

    public void add(Flower flower) {
        Flower[] temp = new Flower[flowers.length + 1];
        int i = 0;
        for (; i < flowers.length; i++) {
            temp[i] = flowers[i];

        }
        temp[i] = flower;
        flowers = temp;

    }

    public void remove(Flower flower) {
        Flower[] temp = new Flower[flowers.length - 1];
        boolean flag = false;

        for (int i = 0, j = 0; i < flowers.length; i++) {
            if (flag || (flowers[i].getLength() != flower.getLength() || flowers[i].getWeight() != flower.getWeight() ||
                    flowers[i].getPrice() != flower.getPrice() || !flowers[i].getName().equals(flower.getName())
                    || !flowers[i].getColor().equals(flower.getColor()))) {
                temp[j] = flowers[i];
                j++;
            } else {
                flag = true;
            }

        }

        flowers = temp;

    }


    public void remove(int index) {
        Flower[] temp = new Flower[flowers.length - 1];
        boolean flag = false;

        for (int i = 0, j = 0; i < flowers.length; i++) {
            if (index != i) {
                temp[j] = flowers[i];
                j++;
            }
        }

        flowers = temp;

    }


}
