public class Z30 {
    public static void main(String[] args) {
        double[] elements = {1.0,2.0,3.5,4.5,7.89};

        for (double var:elements) {
            System.out.println("loop begin: " + var);
            if (var == 3.50){
                break;
            }
            System.out.println("loop end:" + var);
        }
    }
}
