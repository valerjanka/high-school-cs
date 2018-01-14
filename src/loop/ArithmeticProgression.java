public class ArithmeticProgression
{
    // a[n] = a[n-1] + d
    // Task: find sum of the first n elements, where first and last are given
    public static void main(String[] args)
    {
        int sum = 0;
        int first = 0;
        int last = 200;
        for ( int i = first; i <= last; i = i + 5 ) // Iterating over elements of progression from the first to the last
        {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
