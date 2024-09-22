import java.util.Scanner;
public class PreencherVetor {
    Scanner in = new Scanner(System.in);
    public void action(){
        int n [] =  new int[10];
        int v = in.nextInt();
            for(int i = 0; i <=9;i++){
                n[i]=v;
                System.out.println("N["+i+"] = " + v);
                v=v*2;
            }
    }
}
