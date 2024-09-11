
/*Solicite ao usuário sua idade e se ele possui carteira de estudante (sim ou não). 
Se ele tiver menos de 18 anos ou possuir carteira de estudante, 
conceda-lhe um desconto de 50% em um produto.
*/
import java.util.Scanner;

public class F23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        String id;

        System.out.print("Digite sua idade: ");
        age = input.nextInt();

        System.out.print("Você possui carteira de estudante (sim ou não): ");
        id = input.next();

        if (age < 18 || id.equalsIgnoreCase("sim")) {
            System.out.println("Você tem direito ao desconto de 50% em um produto");
        } else {
            System.out.print("Você não tem direito ao desconto de 50% em um produto");
        }
    }
}
