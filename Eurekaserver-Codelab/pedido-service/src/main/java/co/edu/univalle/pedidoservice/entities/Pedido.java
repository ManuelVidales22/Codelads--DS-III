package co.edu.univalle.pedidoservice.entities;


import co.edu.univalle.pedidoservice.Model.ProductoDTO;

public record Pedido(String id, ProductoDTO producto, int cantidad) {
}
