public class Z18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("out for begin:" +i);
            for (int j = 15; j <= 20; j++) {
                System.out.println("inner for begin: " + i + ","+ j);
                if(j == 18){
                    break;
                }
                System.out.println("inner for end: " + i + ","+ j);
            }
            System.out.println("outer for end:" + i);
        }
        System.out.println("main end");

    }
}
