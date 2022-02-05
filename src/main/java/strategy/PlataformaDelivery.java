package strategy;

public class PlataformaDelivery {
    private String nomeCliente;

    public PlataformaDelivery(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String entregarPedido(Delivery delivery) {
        return delivery.entregarPedido(nomeCliente);
    }
}
