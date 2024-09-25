import java.util.Scanner;
public class Matriz123 {
        public void Matriz(){
            Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {
        int N = sc.nextInt();


        int[][] matriz = new int[N][N];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = 3;
            }
        }

     
        for (int i = 0; i < N; i++) {
            matriz[i][i] = 1;
        }

        
        for (int i = 0; i < N; i++) {
            matriz[i][N - 1 - i] = 2;
        }

    
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    

    sc.close();

}
        }
}