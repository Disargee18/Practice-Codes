import java.util.*;

public class RunDepartment
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many departments: ");
        int departmentNum = sc.nextInt();

        String departments[][] = new String[departmentNum][];

        Department dept = new Department(departments);

        dept.StaffNumber();
        dept.Display();
        dept.Search();
    }


}