import java.util.Arrays;

//https://www.youtube.com/watch?v=IdZlsG6P17w
public class RotateMatrix90Degree {


    // In-place rotate it by 90 degrees in clockwise direction
    public static void rotate(int[][] mat) {
        int N = mat.length;

        // Transpose the matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // flip horizontally, swap columns
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                System.out.println("N-->"+N+"j-->"+j);


                System.out.println("Here-->"+(N-1-j));

                int temp = mat[i][j];
                mat[i][j] = mat[i][N - 1 - j]; // Note in Flipping we are flipping at j level only means we are flipping the column values only, so i will be constant , which means in same row we are just changing the column values i.e. matrix[j] will be replaces with matrix[N-j-1]
                //N-1 will go to always last column and as soon as we give -j it will become N-1-j which will narrow down to that particular column, approaching towards center
                mat[i][N - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat =
                {
                        {1,  3, 4},
                        {5,  7, 8},
                        {9,  11, 12},
                        };

        rotate(mat);

        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}