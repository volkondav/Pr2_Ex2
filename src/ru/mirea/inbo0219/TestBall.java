package ru.mirea.inbo0219;

public class TestBall {
    public static void main(String[] args) {

        Ball b1 = new Ball(1.4,20.67);

        System.out.println(b1);

        b1.setX(100.01);
        b1.setY(100000.2222);
        b1.setXY(2,3);

        b1.move(1,2);

        System.out.println(b1);
    }
}
