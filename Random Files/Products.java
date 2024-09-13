import java.util.*;

public class Products
{
    String productnPrice[][] = new String[5][2];
    Scanner sc = new Scanner(System.in);

    public void populate()
    {
        for(int i=0; i<productnPrice.length; i++)
        {
            System.out.print("Enter Product Name: ");
            productnPrice[i][0] = sc.nextLine();
            System.out.print("Enter Product Price: ");
            productnPrice[i][1] = sc.nextLine();
        }
    }

    public void search()
    {
        System.out.print("Enter Product to search: ");
        String search = sc.nextLine();
        boolean found = false;

        for(int i=0; i<productnPrice.length; i++)
        {
            if(search.equals(productnPrice[i][0]))
            {
                System.out.print(productnPrice[i][0]+" is found.");
                found=true;
            }
        }
        if(!found)
        {
            System.out.println(search+" is not found.");
        }
    }

    public void display()
    {
        int totalPrices=0; 

        for(int i=0; i<productnPrice.length; i++)
        {
            System.out.println(productnPrice[i][0]+" : "+productnPrice[i][1]);
            totalPrices+=Integer.parseInt(productnPrice[i][1]);
        }
        System.out.print("The total Price of all Products is: "+totalPrices);
    }


}