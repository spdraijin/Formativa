/*
 * 22 - Peça ao usuário para inserir um número de 1 a 7
 * e exiba se ele corresponde a um dia útil (segunda a sexta-feira)
 * ou a um fim de semana (sábado ou domingo).
 */

import java.util.Scanner;

public class F22 {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um número de 1 a 7: ");
        number = input.nextInt();

        if (number <= 5) {
            System.out.println(number + " corresponde a um dia útil da semana");
        } else {
            System.out.println(number + " corresponde a um dia do fim de semana");
        }
    }
}