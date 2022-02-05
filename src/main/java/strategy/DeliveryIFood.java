package strategy;

public class DeliveryIFood implements Delivery {

    public String entregarPedido(String nomeCliente) {
        return "Entrega de pedido do IFood para " + nomeCliente;
    }
}
