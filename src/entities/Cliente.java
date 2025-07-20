package entities;

import java.time.LocalDate;

public class Cliente {

    private String nomeCliente;
    private String email;
    private LocalDate dataAniversario;

    public Cliente() {
    }

    public Cliente(String nomeCliente, String email, LocalDate dataAniversario) {
        this.nomeCliente = nomeCliente;
        this.email = email;
        this.dataAniversario = dataAniversario;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(LocalDate dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    @Override
    public String toString() {
        return nomeCliente + " (" + dataAniversario + ") - " + email;
    }
}
