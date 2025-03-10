/*
---------------------------------------Algoritmo-----------------------
1. Inicializa as variáveis n1 e n2 com 1, que são os dois primeiros números da sequência de Fibonacci
2. Declara a variável n3 para armazenar o próximo número da sequência
3. Exibe uma mensagem indicando que os 10 primeiros elementos da sequência de Fibonacci serão exibidos
4. Exibe os dois primeiros números da sequência de Fibonacci
5. Inicia um loop que calcula e exibe os próximos 8 números da sequência de Fibonacci
6. Calcula o próximo número da sequência somando n1 e n2
7. Exibe o próximo número da sequência
8. Atualiza o valor de n1 para o valor de n2
9. Atualiza o valor de n2 para o valor de n3
*/

public class Desafio_8 {
    public static void main(String[] args) {
        int n1 = 1, n2 = 1, n3; // 1. Inicializa as variáveis n1 e n2 com 1, que são os dois primeiros números da sequência de Fibonacci

        System.out.println("Os 10 primeiros elementos da Sequência de Fibonacci são:"); // 3. Exibe uma mensagem indicando que os 10 primeiros elementos da sequência de Fibonacci serão exibidos
        
        
        System.out.print(n1 + " " + n2); // 4. Exibe os dois primeiros números da sequência de Fibonacci

        
        for (int i = 2; i < 10; i++) { // 5. Inicia um loop que calcula e exibe os próximos 8 números da sequência de Fibonacci
            n3 = n1 + n2; // 6. Calcula o próximo número da sequência somando n1 e n2
            System.out.print(" " + n3); // 7. Exibe o próximo número da sequência
            n1 = n2; // 8. Atualiza o valor de n1 para o valor de n2
            n2 = n3; // 9. Atualiza o valor de n2 para o valor de n3
        }
    
    }


}