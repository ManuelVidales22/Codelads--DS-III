package co.edu.univalle.pedidoservice.Controller;

import co.edu.univalle.pedidoservice.Model.ProductoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "producto-service")
public interface ProductoClient {

    @GetMapping("/productos/productos")
    List<ProductoDTO> obtenerProductos();
}
