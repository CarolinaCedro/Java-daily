package observer.car;

import observer.Observable;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class CarroRoubado implements Observable, Carro {

    private List<Observer> observers = new ArrayList<>();

    public CarroRoubado() {
    }

    @Override
    public void andar() {
        System.out.println("Carro roubado andou");
        notifyObservers("andar");
    }

    @Override
    public void viraEsquerda() {
        System.out.println("Carro roubado vira esquerda");

        notifyObservers("viraEsquerda");
    }

    @Override
    public void viraDireita() {
        System.out.println("Carro roubado vira direita");

        notifyObservers("viraDireita");
    }

    @Override
    public void para() {
        System.out.println("Carro roubado para");

        notifyObservers("para");
    }

    @Override
    public void buzina() {
        System.out.println("Carro roubado buzina");

        notifyObservers("buzina");
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
}


