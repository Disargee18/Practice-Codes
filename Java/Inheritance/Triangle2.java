public class Triangle2 extends GeometricFigure2 implements SidedObject
{
    double area;

    public Triangle2(double height, double width, String figureType)
    {
        super(height,width,figureType);
    }

    @Override
    public void determineArea()
    {
        area = 0.5*(height*width);
        System.out.println("Area of your Triangle is: "+area);
    }

    public void display()
    {
        System.out.println("Values of your TRIANGLE: ");
        System.out.println("Height of Triangle: "+height);
        System.out.println("Width of Triangle: "+width);
        System.out.println();
        determineArea();
    }

    public void displaySides()
    {
        System.out.println("This shape has 3 sides");
    }
}