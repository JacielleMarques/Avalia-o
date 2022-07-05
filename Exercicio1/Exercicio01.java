import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        int num, fat=1;
        int c = 1;

        do{
            System.out.println("Digite um número: ");
            num = teclado.nextInt();

            for(int i = 1; i <= num; i++){

            }
            System.out.println("O fatorial de " +num+ " é igual a " +fat+ "!" );
            c++;
        
        }while(c < 2);

    }
}

