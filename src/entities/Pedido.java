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
    List<ItemPedido> itens = new ArrayList<>();

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

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void addpedido(ItemPedido pedido){
        itens.add(pedido);
    }

    public void removerPedido(ItemPedido pedido){
        itens.remove(pedido);
    }

    public double total(){
        double soma = 0;
        for (ItemPedido p : itens){
            soma += p.subTotal();
        }
        return soma;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n-----------------------------------");
        sb.append("\nRESUMO DO PEDIDO: ");
        sb.append("\n-----------------------------------");
        sb.append("Momento do Pedido: " + dataHoraFormato.format(momento));
        sb.append("\nStatus do pedido: " + status);
        sb.append("\nClient: " + cliente);
        sb.append("\nItems do pedido: ");
        for (ItemPedido item : itens){
            sb.append("\n" + item + "\n");
        }
        sb.append("Valor total: " + String.format("%.2f", total()));
        return sb.toString();
    }

}
