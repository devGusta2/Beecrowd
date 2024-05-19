import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int dia, mes, ano;
        dia=in.nextInt();
        
  
        mes=dia/30;
        ano=mes/12;
        mes=ano/30;
        dia=(dia/365)-mes%12;
        
        System.out.println(ano+" "+"ano(s)");
        System.out.println(mes+" "+"mes(es)");
        System.out.println(dia+" "+"dia(s)");
    }
}
