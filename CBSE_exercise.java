import java.util.Scanner;
public class CBSE_exercise {
    public static void main(String[] args) {
        float Math, Phy, Chem, Bio, Eng, sum;   //All subject variables
        float Mf, Pf, Cf, Bf, Ef, Percentage;   //All are percentage variables
        int total = 500, totalM = 100;          // 1) total ==> it's stand for all 5 subject,
                                                // 2) totalM ==> stands for per subject full marks.
        Scanner mrk = new Scanner(System.in);
        System.out.print("Marks in Maths: ");
        Math = mrk.nextFloat();
        Mf = (Math/totalM)*100;
        System.out.print("Marks in Phy: ");
        Phy = mrk.nextFloat();
        Pf = (Phy/totalM)*100;
        System.out.print("Marks in Chem: ");
        Chem = mrk.nextFloat();
        Cf = (Chem/totalM)*100;
        System.out.print("Marks in Bio: ");
        Bio = mrk.nextFloat();
        Bf = (Bio/totalM)*100;
        System.out.print("Marks in Eng: ");
        Eng = mrk.nextFloat();
        Ef = (Eng/totalM)*100;

            //Calculation
        sum = Math + Phy + Chem + Bio + Eng;
        Percentage = (sum/total)*100;

            //Outputs
        System.out.print("Total percentage in Maths: ");
        System.out.println(Mf +"%");
        System.out.print("Total percentage in Phy: ");
        System.out.println(Pf +"%");
        System.out.print("Total percentage in Chem: ");
        System.out.println(Cf +"%");
        System.out.print("Total percentage in Bio: ");
        System.out.println(Bf+"%");
        System.out.print("Total percentage in Eng: ");
        System.out.println(Ef +"%");
        System.out.print("Total marks obtained: ");
        System.out.println(sum);
        System.out.print("Total percentage: ");
        System.out.println(Percentage +"%");
    }
}
