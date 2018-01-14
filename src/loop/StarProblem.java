import java.util.Scanner;

/**
 * Task: for given n output n*n square
 * For n = 5:
 *
 *  *****
 *  ****+
 *  ***++
 *  **+++
 *  *++++
 *
 */
public class StarProblem
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int row = 0; row < n; row++) { // iterating over all rows
            for(int column = 0; column < n; column++) { // iterating over columns on the row 'row'
                if(column < n-row) {
                    System.out.print("*");
                } else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}
