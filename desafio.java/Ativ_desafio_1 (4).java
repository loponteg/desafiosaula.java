/*
-----------------------------------------Algotitmo-----------------------------------------
1. Importa a classe Scaner
2. Cria um objeto Scanner para ler a entrada do usuário
3. Solicita ao usuário o número de cigaros fumados por dia
4. Le o número de cigarros fumados por dia e armazena na variável cigasDia
5. Solicita ao usuário o número de anos fumando
6. Le o numero de anos fumando e armazena na variavel anosfumando
7. Calcula o total de cigarros fumados multiplicando cigasDia, anosfumando e 365
8. Calcula o total de minutos de vida perdidos 10 minutos por cigarro
9. Converte os minutos perdidos em dias 1440 minutos por dia
10. Exibe o total de dias de vida perdidos
11. Fecha o objeto Scanner
*/

import java.util.Scanner; // 1. Importa a classe Scanner

public class Ativ_desafio_1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // 2. Cria um objeto Scanner para ler a entrada do usuário

        System.out.println("Quantos cigarros fumados por dia?: "); // 3. Solicita ao usuário o número de cigaros fumados por dia
        int cigasDia = scanner.nextInt(); // 4. Le o número de cigarros fumados por dia e armazena na variável cigasDia

        
        System.out.println("Quantos anos fumando?: "); // 5. Solicita ao usuário o número de anos fumando
        int anosfumando = scanner.nextInt(); // 6. Lê o numero de anos fumando e armazena na variável anosfumando

        
        float totalCigarros = cigasDia * anosfumando * 365; // 7. Calcula o total de cigarros fumados multiplicando cigasDia, anosfumando e 365
        float minutosPerdidos = totalCigarros * 10; // 8. Calcula o total de minutos de vida perdidos 10 minutos por cigarro
        float diasPerdidos = minutosPerdidos / 1440; // 9. Converte os minutos perdidos em dias 1440 minutos por dia

        
        
        System.out.println("Você perdeu " + diasPerdidos + " dias de vida fumando."); // 10. Exibe o total de dias de vida perdidos
        scanner.close(); // 11. Fecha o objeto Scanner
    }
}
