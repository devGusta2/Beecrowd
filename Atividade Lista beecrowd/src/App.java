import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);

    int n [] =  new int[10];
    int v = in.nextInt();
        for(int i = 0; i <=9;i++){
            n[i]=v;
            System.out.println("N["+(i  +1)+"] = " + v);
            v=v*2;
        }
    }
}
