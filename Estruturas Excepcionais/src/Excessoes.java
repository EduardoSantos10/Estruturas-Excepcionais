
import java.util.InputMismatchException; // ativei a import do erro que peguei na exceção
import java.util.Locale; // Imporrei dois métodos para serem usados
import java.util.Scanner; // scanner -> para pegar resposta do usuário
                        //

public class Excessoes {
    public static void main(String[] args){
        try{ // TRY, serve para pegar o erro do meu bloco de código
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);// System.in -> entrada de texto e análise de string r do tipo primitivo
                                                                    // useLocale(Locale.US) -> define o padrão da lingua que eu vou usar (Padrão americano no caso)
        // Scanner pega input do terminal
        System.out.println("Digite seu nome"); // Faço uma pergunta ao usuário
        String nome = scanner.next(); // Faço uso da iteração com usuário através do método (scanner.next())
                            // next -> para string
        System.out.println("Digite seu sobrenome"); // Faço uma pergunta ao usuário
        String sobrenome = scanner.next(); // Faço uso da iteração com usuário através do método (scanner.next())

        System.out.println("Digite sua idade"); // Faço uma pergunta ao usuário
        int idade = scanner.nextInt(); // Faço uso da iteração com usuário através do método (scanner.nextInt())
                            // nextInt -> para int
        System.out.println("Digite sua altura"); // Faço uma pergunta ao usuário
        double altura = scanner.nextDouble(); // Faço uso da iteração com usuário através do método (scanner.nextDouble())
                        // nextDouble -> para Double
        // Imprimindo dados dos usuários

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase()); // toUpperCase -> retorna o valor da String em letras MAIUSCULAS
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm ");
        scanner.close(); // Fechando o scanner
        }
        catch (InputMismatchException e){ // CATCH, vai tratar meu erro, emitindo mensagem ou solução
            System.out.println("Os campos idade e altura precisam ser numericos");

            // Geralmente a primeira mensagem do meu bloco de excessões eu vou add no bloco "catch", para ser tratado e coloco "e"

        }
    }
}
