package com.saldarriaga.jsslibros.control;

import com.saldarriaga.jsslibros.modelo.Libro;
import com.saldarriaga.jsslibros.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    private final LibroService service;

    @Autowired
    public LibroController(LibroService service) {
        this.service = service;
    }

    @PostMapping
    public Libro agregar(@RequestBody Libro libro) {
        return service.agregar(libro);
    }

    @GetMapping("/buscar")
    public List<Libro> buscarPorAutor(@RequestParam String autor) {
        return service.buscarPorAutor(autor);
    }
}


