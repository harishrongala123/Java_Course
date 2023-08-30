public class Z20 {
    public static void main(String[] args) {
        outerLoop:  for (int i = 1; i <= 5; i++) {
            System.out.println("out for begin:" +i);
            innerLoop:   for (int j = 15; j <= 20; j++) {
                System.out.println("inner for begin: " + i + ","+ j);
              hi:  if(j == 18){
                    continue outerLoop;
                }
                System.out.println("inner for end: " + i + ","+ j);
            }
            System.out.println("outer for end:" + i);
        }
        System.out.println("main end");

    }
}
