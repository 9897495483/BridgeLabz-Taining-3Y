import java.util.*;
public class CricketScoreAnalyzer {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int i=0;
    int[]arr=new int[11];
    int high=0;
    int low =0;
    while(i<11)
    {
        System.out.print("Score of Player"+i+": ");
        arr[i]=sc.nextInt();
        System.out.println();
        if(low>arr[i])
        {
            low=arr[i]
        }
        if(arr[i]>high)
        {
            arr[i]=high
        }
        if(arr[i]<=100)
        {
            System.out.println("Century Scored");
        }
        i++;
    }
    System.out.println("Lowest Score is: "+low);
    System.out.println("Highest Score is:"+high);
}
}
