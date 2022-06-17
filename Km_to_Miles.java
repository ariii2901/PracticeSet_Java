import java.util.Scanner;
public class Km_to_Miles {
    public static void main(String[] args) {
        float KM; double Mile;
        Scanner tk = new Scanner(System.in);
        System.out.println("Welcome to Kilometer to Miles conversion");
        System.out.print("Kilometer: ");
        KM = tk.nextFloat(); Mile = (KM * 0.621371);
        System.out.print("Miles: "+Mile);
    }
}
