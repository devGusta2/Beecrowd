import java.util.Scanner;

public class Matriz2 {
    public void matriz(){
         Scanner in = new Scanner(System.in);
        int N;

        while ((N = in.nextInt()) != 0) {
            int[][] matriz = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matriz[i][j] = Math.abs(i - j) + 1;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (j > 0) sb.append(" ");
                    sb.append(String.format("%3d", matriz[i][j]));
                }
                sb.append("\n");
            }
            System.out.print(sb.toString());
            System.out.println();
        }
        in.close();
    }
}
