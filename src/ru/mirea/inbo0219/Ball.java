package ru.mirea.inbo0219;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Ball(){}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        System.out.println("Положение X изменено с " + x + " на ");
        this.x = x;
        System.out.println(this.x);
    }

    public double getY() {
        return y;

    }

    public void setY(double y) {
        System.out.println("Положение Y изменено с " + y + " на ");
        this.y = y;
        System.out.println(this.y);
    }

    public void setXY(double x, double y){
        System.out.println("Положение X и Y изменено с " + x + " и "+ y + " на ");
        this.x = x;
        this.y = y;
        System.out.println(this.x + " и " + this.y);
    }

    public void move(double xDisp, double yDisp){
        x += xDisp;
        y += yDisp;
    }

    @Override
    public String toString() {
        return "Мяч " + "по X " + x + " по Y "+y;
    }
}
