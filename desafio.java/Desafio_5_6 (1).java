/*
---------------------------------------------Algoritmo---------------------------------------------
1. Importa a classe Scanner
2. Importa a classe Random
3. Cria um objeto Scanner para ler a entrada do usuário
4. Cria um objeto Random para gerar escolhas aleatórias
5. Define um array de inteiros com as opções de 1 a 10
6. Gera uma escolha aleatória para o computador e armazena na variável Esc_com
7. Inicializa a variável opc com 0 para contar as tentativas do usuário
8. Inicia um loop que permite ao usuário tentar adivinhar o número até 4 vezes
9. Solicita ao usuário que escolha um número e lê a escolha
10. Exibe a escolha do usuário
11. Verifica se a escolha do usuário é igual à escolha do computador
12. Se o usuário acertar, exibe uma mensagem de parabéns e encerra o loop
13. Se o usuário errar, exibe uma mensagem de erro e incrementa a variável opc
14. Exibe a escolha do computador após o término do loop
15. Fecha o objeto Scanner
*/

import java.util.Scanner; // 1. Importa a classe Scanner
import java.util.Random; // 2. Importa a classe Random

public class Desafio_5_6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // 3. Cria um objeto Scanner para ler a entrada do usuário
        Random random = new Random(); // 4. Cria um objeto Random para gerar escolhas aleatórias

        int[] op = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 5. Define um array de inteiros com as opções de 1 a 10

        final int Esc_com = random.nextInt(10); // 6. Gera uma escolha aleatória para o computador e armazena na variável Esc_com

        
        
        int opc = 0; // 7. Inicializa a variável opc com 0 para contar as tentativas do usuário
        while (opc < 4) { // 8. Inicia um loop que permite ao usuário tentar adivinhar o número até 4 vezes
            System.out.println("Escolha um número  (0) 1, (1) 2, (2) 3, (3) 4, (4) 5, (5) 6, (6) 7, (7) 8, (8) 9, (9) 10 \nvocê tem 4 chances! "); // 9. Solicita ao usuário que escolha um número
            int Esc = scanner.nextInt(); // 9. Lê a escolha do usuário
            System.out.println("Você escolheu: " + op[Esc]); // 10. Exibe a escolha do usuário
            if (Esc == Esc_com) { // 11. Verifica se a escolha do usuário é igual à escolha do computador
                System.out.println("Parabens você acertou o número!"); // 12. Se o usuário acertar, exibe uma mensagem de parabéns
                opc = 4; // 12. Encerra o loop
            } else {
                System.out.println("Você errou!"); // 13. Se o usuário errar, exibe uma mensagem de erro
                opc += 1; // 13. Incrementa a variável opc
            }
        }
        System.out.println("O computador escolheu: " + op[Esc_com]); // 14. Exibe a escolha do computador após o término do loop
        
        
        
        scanner.close(); // 15. Fecha o objeto Scanner
    }
}
