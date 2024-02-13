package observer.shop;

import observer.Observable;
import observer.Observer;

public class Vendedor implements Observer {


    private void atualizaSituacao() {
        System.out.println("Cliente efetuou uma compra no site com sucesso !! enviando dados para a logistica");
    }


    @Override
    public void update(Observable observable, Object arg) {
        String situacao = (String) arg;

        if (situacao.equals("realizaCompra")) {
            this.atualizaSituacao();
        }
    }


}
