public class C {
    public static void main(String[] args) {
        System.out.println("main begin");
        for (int i = 1;i<5;i++){
            int J = 500;
            J++;
            J+=5;
            System.out.println("loop body:" +i+ "," + J);
            System.out.println("--------------");
        }
        System.out.println("main end");
    }
}
