import java.util.Scanner;
public class LibraryManagement {
    public static void main(String[] args) {
        do{
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number of Books");
        int noOfBook=sc.nextInt();
        //switch case
        int calculate=0;
        for (int i = 0; i < noOfBook; i++) {
                System.out.println("Enter book type (1. Regular, 2. Reference, 3. Magazine):");
        int bookType = sc.nextInt();
                String categoryName;
        switch (bookType) {
            case 1:
                categoryName = "Regular";
                break;
            case 2:
                categoryName = "Reference";
                break;
            case 3:
                categoryName = "Magazine";
                break;
            default:
                categoryName = "Invalid";
                System.out.println("Enter a valid type of book!");
        }
        System.out.println("You selected: " + categoryName);
                    //if-else case
                System.out.println("enter the no of days you are late: ");
                int n=sc.nextInt();
                if(n>=1 && n<=5){
                    System.out.println("your fine is calculated by: rupees 10/day");
                    calculate+=n*10;
                    
                }else if(n>=6 && n<=10){
                    System.out.println("your fine is calculated by: rupees 20/day");
                    calculate+=n*20;
                    
                }else{
                    System.out.println("your fine is calculated by: rupees 50/day");
                    calculate+=n*50;
                    
                }
                System.out.println("your fine is : "+calculate);
        }
    } while(true);
    }
}
