import java.util.Scanner;

public class ArrayProblems
{
    /**
     * Input:
     * n - array size
     * array
     *
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n]; // positions: 0,1,2,3,..n-1

        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println("Sum: " + sum);

        int min = 0;
        for(int i = 0; i < array.length; i++) {
            //check if array[i] is new minimum element in array from 0-i
            if( i == 0) {
                min = array[i];
            } else {
                if(min > array[i]) {
                    min = array[i];
                }
            }
        }
        System.out.println("Min: " + min);
    }
}
