package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarPedidoIFoodCliente() {
        Cliente cliente = new Cliente();
        cliente.pedirIFood("Ana");
        assertEquals("Entrega de pedido do IFood para Ana", cliente.getPedido());
    }

    @Test
    void deveRetornarPedidoUberEatsCliente() {
        Cliente cliente = new Cliente();
        cliente.pedirUberEats("Ana");
        assertEquals("Entrega de pedido do UberEats para Ana", cliente.getPedido());
    }

    @Test
    void deveRetornarPedidoRappiCliente() {
        Cliente cliente = new Cliente();
        cliente.pedirRappi("Ana");
        assertEquals("Entrega de pedido do Rappi para Ana", cliente.getPedido());
    }
}