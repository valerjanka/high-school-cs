public class GeometryProgression
{
    // Geometry progression formula: a[n] = a[n-1] * d  (next = previous * d)
    // The first element and 'd' are given
    // a[0]
    // a[1] = a[0] * d
    // a[2] = a[1] * d = a[0] * d^2

    //a[0] = 1;
    //a[1] = a[0] * 2
    //a[10] = 1024
    //
    // Task - find sum of first n elements in progression
    public static void main(String[] args)
    {
        int sum = 0;
        int first = 1; // a[0]
        int d = 2;
        int n = 10;
        int current = first;
        for ( int i = 0; i < n; i++ )
        {
            sum += current;
            System.out.print(current + " ");
            current = current * d; // for the next cycle iteration
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
