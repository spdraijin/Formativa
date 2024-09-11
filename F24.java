//24 - Peça ao usuário para inserir três números e classifique-os em ordem crescente.

import java.util.Scanner;

public class F24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        int pos1, pos2, pos3;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        num3 = input.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            pos1 = num1;
            if (num2 < num3) {
                pos2 = num2;
                pos3 = num3;
            } else {
                pos2 = num3;
                pos3 = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            pos1 = num2;
            if (num1 < num3) {
                pos2 = num1;
                pos3 = num3;
            } else {
                pos2 = num3;
                pos3 = num1;
            }
        } else {
            pos1 = num3;
            if (num1 < num2) {
                pos2 = num1;
                pos3 = num2;
            } else {
                pos2 = num2;
                pos3 = num1;
            }
        }
        System.out.println("Os números em ordem crescente ficam: " + pos1 + ", " + pos2 + ", " + pos3);
    }
}