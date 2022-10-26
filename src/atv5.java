import java.util.Scanner;
public class atv5 {
  public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in); 


    char opcao;
    String ocupacao [][] = new String[4][3];
    int andar, quarto;

    for(int i=0; i<4;i++){
      for (int j = 0; j < 3; j++) {
          ocupacao[i][j] = "Desocupado";
      }
    }

    do {
      System.out.println("Informe andar é quarto:");

      System.out.print("Digite o andar:");
      andar = entrada.nextInt();

      System.out.print("Digite o quarto");
      quarto = entrada.nextInt();

      ocupacao[andar - 1][quarto - 1] = "Ocupado";
      
      System.out.println("Deseja infroma outra ocupacao?: s/n ");
      opcao = entrada.next().charAt(0);


    } while (opcao != 'N');

    for (int i = 0; i < 4; i++) {
      System.out.println( (i+1) +" Andar");

      for (int j = 0; j < 3; j++) {
          System.out.println("- Quarto "+(j+1) + " " + ocupacao[i][j]);
      }
    }
}
}
