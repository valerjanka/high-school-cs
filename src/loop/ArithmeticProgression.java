public class ArithmeticProgression
{
    public static void main(String[] args)
    {
        int sum = 0;
        int start = 0;
        int last = 200;
        for ( int i = start; i <= last; i = i + 5 )
        {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
