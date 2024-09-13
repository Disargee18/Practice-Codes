import java.util.*;

public class Run_Accounts
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String accounts[][] = new String[5][3];

        Accounts acc = new Accounts(accounts);

        acc.Prompter();
        acc.Search();
        acc.Display();
    }

}