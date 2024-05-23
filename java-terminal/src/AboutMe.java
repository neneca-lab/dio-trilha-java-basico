import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
   
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 

        System.out.println("Digite seu nome: ");
        //next me retorna uma string
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobreNome = scanner.next();

        System.out.println("Digite sua altura: ");
        //nextDouble converte o valor de uma string em double
        double altura = scanner.nextDouble();

        System.out.println("Informe a sua idade: ");
        //nextInt converte o valor de uma string em int
        int idade = scanner.nextInt();

        System.out.println("Digite o nome do seu cachorro(a): ");
        String nomeCachorro = scanner.next();


        System.out.println("Ola, me chamo " + nome + " " + sobreNome);
        System.out.println("Minha altura é " + altura + "cm ");
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Meu cachorro se chama " + nomeCachorro);
    }


}
