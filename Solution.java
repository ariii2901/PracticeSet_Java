import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        if (n%2==1 || n>=6 && n<=20){
            System.out.println("Weird");
        }
        else if (n%2==0 || n>=2 && n<=5){
            System.out.println("Not Weird");
        }
        else {
            System.out.println("Not Weird");
        }
    }
}