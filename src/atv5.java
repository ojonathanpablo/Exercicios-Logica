import java.util.Scanner;
public class atv5 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int andar[][] = new int [4][3];
    String A,Q = "ocupado" ;
    String opcao;

    
do {
    for ( A=0; A <=4; A++) {
        System.out.println("Informe o andar e quarto:");
        System.out.println("Andar: ");
        andar[A][Q] = entrada.nextInt();
        for (Q=0; Q<=3; Q++){
        System.out.println("Quarto: ");
        andar[A][Q] = entrada.nextInt();
        }
       
    }


    System.out.println("Deseja continuar S/N");
    opcao = entrada.nextLine();
    
} while (opcao.equals("S"));

for (A = 0; A <= 4; A++){
    System.out.print((A+1) + "ª Andar");
    System.out.println(" ");
    for(Q=0; Q<= 3; Q++){
        System.out.println(andar[A][Q]);
    }

  }
}
}
