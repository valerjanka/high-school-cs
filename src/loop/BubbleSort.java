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
            }// the result of this loop is max element would be at the end
        } // you need to execute n times nested loop to find max element, then pre-max element and so on
        System.out.println(Arrays.toString(array));
    }
}
