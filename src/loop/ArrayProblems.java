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

        // read and output all elements of the array
        readArray(scanner, n, array);

        // calculate sum
        int sum = getSum(n, array);
        System.out.println("Sum: " + sum);

        // calculate minimum
        int min = getMin(array);
        System.out.println("Min: " + min);
    }

    private static void readArray(Scanner scanner, int n, int[] array)
    {
        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int getSum(int n, int[] array)
    {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static int getMin(int[] array)
    {
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
        return min;
    }
}
