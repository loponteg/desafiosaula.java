/*
----------------------------------Algoritmo----------------------------------
1. Importa a classe Scanner
2. Importa a classe Random
3. Cria um objeto Scanner para ler a entrada do usuário
4. Cria um objeto Random para gerar escolhas aleatórias
5. Define um array de Strings com as opções Pedra, Papel e Tesoura
6. Solicita ao usuário que escolha uma opção
7. Lê a escolha do usuário e armazena na variável Escolha
8. Gera uma escolha aleatória para o computador e armazena na variável Escolha_com
9. Exibe a escolha do usuário
10. Exibe a escolha do computador
11. Verifica se houve empate
12. Verifica se o usuário ganhou
13. Se não houve empate e o usuário não ganhou, o computador ganhou
14. Fecha o objeto Scanner
*/

import java.util.Scanner; // 1. Importa a classe Scanner
import java.util.Random; // 2. Importa a classe Random

public class Desafio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 3. Cria um objeto Scanner para ler a entrada do usuário
        Random random = new Random(); // 4. Cria um objeto Random para gerar escolhas aleatórias
        
        String[] op = {"Pedra", "Papel", "Tesoura"}; // 5. Define um array de Strings com as opções Pedra, Papel e Tesoura
        
        
        System.out.println("Escolha uma opção: (0) Pedra, (1) Papel, (2) Tesoura"); // 6. Solicita ao usuário que escolha uma opção
        int Escolha = scanner.nextInt(); // 7. Lê a escolha do usuário e armazena na variável Escolha
        final int Escolha_com = random.nextInt(3); // 8. Gera uma escolha aleatória para o computador e armazena na variável Escolha_com
        
        System.out.println("Você escolheu: " + op[Escolha]); // 9. Exibe a escolha do usuário
        
        
        System.out.println("O computador escolheu: " + op[Escolha_com]); // 10. Exibe a escolha do computador
        
        
        
        if (Escolha == Escolha_com) { // 11. Verifica se houve empate
            System.out.println("Empate!");
        } else if ((Escolha == 0 && Escolha_com == 2) || // 12. Verifica se o usuário ganhou
                   (Escolha == 1 && Escolha_com == 0) || 
                   (Escolha == 2 && Escolha_com == 1)) {
            System.out.println("Parabéns, você ganhou!");
        } else { // 13. Se não houve empate e o usuário não ganhou, o computador ganhou
            System.out.println("Você perdeu!");}
        
        scanner.close(); // 14. Fecha o objeto Scanner
    }
}
