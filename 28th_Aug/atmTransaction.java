import java.util.*;
public class atmTransaction {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        ArrayList<Integer>arr=new ArrayList<>();
        int total=0;
        while(true)
        {
            System.out.println("Enter the amount");
            int amount=sc.nextInt();
            if(total>=0)
            {
                arr.add(amount);
                total+=amount;
            }
            else{
                System.out.println("Overdraft");
                return;
            }
        }
    }
}
