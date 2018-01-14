import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] array = {8,3,9,5,10};

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]) {
                    int x = array[j];
                    int y = array[j+1];
                    array[j] = y;
                    array[j+1] = x;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
