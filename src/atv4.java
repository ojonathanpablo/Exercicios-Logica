import java.util.Scanner;
import java.util.Arrays;

public class atv4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome[] = new String [14];
        String hospede;
        int menu,  i=0;

        do {
           
            System.out.println("Digite 1- Cadastrar|| Digite 2- Pesquisar || Digite 3- Sair");
            menu = entrada.nextInt();

            
            switch (menu) {
                case 1:
            
                if (i < 14){
                System.out.println("Digite o nome do Hospede:");
                entrada.nextLine();
                nome[i] = entrada.nextLine();
                i++;
           
                }else{
                    System.out.println("Limite Maximo:");
                }
                    break;
                case 2:
                
                System.out.println("Pesquise o nome do hospede:\nDigite o nome exatamente igual:");
                entrada.nextLine();
                hospede = entrada.nextLine();
                
                
                for (i=0; i< 14; i++){
                
                    if (nome[i].equals(hospede)) {
                        System.out.println("Hospede encontrada: "+nome[i]+"\nindice: " + i);
                        break;

                    } else if (!nome[i].equals(hospede) && i == 14) {
                        System.out.println("Hospede não encontrado."); 
                        break;
                    }
                }
                    break;
                case 3: 
                    System.out.println("Fim do programa:");
                    break;
                default:
                    System.out.println("Digite um numero valido.");
                    break;
            }
    

        } while (menu != 3);
        
        entrada.close();
    }
}
