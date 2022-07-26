import java.util.Scanner;
public class Practice_Set4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any website: ");
        String website = sc.next();
        if (website.endsWith(".org")){
            System.out.println("\nIt's a Organizational website");
        }
        else if (website.endsWith(".in")){
            System.out.println("\nIt's an Indian website");
        }
        else if (website.endsWith(".com")){
            System.out.println("\nIt's a commercial website");
        }
    }
}
