public class logical_operators {
    public static void main(String[] args) {
        System.out.println("For LOGICAL AND OPERATORS");
        boolean a = false;
        boolean b = false;
        if (a&&b) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        System.out.println("For LOGICAL OR OPERATORS");
        boolean c = true;
        boolean d = false;
        if (c || d){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        System.out.println("For Logical NOT OPERATORS");
        boolean e = false;
        boolean f = true;
        System.out.println("NOT(A) is: " + !e);
        System.out.println("NOT(B) is: " + !f);
    }
}
