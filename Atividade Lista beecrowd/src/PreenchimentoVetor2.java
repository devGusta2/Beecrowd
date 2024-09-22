import java.util.Scanner;

public class PreenchimentoVetor2 {
    public void preenche() {
        Scanner in = new Scanner(System.in);
        int[] n = new int[1000];
        int t = in.nextInt();
        
        int i = 0;  // Controle do índice do vetor
        while (i < 1000) {
            for (int j = 0; j < t && i < 1000; j++) {
                n[i] = j;
                System.out.println("N[" + i + "] = " + n[i]);
                i++;
            }
        }
    }
}
