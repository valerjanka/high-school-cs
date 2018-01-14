import java.util.Scanner;

/**
 * For n = 5:
 *
 *  *****
 *  ****+
 *  ***++
 *  **+++
 *  *++++
 *
 *
 *  *****
 *  +***+
 *  ++*++
 *  +++++
 *  +++++
 *
 */
public class StarProblem
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int row = 0; row < n; row++) {
            for(int column = 0; column < n; column++) { // line or row
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
