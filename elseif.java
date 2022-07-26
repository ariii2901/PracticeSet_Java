import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age = in.nextInt();
        System.out.println("\nYou entered age " + age );
        if (age>=60){
            System.out.println("\nYou're experienced");
        }
        else if (age>=50){
            System.out.println("\nYou're semi experienced");
        }
        else if (age>=40){
            System.out.println("\nYou're semi-semi experienced");
        }
        else {
            System.out.println("\nYou're not experienced");
        }
    }
}
