import java.util.*;

public class Accounts
{
    String[][] accounts;
    Scanner sc = new Scanner(System.in);

    public Accounts(String[][] accounts)
    {
        this.accounts = accounts;
    }

    public void Prompter()
    {
        for(int j=0; j<5; j++)
        {
            System.out.print("Enter Account Name: ");
            accounts[j][0]=sc.nextLine();
        }

        for(int j=0; j<5; j++)
        {
            System.out.print("Enter Account Number: ");
            accounts[j][1]=sc.nextLine();
        }

        for(int j=0; j<5; j++)
        {
            System.out.print("Enter Account Balance: ");
            accounts[j][2]=sc.nextLine();
        }
    }

    public void Search()
    {
        System.out.println();
        System.out.print("Enter account name to search: ");
        String searching = sc.nextLine();
        boolean found = false;
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<3; j++)
            {
                if(accounts[i][j].equals(searching))
                {
                    System.out.println("Account Name: "+accounts[i][j]);
                    System.out.println("Account Number: "+accounts[i][j+1]);
                    System.out.println("Account Balance: "+accounts[i][j+2]);
                    found = true;
                }
            }
        }
        if(!found)
        {
            System.out.print("Wala dre");
        }
    }

    public void Display()
    {
        System.out.println();
        double total=0;
        for(int i=0; i<5; i++)
        {
            System.out.println("Account Name: "+accounts[i][0]);
            System.out.println("Account Number: "+accounts[i][1]);
            System.out.println("Account Balance: "+accounts[i][2]);
            System.out.println();
            total+=Double.parseDouble(accounts[i][2]);

            

        }
        System.out.printf("%.2f",total);
    }
}