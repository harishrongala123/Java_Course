public class Y {
    public static void main(String[] args) {
        int i;

        for ( i=1;
             test(i);
        System.out.println("before change:" +i),
                i++,
        System.out.println("after change:" +i))
        {
            System.out.println("loop body"+ i);
        }
    }

     static boolean test(int i) {
        boolean b1 = (i <= 5);
         System.out.println("boolean status for i = " +i+" is " + b1);
         return b1;
    }
}
