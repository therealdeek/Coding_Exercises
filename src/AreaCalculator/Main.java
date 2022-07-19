package AreaCalculator;

public class Main
{

    public static void main(String[]args)
    {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5,4));
        System.out.println(area(-1,4));

    }

    public static double area(double radius)
    {
        double circle = (radius * radius) * Math.PI;

        if(radius < 0)
            return -1;

        return circle;
    }
    public static double area(double x, double y)
    {
        double rectangle = x * y;

        if(x < 0 || y < 0)
            return -1;

        return rectangle;
    }
}
