import java.util.Scanner;

public class SubstVetor{
    public void substitui(){
        Scanner in = new Scanner(System.in);
        int x [] = new int [10];
        int res;
        for(int i = 0; i<10; i++){
            res = in.nextInt();
            if(res < 1){
                x[i] = 1;
            }else{
                x[i] = res;
            }
            if(i>=9){
                for(i = 0; i<10;i++){
                    System.out.println("X["+i+"] = "+x[i]);
                }
            }
     
        }
    }
}