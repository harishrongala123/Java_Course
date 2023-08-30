public class Z9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("loop-begin: "+ i);
            if( i == 3){
                System.out.println("if block:" + i);
                continue;
            }
            System.out.println("loop-end:" + i);
        }
    }
}
