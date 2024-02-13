package observer.car;

public class ServiceCar {
    public static void main(String[] args) {

        CarroPolicia carroPolicia = new CarroPolicia();
        CarroRoubado carroRoubado = new CarroRoubado();

        carroRoubado.addObserver(carroPolicia);

        carroRoubado.andar();
        carroRoubado.buzina();
        carroRoubado.viraDireita();
        carroRoubado.viraEsquerda();
        carroRoubado.para();
    }

}
