

import java.util.Scanner;

public class atv01 {
    public static void main(String[] args) {
        
        final int auditorioBeta = 350;
        final int auditorioAlfa = 220;
        Scanner entrada = new Scanner(System.in);
        int qtPessoas,qtCadeira, numeroCadeiras = 70;
      

        System.out.println("Quantidade de pessoas?");
        qtPessoas = entrada.nextInt();

        qtCadeira = qtPessoas - auditorioAlfa + numeroCadeiras;

        if (qtPessoas > auditorioBeta || qtPessoas <= 0){
            System.out.println("Numero de convidados invalido");
        }else 
            {
                if (qtPessoas >= auditorioAlfa && qtPessoas < auditorioBeta ){
                    System.out.println("Iremos ultilizar o auditorio Beta");
                }
                if (qtPessoas <= auditorioBeta && qtPessoas >0){
                    System.out.println("Iremos ultilizar o auditorio Alfa.\nÉ inclua mais " + qtCadeira + " cadeiras.");
                }else{
                    System.out.println("Invalido");
                }
            }
       
    }
}
