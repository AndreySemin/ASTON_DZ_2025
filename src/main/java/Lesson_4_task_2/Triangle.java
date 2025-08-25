package Lesson_4_task_2;

public class Triangle implements Shapes{

    private double sideA;

    private double sideB;

    private double sideC;

    private String borderColor;

    private String backgroundColor;

    public Triangle(double sideA, double sideB, double sideC, String borderColor, String backgroundColor){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.borderColor = borderColor;
        this.backgroundColor = backgroundColor;
    }
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        int p = (int) ((sideA + sideB +sideC)/2);
        return  p * (p - sideA) * (p - sideB) * (p - sideC);
    }

    @Override
    public String getBackgroundColor() {
        return backgroundColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}