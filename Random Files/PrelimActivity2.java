import java.util.*;

public class PrelimActivity2
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> employees = new ArrayList<String>();
        int choice;

        do
        {
            System.out.println("---Menu---\n1.Add New Employee\n2.Search an Employee\n3.Update an Employee\n4.Delete an Employee\n5.Display all Employee\n6.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter a new Employee: ");
                    String name = sc.nextLine();
                    employees.add(name);
                    break;
                case 2:
                    System.out.print("Enter Employee to search: ");
                    String search = sc.nextLine();
                    if(employees.contains(search))
                    {System.out.println("Employee Found");}
                    else{System.out.println("Employee Not Found");}
                    break;
                case 3: 
                    System.out.print("Enter Employee Name to Update: ");
                    String update = sc.nextLine();
                    employees.remove(update);
                    System.out.print("Enter new Employee Name: ");
                    String update2 = sc.nextLine();
                    employees.add(update);
                    break;
                case 4:
                    System.out.print("Enter an Employee to delete: ");
                    String delete = sc.nextLine();
                    employees.remove(delete);
                    break;
                case 5:
                    for(int i=0; i<employees.size()-1; i++)
                    {
                        for(int j=0; j<employees.size()-i-1; j++)
                        {
                            if(employees.get(j).compareTo(employees.get(j+1))>0)
                            {
                                String temp = employees.get(j);
                                employees.set(j,employees.get(j+1));
                                employees.set(j+1,temp);
                            }
                        }
                    }
                    for(String employee:employees)
                    {
                        System.out.println(employee);
                    }
                    break;
            }
        }while(choice!=6);
    }
}
//tonghay ni aboy
//tonghay ni aboy
//tonghay ni aboy
//tonghay ni aboy
//tonghay ni aboy
//tonghay ni aboy
//tonghay ni aboy
//tonghay ni aboy

