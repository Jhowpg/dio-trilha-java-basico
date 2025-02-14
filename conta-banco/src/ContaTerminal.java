import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        List<String> dados = new ArrayList<>();
        List<String> textos = List.of(

                "Por favor, digitar o seu nome e sobrenome",
                "Por favor, insira o número da sua conta:",
                "Por favor, insira o número da sua agencia",
                "Por favor, informar o saldo da sua conta");

        for (String mensagem : textos) {
            System.out.println(mensagem);
            String entrada = scanner.nextLine();
            dados.add(entrada);
        }

        String mensagemFinal = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, o número da sua coanta é %s, agência %s e seu saldo %s já está disponível para saque.",
                dados.get(0), // Nome Cliente
                dados.get(1), // Agência
                dados.get(2), // Número da Conta
                dados.get(3) // Saldo
        );

        System.out.println(mensagemFinal);

        scanner.close();
    }
}
