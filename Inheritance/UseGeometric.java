import java.util.*;

public class UseGeometric
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        GeometricFigure[] gf = new GeometricFigure[5];

        double height,width;


        for(int i = 0; i<5; i++)
        {   
            System.out.println("Enter S for Square\nEnter T for Triangle");
            String choice = sc.nextLine();
            if(choice.equals("s")||choice.equals("S"))
            {
                System.out.print("Enter Height for Square: ");
                height=sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter Width for Square: ");
                width=sc.nextDouble();
                gf[i] = new Square(height, width,"Square");
                System.out.println();

            }
            else if(choice.equals("t")||choice.equals("T"))
            {
                System.out.print("Enter Height for Triangle: ");
                height=sc.nextDouble();
                System.out.print("Enter Width for Triangle: ");
                width=sc.nextDouble();
                gf[i] = new Triangle(height, width,"Triangle");
                System.out.println();

            }
            sc.nextLine();
        }

        for(int i=0; i<5; i++)
        {
            gf[i].display();
            System.out.println();
        }
    }
}