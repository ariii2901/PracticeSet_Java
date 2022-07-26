import java.util.Scanner;
public class Practice_Set1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tax = 0, income;
        System.out.print("Enter your tax amount: ");
        income = sc.nextFloat();
        if (income<2.5f){
            tax = tax + 0;
        }
        else if (income>2.5f && income<=5.0f){
            tax = tax + 0.05f * (income);
        }
        else if (income>5.0f && income<=10.0f){
            tax = tax + 0.2f * (income);
        }
        else if (income>10.0f){
            tax = tax + 0.3f * (income);
        }
        System.out.println("\nTotal amount is paid by employee is: " + tax);
    }
}
