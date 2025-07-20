package aplication.utils;

import entities.enums.StatusPedido;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Classe utilitária para validação e leitura de dados no sistema de pedidos.
 */
public class ValidacaoDeDados {

    public static StatusPedido lerStatusPedido(Scanner sc){
        StatusPedido statusPedido = null;
        while (statusPedido == null){
            System.out.print("Status do pedido (PAGAMENTO_PENDENTE, PROCESSANDO, ENVIADO, ENTREGUE): ");
            String status = sc.nextLine().toUpperCase();
            try {
                statusPedido = StatusPedido.valueOf(status);
            } catch (IllegalArgumentException e) {
                System.out.println("Status inválido! Use PAGAMENTO_PENDENTE, PROCESSANDO, ENVIADO ou ENTREGUE.");
            }
        }
        return statusPedido;
    }

    public static LocalDate lerDataAniversario(Scanner sc, DateTimeFormatter formatter){
        LocalDate dataAniversario = null;
        boolean dataValida = false;
        while (!dataValida){
            System.out.print("Data de nascimento (DD/MM/AAAA): ");
            String data = sc.nextLine();
            try {
                dataAniversario = LocalDate.parse(data, formatter);
                dataValida = true;
            } catch (Exception e){
                System.out.println("Data inválida! Use o formato (DD/MM/AAAA).");
            }
        }
        return dataAniversario;
    }

    public static boolean emailValido(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email != null && email.matches(emailRegex);
    }

    public static String lerEmailValido(Scanner sc) {
        String email;
        boolean emailValido = false;
        do {
            System.out.print("Digite o e-mail: ");
            email = sc.nextLine();
            if (!ValidacaoDeDados.emailValido(email)) {
                System.out.println("E-mail inválido! Tente novamente.");
            } else {
                emailValido = true;
            }
        } while (!emailValido);
        return email;
    }

    public static int lerQuantidadeItens(Scanner sc){
        int quantidade = 0;
        boolean quantidadeValida = false;
        while (!quantidadeValida){
            System.out.print("Qual a quantidade de itens do pedido? ");
            try {
                quantidade = Integer.parseInt(sc.nextLine());
                if (quantidade <= 0){
                    System.out.println("A quantidade não pode ser zero ou negativa.");
                } else {
                    quantidadeValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite uma quantidade válida!");
            }
        }
        return quantidade;
    }

    public static int lerQuantidade(Scanner sc){
        int quantidade = 0;
        boolean quantidadeValida = false;
        while (!quantidadeValida){
            System.out.print("Quantidade: ");
            try {
                quantidade = Integer.parseInt(sc.nextLine());
                if (quantidade <= 0){
                    System.out.println("A quantidade não pode ser zero ou negativa.");
                } else {
                    quantidadeValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite uma quantidade válida!");
            }
        }
        return quantidade;
    }

    public static double lerPreco(Scanner sc){
        double preco = 0;
        boolean precoValido = false;
        while (!precoValido){
            System.out.print("Preço do produto: ");
            try {
                preco = Double.parseDouble(sc.nextLine());
                if (preco < 0) {
                    System.out.println("O preço não pode ser negativo!");
                } else {
                    precoValido = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite um valor numérico para o preço.");
            }
        }
        return preco;
    }
}