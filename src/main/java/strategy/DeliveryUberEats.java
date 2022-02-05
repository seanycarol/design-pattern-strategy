package strategy;

public class DeliveryUberEats implements Delivery {

    public String entregarPedido(String nomeCliente) {
        return "Entrega de pedido do UberEats para " + nomeCliente;
    }
}
