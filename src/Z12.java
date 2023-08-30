public class Z12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("loop-begin"+i);
            if( i==2){
                continue;
            }
            System.out.println("loop-end"+i);
        }
    }
}
