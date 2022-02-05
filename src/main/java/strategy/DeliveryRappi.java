package strategy;

public class DeliveryRappi implements Delivery {

    public String entregarPedido(String nomeCliente) {
        return "Entrega de pedido do Rappi para " + nomeCliente;
    }
}
