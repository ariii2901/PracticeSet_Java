import java.util.Scanner;
public class Practice_Set2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1-7 to check the day: ");
        int day = sc.nextInt();

        switch (day){
            case 1 -> System.out.println("\nMonday");
            case 2 -> System.out.println("\nTuesday");
            case 3 -> System.out.println("\nWednesday");
            case 4 -> System.out.println("\nThursday");
            case 5 -> System.out.println("\nFriday");
            case 6 -> System.out.println("\nSaturday");
            case 7 -> System.out.println("\nSunday");
        }
    }
}
