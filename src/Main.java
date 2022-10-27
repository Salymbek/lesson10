import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        int[] varrargs = new int[10];
        int san = 15;
        for (int i = 0; i < varrargs.length; i++) {
            varrargs[i]=random.nextInt(1,20);

        }
        System.out.println(Arrays.toString(varrargs));
        System.out.println(contains(san,varrargs));
    }



    public static boolean contains(int a, int ... varargs){
        for (int i = 0; i < varargs.length; i++) {
            if (varargs[i]==a){
                return true;

            }

        }

        return false;



    }








































































}