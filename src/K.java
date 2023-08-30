public class K {
    public static void main(String[] args) {
        for(int i = Byte.MIN_VALUE;i<=Byte.MAX_VALUE;i++){
            if(i==Byte.MAX_VALUE){
                System.out.print(i);
            }else
                System.out.print(i+",");
        }
    }
}
