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

    public void adicionarItem(ItemPedido item){
        itens.add(item);
    }

    public void removerItem(ItemPedido item){
        itens.remove(item);
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
        sb.append("\n-----------------------------------\n");
        sb.append("Momento do Pedido: " + dataHoraFormato.format(momento));
        sb.append("\nStatus do pedido: " + status);
        sb.append("\nClient: " + cliente);
        sb.append("\nItens do pedido: \n");
        for (ItemPedido item : itens){
            sb.append(item + "\n");
        }
        sb.append("-----------------------------------");
        sb.append("\nValor total: " + String.format("R$%.2f", total()));
        sb.append("\n-----------------------------------\n");
        return sb.toString();
    }

}
