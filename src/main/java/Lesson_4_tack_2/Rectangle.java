package Lesson_4_tack_2;

public class Rectangle implements Shapes{

    private double heignt;

    private double width;

    private String backgroundColor;

    private String borderColor;

    public Rectangle(double heignt , double width, String backgroundColor, String borderColor){
        this.width = width;
        this.heignt = heignt;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }


    @Override
    public double getPerimeter() {

        return (heignt + width)*2;
    }

    @Override
    public double getArea() {
        return heignt * width;
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