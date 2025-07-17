package entities;

import entities.enums.StatusPedido;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private LocalDateTime momento;
    private StatusPedido status;

    List<ItemsPedido> pedidos = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(LocalDateTime momento, StatusPedido status) {
        this.momento = momento;
        this.status = status;
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

}
