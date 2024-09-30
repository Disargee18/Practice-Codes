

public class Square extends GeometricFigure
{
    double area;

    public Square(double height, double width, String figureType)
    {
        super(height, width,figureType);
    }

    @Override
    public void determineArea()
    {
        area = height*width;
        System.out.println("Area of your square is: "+area);
    }

    public void display()
    {
        System.out.println("Values of your SQUARE: ");
        System.out.println("Height of Square: "+height);
        System.out.println("Width of Square: "+width);
        System.out.println();
        determineArea();
    }
}