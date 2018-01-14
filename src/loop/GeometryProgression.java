public class GeometryProgression
{
    // a[n] = a[n-1] * d : next = previous * d
    // a[0]
    // a[1] = a[0] * d
    // a[2] = a[1] * d = a[0] * d^2

    //a[0] = 1;
    //a[1] = a[0] * 2
    //a[10] = 1024
    public static void main(String[] args)
    {
        int sum = 0;
        int start = 1;
        int n = 10;
        int d = 2;
        int current = start;
        for ( int i = 1; i <= n; i++ )
        {
            sum += current;
            System.out.print(current + " ");
            current = current * d; // for the next cycle iteration
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
