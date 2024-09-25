public class Matriz123{
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int N = sc.nextInt();

            // Criar a matriz NxN preenchida com 3
            int[][] matriz = new int[N][N];

            // Preencher a matriz com o valor 3
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matriz[i][j] = 3;
                }
            }

            // Preencher a diagonal principal com 1
            for (int i = 0; i < N; i++) {
                matriz[i][i] = 1;
            }

            // Preencher a diagonal secundária com 2
            for (int i = 0; i < N; i++) {
                matriz[i][N - 1 - i] = 2;
            }

            // Exibir a matriz
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(matriz[i][j]);
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
}