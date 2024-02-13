package observer.shop;

public class ShopService {

    public static void main(String[] args) {
        Produto produto = new Produto("Televisao", 1, "3000.00");
        Cliente cliente = new Cliente("Ana","Pendente");

        Vendedor vendedor = new Vendedor();

        cliente.addObserver(vendedor);

        cliente.realizaCompra(produto,cliente);

    }


}
