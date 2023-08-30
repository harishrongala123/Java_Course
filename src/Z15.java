public class Z15 {
    public static void main(String[] args) {
        System.out.println("main begin");
        for (int i = 1; i < 5; i++) {
            System.out.println("outer for begin:" + i);
            for (int j = 15; j <= 20; j++) {
                System.out.println("inner for begin:" + i + ","+ j );
                System.out.println("inner for end :"+ i +"," + j);
            }
            System.out.println("outer for end:" + i);
        }
        System.out.println("main end");
    }
}
