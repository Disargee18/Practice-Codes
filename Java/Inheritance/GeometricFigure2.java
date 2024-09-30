public abstract class GeometricFigure2 implements SidedObject
{
    double height, width;
    static String figureType;

    public GeometricFigure2(double height, double width, String figureType)
    {
        this.height = height;
        this.width = width;
        this.figureType = figureType;
    }

    public abstract void determineArea();

    public abstract void display();

    public abstract void displaySides();
}