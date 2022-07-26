import java.util.Scanner;
public class practice_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Catching the marks
        System.out.print("Enter marks of Maths: ");
        float math = sc.nextInt();
        System.out.print("Enter marks of Physics: ");
        float phy = sc.nextInt();
        System.out.print("Enter marks of Chemistry: ");
        float chem = sc.nextInt();

        //Per sub. total percentage
            //Math
        float sm = (math/25)*100;
        System.out.println("\nTotal percentage obtained for Maths: " + sm+"%");
            //Physics
        float sp = (phy/25)*100;
        System.out.println("Total percentage obtained for Physics: " + sp+"%");
            //Chemistry
        float sch = (chem/25)*100;
        System.out.println("Total percentage obtained for Chemistry: " + sch+"%");

        //Total percentage obtained for all the subjects
        float Total_marks = (math+phy+chem);
        float Total = (Total_marks/75)*100;
        System.out.println("\nTotal percentage obtained for all the subjects are: "+Total+"%");

        //Pass/Fail checking for each subject
        if (sm>=33.0){
            System.out.println("\nMath: Congratulation! you're Pass");
        }
        else {
            System.out.println("\nMath: You're Fail");
        }
        if (sp>=33.0){
            System.out.println("\nPhysics: Congratulation! you're Pass");
        }
        else {
            System.out.println("\nPhysics: You're Fail");
        }
        if (sch>=33.0){
            System.out.println("\nChemistry: Congratulation! you're Pass");
        }
        else {
            System.out.println("\nChemistry: You're Fail");
        }

        //Overall percentage checking for Pass/Fail
        if (Total>=40.0){
            System.out.println("\nOverall: Congratulation! You're Pass & Promoted for next stage");
        }
        else {
            System.out.println("Overall: You're Fail");
        }

    }
}
