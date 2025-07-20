package aplication;

import aplication.utils.ValidacaoDeDados;
import entities.Cliente;
import entities.ItemsPedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.StatusPedido;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        LocalDateTime datahora = LocalDateTime.now();
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite as informações do cliente: ");
        System.out.print("Name: ");
        String nome = sc.nextLine();

        String email = ValidacaoDeDados.lerEmailValido(sc);
        LocalDate dataAniversario = ValidacaoDeDados.lerDataAniversario(sc,dataFormatada);

        Cliente cliente = new Cliente(nome,email,dataAniversario);

        System.out.println("\nDigite os dados do pedido: ");
        StatusPedido status = ValidacaoDeDados.lerStatusPedido(sc);
        int items = ValidacaoDeDados.lerQuantidadeItems(sc);


        Pedido pedido = new Pedido(datahora,status,cliente);

        for (int i = 0; i < items; i++){
            System.out.printf("Digite os dados do #%d item: ", i + 1);
            System.out.print("\nNome do produto: ");
            String nomePedido = sc.nextLine();
            double preco = ValidacaoDeDados.lerPreco(sc);
            int quantidade = ValidacaoDeDados.lerQuantidade(sc);

            Produto produto = new Produto(nomePedido, preco);
            ItemsPedido itemspedido = new ItemsPedido(quantidade,preco,produto);
            pedido.addpedido(itemspedido);
        }

        System.out.println(pedido);



        sc.close();
    }
}
