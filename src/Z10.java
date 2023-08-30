public class Z10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("loop-begin: "+ i);
            if( i == 2){
                System.out.println("if block:" + i);
                break;
            }
            System.out.println("loop-end:" + i);
        }
    }
}
