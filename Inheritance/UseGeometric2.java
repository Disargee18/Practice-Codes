import java.util.*;

public class UseGeometric2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        GeometricFigure2[] gf = new GeometricFigure2[5];

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
                gf[i] = new Square2(height, width,"Square");
                System.out.println();

            }
            else if(choice.equals("t")||choice.equals("T"))
            {
                System.out.print("Enter Height for Triangle: ");
                height=sc.nextDouble();
                System.out.print("Enter Width for Triangle: ");
                width=sc.nextDouble();
                gf[i] = new Triangle2(height, width,"Triangle");
                System.out.println();

            }
            sc.nextLine();
        }

        for(int i=0; i<5; i++)
        {
            System.out.println(i+1);
            gf[i].display();
            System.out.println();
            gf[i].displaySides();
            System.out.println();
        }
    }
}