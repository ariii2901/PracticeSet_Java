public class whileloops {
    public static void main(String[] args) {
        int i = 0;
        while (i<=5){
            if (i==3){
                i++;
                continue;
            }
            System.out.println("Hello I'm: " + i);
            i++;
        }
    }
}
