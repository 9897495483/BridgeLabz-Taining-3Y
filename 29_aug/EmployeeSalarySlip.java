import java.util.*;
public class EmployeeSalarySlip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr1=new int[5];
        String[]arr2=new String[5];
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter Employee name: ");
            arr2[i]=sc.nextLine();
            System.out.println("Enter Basic Salary: ");
            arr1[i]=sc.nextInt();
             sc.nextLine();
        }
        for(int i=0;i<5;i++)
        {
            int HRA=arr1[i]*20/100;
            int DA=arr1[i]*10/100;
            int Net_Salary=arr1[i]+HRA+DA;
            if(arr1[i] > 50000)
            {
                Net_Salary+=Net_Salary*10/100;
            }
            System.out.println("Salary Slip For "+arr2[i]);
            System.out.println(" HRA is : "+HRA);
            System.out.println(" DA is : "+DA);
        System.out.println(" Net Salary is : "+Net_Salary);
        }
    }
}
