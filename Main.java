import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("You're eligible for Driving");
        }
            else {
            System.out.println("You're not eligible for driving");
        }
    }
}