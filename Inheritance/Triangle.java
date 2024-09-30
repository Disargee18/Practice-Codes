public class Triangle extends GeometricFigure
{
    double area;

    public Triangle(double height, double width, String figureType)
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
}