/*
-----------------------------------------Algoritmo-----------------------------------------
1. Importa a classe Scanner
2. Cria um objeto Scanner para ler a entrada
3. Solicita ao usuário o comprimento do primeiro segmento de reta
4. Lê o comprimento do primeiro segmento de reta e armazena na variável seg1
5. Solicita ao usuário o comprimento do segundo segmento de reta
6. Lê o comprimento do segundo segmento de reta e armazena na variável seg2
7. Solicita ao usuário o comprimento do terceiro segmento de reta
8. Lê o comprimento do terceiro segmento de reta e armazena na variável seg3
9. Verifica se é possível formar um triângulo com os segmentos fornecidos
10. Se for possível formar um triângulo, verifica o tipo de triângulo (equilátero, isósceles ou escaleno)
11. Exibe o tipo de triângulo formado
12. Se não for possível formar um triângulo, exibe uma mensagem informando
13. Fecha o objeto Scanner
*/

import java.util.Scanner; // 1. Importa a classe Scanner

public class Desafio2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 2. Cria um objeto Scanner para ler a entrada

        System.out.println("Digite o comprimento do primeiro segmento de reta: "); // 3. Solicita ao usuário o comprimento do primeiro segmento de reta
        double seg1 = scanner.nextDouble(); // 4. Lê o comprimento do primeiro segmento de reta e armazena na variável seg1

        
        System.out.println("Digite o comprimento do segundo segmento de reta: "); // 5. Solicita ao usuário o comprimento do segundo segmento de reta
        double seg2 = scanner.nextDouble(); // 6. Lê o comprimento do segundo segmento de reta e armazena na variável seg2

        System.out.println("Digite o comprimento do terceiro segmento de reta: "); // 7. Solicita ao usuário o comprimento do terceiro segmento de reta
        double seg3 = scanner.nextDouble(); // 8. Lê o comprimento do terceiro segmento de reta e armazena na variável seg3

        
        
        if (seg1 < seg2 + seg3 && seg2 < seg1 + seg3 && seg3 < seg1 + seg2) { // 9. Verifica se é possível formar um triângulo com os segmentos fornecidos
            System.out.println("É possível formar um triângulo com esses segmentos."); // 10. Se for possível formar um triângulo, exibe uma mensagem informando

            if (seg1 == seg2 && seg2 == seg3) { // 10.1. Verifica se o triângulo é equilátero
                System.out.println("O triângulo é equilátero."); // 11. Exibe o tipo de triângulo formado (equilátero)
            } else if (seg1 == seg2 || seg1 == seg3 || seg2 == seg3) { // 10.2. Verifica se o triângulo é isósceles
                System.out.println("O triângulo é isósceles."); // 11. Exibe o tipo de triângulo formado (isósceles)
            } else {
                System.out.println("O triângulo é escaleno."); // 11. Exibe o tipo de triângulo formado (escaleno)
            }
        } else {
            System.out.println("Não é possível formar um triângulo com esses segmentos.");} // 12. Se não for possível formar um triângulo exibe uma mensagem informando
        scanner.close(); // 13. Fecha o objeto Scanner
    }
}
