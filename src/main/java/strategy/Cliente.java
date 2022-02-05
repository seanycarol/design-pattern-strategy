package strategy;

public class Cliente {
    private String pedido;

    public String getPedido() {
        return pedido;
    }

    public void pedirIFood(String nomeCliente) {
        PlataformaDelivery plataformaDelivery = new PlataformaDelivery(nomeCliente);
        this.pedido = plataformaDelivery.entregarPedido(new DeliveryIFood());
    }

    public void pedirUberEats(String nomeCliente) {
        PlataformaDelivery plataformaDelivery = new PlataformaDelivery(nomeCliente);
        this.pedido = plataformaDelivery.entregarPedido(new DeliveryUberEats());
    }

    public void pedirRappi(String nomeCliente) {
        PlataformaDelivery plataformaDelivery = new PlataformaDelivery(nomeCliente);
        this.pedido = plataformaDelivery.entregarPedido(new DeliveryRappi());
    }
}
