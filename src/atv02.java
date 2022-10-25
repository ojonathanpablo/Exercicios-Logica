import java.util.Scanner;

public class atv02 {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);

    
        System.out.println("HOSPEDE ");


        System.out.println("Nome cliente 01: ");
        String nome1 = entrada.nextLine();
       

        System.out.println("Idade cliente 01: ");
        int idade1 = entrada.nextInt();
        

        System.out.println("HOSPEDE ");


        System.out.println("Nome cliente 02: ");
        entrada.nextLine();
        String nome2 = entrada.nextLine();
      
        


        System.out.println("Idade cliente 02: ");
        int idade2 = entrada.nextInt();
       

        System.out.println("----------------------Quartos:---------------------");

        if (idade1 >= 60 || idade2 >= 60){
            System.out.println("Entrei aqui \n");

            if (idade1 > 60) {
                    System.out.println("Quarto A com: "+nome1+" Com desconto 40%\nQuarto B com: "+nome2);
                }
            else if (idade2 > 60){
                    System.out.println("Quarto A com: "+nome2+" Com desconto 40%\nQuarto B com: "+nome1);
                }
            }
        else if (idade1 > idade2){
            System.out.println("Quarto A com: "+nome1+"\nQuarto B com: "+nome2);
        }else if (idade2 > idade1){
            System.out.println("Quarto A com: "+nome2+"\nQuarto B com: "+nome1);
        }

}  
}
