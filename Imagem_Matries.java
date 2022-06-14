import java.util.Scanner;
public class Imagem {
    public static void main(String[] args){
        //O uso do Scanner para a entrada de dados
        Scanner scan = new Scanner(System.in);
        //Declara a matriz e atribuindo o tamanho de 16x16
        int [][] matriz= new int[16][16];
        //Informar aos usuários quais os números
        System.out.print("Digite 16 valores de cores para a matriz: 0 para branco, 1 para preto, 2 para vermelho ou 3 para bege.\n");
        //O uso da estrutura de repetição For
        for (int linha=0; linha < 16; linha++) {
            for (int coluna=0; coluna < 16; coluna++) {
                //Pede ao usuário para adicionar valores à matriz
                System.out.printf("Insira a cor do elemento M[%d][%d]: ", linha+1, coluna+1);
                //Atribui o valor digitado para cada posição na Matriz
                matriz[linha][coluna] = scan.nextInt();
            }
         }
        //Faz a demonstração ao usuário de como ficou a matriz
         System.out.println("\n A matriz ficou: \n");        
        //O uso da Estrutura de repetição For
         for (int linha=0; linha < 16; linha++) {
            for (int coluna=0; coluna < 16; coluna++) {
                //Faz a demonstração a Matriz já montada ao usuário
                System.out.printf("\t %d \t", matriz[linha][coluna]);
            }
            System.out.println();
        }
        }
        
    }
