/*
---------------------------------------Algoritmo--------------------------------
1. Importa a classe Scanner
2. Cria um objeto Scanner para ler a entrada do usuário
3. Solicita ao usuário que digite o primeiro termo da PA
4. Lê o primeiro termo da PA e armazena na variável pritermo
5. Solicita ao usuário que digite a razão da PA
6. Lê a razão da PA e armazena na variável razao
7. Inicializa a variável soma com 0 para armazenar a soma dos termos
8. Inicializa a variável termoA com o valor do primeiro termo
9. Exibe os 10 primeiros termos da PA
10. Calcula e exibe cada termo da PA, atualizando a soma e o próximo termo
11. Exibe a soma dos 10 primeiros termos da PA
12. Fecha o objeto Scanner
*/

import java.util.Scanner; // 1. Importa a classe Scanner

public class Desafio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 2. Cria um objeto Scanner para ler a entrada do usuário

        System.out.print("Digite o primeiro termo da PA: "); // 3. Solicita ao usuário que digite o primeiro termo da PA
        int pritermo = scanner.nextInt(); // 4. Lê o primeiro termo da PA e armazena na variável pritermo
        
        
        System.out.print("Digite a razão da PA: "); // 5. Solicita ao usuário que digite a razão da PA
        int razao = scanner.nextInt(); // 6. Lê a razão da PA e armazena na variável razao

        int soma = 0; // 7. Inicializa a variável soma com 0 para armazenar a soma dos termos
        int termoA = pritermo; // 8. Inicializa a variável termoA com o valor do primeiro termo

        
        
        System.out.println("Os 10 primeiros termos da PA são:"); // 9. Exibe os 10 primeiros termos da PA
        for (int i = 0; i < 10; i++) { // 10. Calcula e exibe cada termo da PA, atualizando a soma e o próximo termo
            System.out.print(termoA + " ");
            soma += termoA;
            termoA += razao;
        }

        
        
        System.out.println("e a soma dos 10 primeiros termos da PA é: " + soma); // 11. Exibe a soma dos 10 primeiros termos da PA
        
        
        scanner.close(); // 12. Fecha o objeto Scanner
    }
}