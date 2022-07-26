public class dowhileloop {
    public static void main(String[] args) {
//        int i = 10;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i<5);

        // prog: 2
//        int n = 1;
//        do{
//            System.out.println(n);
//            n++;
//        } while (n<=100);

        // prog: 3
        int x = 0;
        do {
            x++;
            if (x==3){
                continue;
            }
            System.out.println(x);
        }
        while (x<=7);
    }
}
