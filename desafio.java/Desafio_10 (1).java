import java.util.Scanner;

// -----------------------------Algoritmo-----------------------
// 1. Importar a classe Scanner para ler a entrada do usuário.
// 2. Definir a classe principal Desafio_10.
// 3. No método main, criar um objeto Scanner para ler a entrada do usuário.
// 4. Solicitar ao usuário que digite o número de termos da sequência de Fibonacci.
// 5. Ler o número de termos digitado pelo usuário.
// 6. Chamar o método Fibonacci passando o número de termos como argumento.
// 7. Fechar o objeto Scanner.
// 8. Definir o método Fibonacci que recebe um inteiro n como argumento.
// 9. Verificar se n é menor ou igual a zero e, se for, imprimir uma mensagem de erro e retornar.
// 10. Inicializar as variáveis a e b com 1, que são os dois primeiros termos da sequência de Fibonacci.
// 11. Imprimir o primeiro termo da sequência.
// 12. Se n for maior que 1, imprimir o segundo termo da sequência.
// 13. Usar um loop for para calcular e imprimir os próximos termos da sequência até n.
// 14. Atualizar as variáveis a e b com os novos valores da sequência.
// 15. Imprimir " >> FIM" ao final da sequência.

public class Desafio_10 { // Passo 2: Definir a classe principal Desafio_10
    public static void main(String[] args) { // Passo 3: No método main
        Scanner scanner = new Scanner(System.in); // Passo 3: Criar um objeto Scanner para ler a entrada do usuário.
        System.out.print("Digite o número de termos: "); // Passo 4: Solicitar ao usuário que digite o número de termos.
        int n = scanner.nextInt(); // Passo 5: Ler o número de termos digitado pelo usuário.
        Fibonacci(n); // Passo 6: Chamar o método Fibonacci passando o número de termos como argumento.
        
        
        scanner.close(); // Passo 7: Fechar o objeto Scanner.
    }

    public static void Fibonacci(int n) { // Passo 8: Definir o método Fibonacci que recebe um inteiro n como argumento.
        
        if (n <= 0) { // Passo 9: Verificar se n é menor ou igual a zero.
            System.out.println("O número de termos deve ser maior que zero."); // Passo 9: Imprimir mensagem de erro.
            return; // Passo 9: Retornar do método.
        }

        
        int a = 1, b = 1; // Passo 10: Inicializar as variáveis a e b com 1.
        System.out.print(a); // Passo 11: Imprimir o primeiro termo da sequência.
        if (n > 1) { // Passo 12: Verificar se n é maior que 1.
            System.out.print(" >> " + b); // Passo 12: Imprimir o segundo termo da sequência.
        }

        
        for (int i = 3; i <= n; i++) { // Passo 13: Usar um loop for para calcular e imprimir os próximos termos.
            int next = a + b; // Passo 13: Calcular o próximo termo da sequência.
            System.out.print(" >> " + next); // Passo 13: Imprimir o próximo termo da sequência.
            a = b; // Passo 14: Atualizar a variável a.
            b = next; // Passo 14: Atualizar a variável b.
        }
        
        
        System.out.println(" >> FIM"); // Passo 15: Imprimir " >> FIM" ao final da sequência.
    
    
    }

}
