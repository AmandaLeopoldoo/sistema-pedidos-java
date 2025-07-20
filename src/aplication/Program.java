package aplication;

import aplication.utils.ValidacaoDeDados;
import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.StatusPedido;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        LocalDateTime datahora = LocalDateTime.now();
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite as informações do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        String email = ValidacaoDeDados.lerEmailValido(sc);
        LocalDate dataAniversario = ValidacaoDeDados.lerDataAniversario(sc,dataFormatada);

        Cliente cliente = new Cliente(nome,email,dataAniversario);

        System.out.println("\nDigite os dados do pedido:");
        StatusPedido status = ValidacaoDeDados.lerStatusPedido(sc);
        int quantidadeItens = ValidacaoDeDados.lerQuantidadeItens(sc);


        Pedido pedido = new Pedido(datahora,status,cliente);

        for (int i = 0; i < quantidadeItens; i++){
            System.out.printf("\nDigite os dados do #%d item: \n", i + 1);
            System.out.print("Nome do produto: ");
            String nomeProduto = sc.nextLine();
            double preco = ValidacaoDeDados.lerPreco(sc);
            int quantidade = ValidacaoDeDados.lerQuantidade(sc);

            Produto produto = new Produto(nomeProduto, preco);
            ItemPedido itemPedido = new ItemPedido(quantidade,preco,produto);
            pedido.adicionarItem(itemPedido);
        }

        System.out.println(pedido);

        sc.close();
    }
}
