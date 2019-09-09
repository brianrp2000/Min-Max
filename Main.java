/**
 * Created by brian on 31/07/2018.
 */
public class Main {
    public static void main(String[] args) {
        int[] array={7,2,5,9,1,6,3};

        for (int x: minAndMax(array)) {
            System.out.println(x);
        }
    }
    private static int[] minAndMax(int[] array){
        int max = array[0];
        int min = array[0];

        for (int anArray : array) {
            if (anArray >= max) {
                max = anArray;
            } else if (anArray < min) {
                min = anArray;
            }
        }

        return new int[]{max,min};
    }
}
