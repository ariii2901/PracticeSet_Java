import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ubl;
        System.out.println("Enter A for Nokia 6.1");
        System.out.println("Enter B for Nokia 6.1 Plus");
        System.out.println("Enter C for Nokia 7 Plus");
        System.out.println("Enter D for Nokia 8 Sirocco");
        System.out.print("\nEnter your choice here: ");
        ubl = in.next().charAt(0);

        switch (ubl) {
            case 'A' -> System.out.println("\nLet's Unlock your Nokia 6.1 Bootloader");
            case 'B' -> System.out.println("\nLet's Unlock your Nokia 6.1 Plus Bootloader");
            case 'C' -> System.out.println("\nLet's Unlock your Nokia 7 Plus Bootloader");
            case 'D' -> System.out.println("\nLet's Unlock your Nokia 8 Sirocco Bootloader");
            default -> System.out.println("\nPlease enter the correct choice number");
        }

        System.out.println("\nThanks for using my bootloader unlock tool");

    }
}
