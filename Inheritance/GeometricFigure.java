public abstract class GeometricFigure
{
    double height, width;
    static String figureType;

    public GeometricFigure(double height, double width, String figureType)
    {
        this.height = height;
        this.width = width;
        this.figureType = figureType;
    }

    public abstract void determineArea();

    public abstract void display();
}