import java.util.*;

public class benedict
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row\n ");
        int row=s.nextInt();
        System.out.println("Enter column\n ");
        int col=s.nextInt();

        int[][] arr = new int[row][col];

        veejay p = new veejay(row,col,arr);
        p.populate(s);
        p.printing();


        

    }
}