import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int dia, mes, ano;
        dia=in.nextInt();
        
  
        mes=dia/30;
        ano=mes/12;
        mes=mes%12;
        dia=dia%mes;
        
        System.out.println("Anos:"+ano);
        System.out.println("Mes:"+mes);
        System.out.println("Dias:"+dia);
    }
}
