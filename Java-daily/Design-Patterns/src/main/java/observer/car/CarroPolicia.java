package observer.car;

import observer.Observable;
import observer.Observer;

public class CarroPolicia implements Observer, Carro {

    public CarroPolicia() {
    }

    @Override
    public void andar() {
        System.out.println("Carro policia andando..");
    }

    @Override
    public void viraEsquerda() {
        System.out.println("Carro policia vira esquerda..");
    }

    @Override
    public void viraDireita() {
        System.out.println("Carro policia vira direita..");
    }

    @Override
    public void para() {
        System.out.println("Carro policia parou e prendeu os vagabundos..");
    }

    @Override
    public void buzina() {
        System.out.println("Carro policia buzinou..");
    }

    @Override
    public void update(Observable observable, Object arg) {

        String movimento = (String) arg;

        if (movimento.equals("andar")) {
            this.andar();
        }

        if (movimento.equals("viraDireita")) {
            this.viraDireita();
        }

        if (movimento.equals("viraEsquerda")) {
            this.viraEsquerda();
        }

        if (movimento.equals("buzina")) {
            this.buzina();
        }

        if (movimento.equals("para")) {
            this.para();
        }
    }
}
