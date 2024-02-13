package observer.shop;

import observer.Observable;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements Observable {

    private List<Observer> observers = new ArrayList<>();


    private String nome;
    private String statusPedido;


    public Cliente(String nome, String statusPedido) {
        this.nome = nome;
        this.statusPedido = statusPedido;
    }

    public void realizaCompra(Produto produto, Cliente cliente) {
        System.out.println("Cliente: " + cliente.nome + " realizou a compra de: " + produto.getNome());
        this.notifyObservers("realizaCompra");
    }


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers(Object arg) {
        for (Observer observer : observers) {
            observer.update(this, arg);
        }
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", statusPedido='" + statusPedido + '\'' +
                '}';
    }
}
