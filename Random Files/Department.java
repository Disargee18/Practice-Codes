import java.util.*;

public class Department
{   
    String departments[][];
    int staffNum;
    Scanner sc = new Scanner(System.in);

    public Department(String[][] departments)
    {
        this.departments = departments;
    }
    
    public void StaffNumber()
    {
        for(int i=0; i<departments.length; i++)
        {
            System.out.printf("Enter %d department name: ",i+1);
            String deptName = sc.nextLine();

            System.out.printf("How many staffs in "+deptName+":");
            staffNum = sc.nextInt();
            staffNum+=1;

            departments[i] = new String[staffNum];
            departments[i][0]=deptName;
            sc.nextLine();

            System.out.println();

            for(int j=1; j<staffNum; j++)
            {
                System.out.printf("Enter Staff Names:");
                departments[i][j] = sc.nextLine();

            }
            System.out.println();
        }
    }

    public void Display()
    {   
        System.out.println();
        for(int i=0; i<departments.length; i++)
        {
            System.out.print("Staffs of Department "+departments[i][0]+":");
            System.out.println();
            for(int j=1; j<departments[i].length; j++)
            {
                System.out.print(departments[i][j]);
                System.out.println();
            }
            System.out.println();
        }
    }

    public void Search()
    {   
        System.out.print("Enter staff to search: ");
        String staffName = sc.nextLine();
        boolean found = false;
        String container=null;

        for(int i=0; i<departments.length; i++)
        {
            for(int j=1; j<departments[i].length; j++)
            {
                if(staffName.equals(departments[i][j]))
                {
                    found = true;
                    container = departments[i][0];
                }
            }
        }
        if(found)
        {
            System.out.print(staffName+" is a staff in "+container+" department");
        }
        else{System.out.print("no");}
    }
}