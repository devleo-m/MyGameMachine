import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Seja bem vindo ao jogo par ou impar");
            System.out.println("Voce deseja ser impar ou par?");
            String opcao = scanner.next();
            opcao += scanner.nextLine();
            System.out.println("Digite o valor do numero entre 0 - 10");
            int numeroJogador = scanner.nextInt();
            switch (opcao){
                case "par":
                    System.out.println("par");
                    break;
                case "impar":
                    System.out.println("impar");
                    break;
                default:
                    System.out.println("Valor invalido, tente novamente");
                    break;
            }
        }while(true);
    }
}