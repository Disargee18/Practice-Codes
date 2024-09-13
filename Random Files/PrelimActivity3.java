import java.util.*;

public class PrelimActivity3
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        ArrayList<String> employees = new ArrayList<String>();
        
        
        do
        {
            System.out.println("---Menu---\n1.Add New Employee\n2.Search an Employee\n3.Update an Employee\n4.Delete an Employee\n5.Display Employees\n6.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter a new Employee: ");
                    String newEmp = sc.nextLine();
                    employees.add(newEmp);
                    break;
                case 2:
                    System.out.print("Search an employee: ");
                    String searchEmp = sc.nextLine();
                    if(employees.contains(searchEmp))
                    {
                        System.out.println("Found");
                    }
                    else{System.out.println("Not Found");}
                    break;
                case 3:
                    System.out.print("Enter employee to update: ");
                    String updEmp = sc.nextLine();
                    if(employees.contains(updEmp))
                    {
                        employees.remove(updEmp);
                        System.out.print("Enter new employee: ");
                        updEmp = sc.nextLine();
                        employees.add(updEmp);
                    }
                    else{System.out.println("Not Found");}
                    break;
                case 4:
                    System.out.print("Enter employee to delete: ");
                    String delEmp = sc.nextLine();
                    employees.remove(delEmp);
                    break;
                case 5:
                    for(int i=0; i<employees.size()-1; i++)
                    {
                        for(int j=0; j<employees.size()-i-1; j++)
                        {
                            if(employees.get(j).compareToIgnoreCase(employees.get(j+1))>0)
                            {
                                String temp = employees.get(j);
                                employees.set(j, employees.get(j+1));
                                employees.set(j+1,temp);
                            }
                        }
                    }
                    for(String employee:employees)
                    {
                        System.out.println(employee);
                    }
                    break;
                case 6:
                    System.out.print("Code Ending....");
                    break;
                default:
                    System.out.print("Invalid Choice");
                    break;
            }
        }while(choice!=6);
        


    }   
}
