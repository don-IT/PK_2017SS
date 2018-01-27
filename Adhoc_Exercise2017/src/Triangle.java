/**
 * Created by cehajicomar on 28.04.17.
 */
public class Triangle {
    public static void main(String[] args) {
        System.out.println(triangle(30));
    }
    private static long[][] triangle(int lines) {
        long[][] triangle = new long[lines][];
        for (int n = 0; n < lines; n++) {
            triangle[n] = new long[n + 1];
            triangle[n][0] = 1;
            triangle[n][n] = 1;

            for (int k = 1; k < n; k++) {
                triangle[n][k] = triangle[n - 1][k - 1] + triangle[n - 1][k];
            }
        }
                return triangle;
            }

    }


