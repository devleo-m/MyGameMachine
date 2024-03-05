import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Seja bem vindo ao jogo par ou impar");
            System.out.println("Voce jogar impar ou par?");
            String opcao = scanner.next();
            opcao += scanner.nextLine();
            System.out.println("Digite o valor do numero entre 0 - 10");
            int jogador = scanner.nextInt();
            Random random = new Random();
            int jogadaComputador = random.nextInt(0, 10);
            int calcJogador = jogador + jogadaComputador;
            System.out.println("numero do jogador: "+jogador);
            System.out.println("numero do computador: "+ jogadaComputador);
            System.out.println("soma: "+ calcJogador);
            String resultado = calcJogador % 2 == 0 ? "par" : "impar";
            System.out.println(resultado);
            String ganhador = opcao.equalsIgnoreCase(resultado)?"Voce ganhou":"Voce perdeu";
            System.out.println(ganhador);
            System.out.println("-----------fim------------");
        }while(true);
    }
}