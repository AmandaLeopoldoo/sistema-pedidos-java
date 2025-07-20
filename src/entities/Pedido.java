package entities;

import entities.enums.StatusPedido;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private static DateTimeFormatter dataHoraFormato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime momento;
    private StatusPedido status;

    private Cliente cliente;
    List<ItemsPedido> pedidos = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(LocalDateTime momento, StatusPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public List<ItemsPedido> getPedidos() {
        return pedidos;
    }

    public void addpedido(ItemsPedido pedido){
        pedidos.add(pedido);
    }

    public void removerPedido(ItemsPedido pedido){
        pedidos.remove(pedido);
    }

    public double total(){
        double soma = 0;
        for (ItemsPedido p : pedidos){
            soma += p.subTotal();
        }
        return soma;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nRESUMO DO PEDIDO: ");
        sb.append("\nMomento do Pedido: " + dataHoraFormato.format(momento));
        sb.append("\nStatus do pedido: " + status);
        sb.append("\nClient: " + cliente.getNomeCliente() +" "+ cliente.getDataAniversario() + " - " + cliente.getEmail());
        sb.append("\nItems do pedido: ");
        for (ItemsPedido item : pedidos){
            sb.append("\n" + item + "\n");
        }
        sb.append("Valor total: " + String.format("%.2f", total()));
        return sb.toString();
    }

}
