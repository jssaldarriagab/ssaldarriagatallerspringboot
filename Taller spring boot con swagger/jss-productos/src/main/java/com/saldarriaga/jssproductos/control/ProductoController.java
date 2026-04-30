package com.saldarriaga.jssproductos.control;

import com.saldarriaga.jssproductos.modelo.Producto;
import com.saldarriaga.jssproductos.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService service;

    @Autowired
    public ProductoController(ProductoService service) {
        this.service = service;
    }

    @PostMapping
    public Producto agregar(@RequestBody Producto producto) {
        return service.agregar(producto);
    }

    @GetMapping
    public List<Producto> listar() {
        return service.listar();
    }

    @GetMapping("/buscar")
    public List<Producto> buscarPorCategoria(@RequestParam String categoria) {
        return service.buscarPorCategoria(categoria);
    }
}


