import java.util.Scanner;
public class Practice_Set3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        // Leap year can be divisible by 400
        if (year % 400 ==0){
            System.out.println("\nYear " + year + " is a Leap year.");
        }
        // Not a leap year if divisible by 100 but not divisible by 400
        else if (year % 100 ==0){
            System.out.println("\nYear " + year + " is not a Leap year.");
        }
        // Leap year if not divisible by 100 but with 4
        else if (year % 4 ==0){
            System.out.println("\nYear " + year + " is a Leap year.");
        }
        else {
            System.out.println("\nYear " + year + " is not a Leap year.");
        }
    }
}
