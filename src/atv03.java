import java.util.Scanner;

public class atv03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nomHospede,opcao;
        float vlrTotal = 0;
          int iddHospede;
          int totalHospede = 0;
          int gratuito = 0; 
          int iddMedia = 0;


        do {

          System.out.println("Qual o nome do hospede:");
          nomHospede = entrada.nextLine();
      
          
          System.out.println("Qual a idade do hospede:");
          iddHospede = entrada.nextInt();

          if (iddHospede > 80){
               System.out.println(nomHospede + " Paga meia");
               iddMedia++;
               totalHospede++;
               vlrTotal = vlrTotal + 50;
          }
          else if (iddHospede < 4) {
                  System.out.println(nomHospede + " Não paga");
                  gratuito++;
                  totalHospede++;
          }
          else {
                  totalHospede++;
                  vlrTotal = vlrTotal + 100;
          }

            System.out.println("Digite pare, para encerrar:");
            entrada.nextLine();
            opcao = entrada.nextLine();
            

         
        } while (!opcao.equals("pare"));

          System.out.println("total de hospedem são " + totalHospede + ": Sendo " + gratuito  + " Gratuidades(s) é " + iddMedia + " meia. Total:" + vlrTotal);
          
          entrada.close();
    }
    
}
