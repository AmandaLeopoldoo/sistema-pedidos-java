package aplication.utils;

import entities.enums.StatusPedido;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ValidacaoDeDados {

    public static StatusPedido lerStatusPedido(Scanner sc){
        StatusPedido statusPedido = null;
        while (statusPedido == null){
            System.out.print("Nível: ");
            String status = sc.nextLine().toUpperCase();
            try {
                statusPedido = StatusPedido.valueOf(status);
            } catch (IllegalArgumentException e) {
                System.out.println("Status inválido! Use PAGAMENTO_PENDENTE, PROCESSANDO, ENVIADO, ENTREGUE.");
            }
        }
        return statusPedido;
    }

    public static LocalDate lerDataAniversario(Scanner sc, DateTimeFormatter formatter){
        LocalDate dataAniversario = null;
        boolean dataValida = false;
        while (!dataValida){
            System.out.println("Data (DD/MM/AAAA): ");
            String data = sc.nextLine();
            try {
                dataAniversario = LocalDate.parse(data, formatter);
                dataValida = true;
            } catch (Exception e){
                System.out.println("Data inválida! Use o formato (DD/MM/AAAA).");
            }
        }
        return  dataAniversario;
    }

    public static boolean emailValido(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email != null && email.matches(emailRegex);
    }

    public static int lerQuantidadeItems(Scanner sc){
        int quantidade = 0;
        boolean quantidadeValida = false;
        while (!quantidadeValida){
            System.out.println("Qual a quantidade de items do pedido? ");
            try {
                quantidade = Integer.parseInt(sc.nextLine());
                if (quantidade <= 0){
                    System.out.println("A quantidade não pode ser zero ou negativo!.");
                } else {
                    quantidadeValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite uma quantidade válida!.");
            }
        }
        return quantidade;
    }

    public static int lerQuantidade(Scanner sc){
        int quantidade = 0;
        boolean quantidadeValida = false;
        while (!quantidadeValida){
            System.out.println("Quantidade: ");
            try {
                quantidade = Integer.parseInt(sc.nextLine());
                if (quantidade <= 0){
                    System.out.println("A quantidade não pode ser zero ou negativo!.");
                } else {
                    quantidadeValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite a quantidade: ");
            }
        }
        return quantidade;
    }

    public static double lerPreco(Scanner sc){
        double preco = 0;
        boolean precovalido = false;
        while (!precovalido){
            System.out.println("Preço do produto: ");
            try {
                preco = Double.parseDouble(sc.nextLine());
                if (preco < 0) {
                    System.out.println("O preço não pode ser negativo!.");
                } else {
                    precovalido = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite um valor numérico para o salário.");
            }
        }
        return preco;
    }

}

